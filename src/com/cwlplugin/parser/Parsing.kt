package com.cwlplugin.parser

import com.cwlplugin.CwlBundle
import com.cwlplugin.psi.CwlElementType
import com.cwlplugin.psi.CwlElementTypes
import com.intellij.lang.PsiBuilder
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.tree.IElementType

/**
 * @author yole, Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
open class Parsing(val parsingContext: ParsingContext) {

    private val LOG = Logger.getInstance(Parsing::class.java.name)

    protected val myBuilder: PsiBuilder = parsingContext.builder

    val requirementsParser = parsingContext.requirementsParser

    protected fun checkMatches(token: IElementType, message: String, advanceLexer: Boolean = true): Boolean {

        if (myBuilder.tokenType == token) {  // == is used instead of equals in python source
            if (advanceLexer) myBuilder.advanceLexer()
            return true
        }
        myBuilder.error(message)
        return false
    }

    protected fun parseIdentifierOrSkip(vararg validSuccessiveTokens: IElementType): Boolean {

        if (myBuilder.tokenType === CwlTokenTypes.IDENTIFIER) {  // == is used instead of equals in python source
            myBuilder.advanceLexer()
            return true
        } else {
            val nameExpected = myBuilder.mark()
            if (myBuilder.tokenType !== CwlTokenTypes.STATEMENT_BREAK && !atAnyOfTokens(*validSuccessiveTokens)) {
                myBuilder.advanceLexer()
            }
            nameExpected.error("PARSE.expected.identifier")
            return false
        }
    }

    protected fun assertCurrentToken(tokenType: CwlElementType) {
        LOG.assertTrue(myBuilder.tokenType === tokenType)
    }

    protected fun atToken(tokenType: IElementType?): Boolean {
        return myBuilder.tokenType === tokenType
    }

    protected fun atToken(tokenType: IElementType, tokenText: String): Boolean {
        return myBuilder.tokenType === tokenType && tokenText == myBuilder.tokenText
    }

    protected fun atAnyOfTokens(vararg tokenTypes: IElementType?): Boolean {
        val currentTokenType = myBuilder.tokenType
        return tokenTypes.any { currentTokenType === it }
    }

    protected fun matchToken(tokenType: IElementType): Boolean {
        if (myBuilder.tokenType === tokenType) {
            myBuilder.advanceLexer()
            return true
        }
        return false
    }

    protected fun nextToken() {
        myBuilder.advanceLexer()
    }

    protected fun buildTokenElement(type: IElementType, builder: PsiBuilder) {
        val marker = builder.mark()
        builder.advanceLexer()
        marker.done(type)
    }

//    protected fun getReferenceType(): IElementType {
//        return CwlElementTypes.REFERENCE_EXPRESSION
//    }

    fun parseIndentedBlock(blockType: IElementType, parseStatement: () -> Boolean): Unit {
        if (checkMatches(CwlTokenTypes.LINE_BREAK, "Line break expected")) {
            println("Instead indent: ${myBuilder.tokenType}")
            if (checkMatches(CwlTokenTypes.INDENT, "Indent expected", advanceLexer = false)) {
                val indentedBlock: PsiBuilder.Marker = myBuilder.mark()
                nextToken()
                if (myBuilder.eof()) {
                    myBuilder.error("Indented block expected")
                } else {
                    while (!myBuilder.eof() && myBuilder.tokenType !== CwlTokenTypes.DEDENT) {
                        if (!parseStatement()) break
                    }
                }
                indentedBlock.done(blockType)
                if (!myBuilder.eof()) {
                    checkMatches(CwlTokenTypes.DEDENT, "Dedent expected")
                }
            }
        }
    }

    fun parseIndentedBlock(parseStatement: () -> Boolean): Unit {
        if (checkMatches(CwlTokenTypes.LINE_BREAK, "Line break expected")) {
            println("Instead indent: ${myBuilder.tokenType}")
            if (checkMatches(CwlTokenTypes.INDENT, "Indent expected", advanceLexer = false)) {
                nextToken()
                if (myBuilder.eof()) {
                    myBuilder.error("Indented block expected")
                } else {
                    while (!myBuilder.eof() && myBuilder.tokenType !== CwlTokenTypes.DEDENT) {
                        if (!parseStatement()) break
                    }
                }
                if (!myBuilder.eof()) {
                    checkMatches(CwlTokenTypes.DEDENT, "Dedent expected")
                }
            }
        }
    }

    fun parseColonAndIndentedBlock(blockType: IElementType, parseIndentedBlock: () -> Unit): Unit {
        val block: PsiBuilder.Marker = myBuilder.mark()
        nextToken()
        checkMatches(CwlTokenTypes.COLON, CwlBundle.message("PARSE.expected.colon"))
        parseIndentedBlock()
        block.done(blockType)
    }

    fun reportParseStatementError(builder: PsiBuilder, firstToken: IElementType) {
        when(firstToken) {
            CwlTokenTypes.INCONSISTENT_DEDENT -> {
                builder.error("Unindent does not match any outer indentation level")
            }
            CwlTokenTypes.INDENT -> {
                builder.error("Unexpected indent")
            }
            else -> {
                builder.error("Statement expected, found " + firstToken.toString())
            }
        }
    }

    /**
     * Parse simple statements like key: value
     * Note: First token is already matched
     */
    fun parseSimpleStatement(secondToken: IElementType, statementElement: IElementType): Boolean {

        val statement: PsiBuilder.Marker = myBuilder.mark()
        nextToken()
        if (!checkMatches(CwlTokenTypes.COLON, CwlBundle.message("PARSE.expected.colon"))) {
            statement.drop(); return false
        }
        if (!checkMatches(secondToken, "$secondToken expected")) {
            statement.drop(); return false
        }
        statement.done(statementElement)
        return checkMatches(CwlTokenTypes.LINE_BREAK, "Line break expected")
    }

    fun parseSimpleStatement(secondToken: IElementType): Boolean {

        nextToken()
        if (!checkMatches(CwlTokenTypes.COLON, CwlBundle.message("PARSE.expected.colon"))) return false
        if (!checkMatches(secondToken, "$secondToken expected")) return false
        return checkMatches(CwlTokenTypes.LINE_BREAK, "Line break expected")
    }

    /**
     * @param simplified  If true sequence element prefix will be omitted
     */
    fun parseSequence(blockType: IElementType, parseElement: () -> Boolean, simplified: Boolean = false): Boolean {

        if (checkMatches(CwlTokenTypes.LINE_BREAK, CwlBundle.message("PARSE.expected.line_break"))) {
            println("Instead indent: ${myBuilder.tokenType}")
            if (checkMatches(CwlTokenTypes.INDENT, "Indent expected", advanceLexer = false)) {
                val indentedBlock: PsiBuilder.Marker = myBuilder.mark()
                nextToken()
                if (myBuilder.eof()) {
                    myBuilder.error("Indented block expected")
                } else {
                    if (!simplified) {
                        checkMatches(CwlTokenTypes.SEQUENCE_ELEMENT_PREFIX, CwlBundle.message("PARSE.expected.sequence_element_prefix"))
                    }
                    parseElement()
                    while (!myBuilder.eof() && !atToken(CwlTokenTypes.DEDENT)) {
                        print("Parse Sequence: At token ${myBuilder.tokenType}")
                        if (!simplified && !checkMatches(CwlTokenTypes.SEQUENCE_ELEMENT_PREFIX, CwlBundle.message("PARSE.expected.sequence_element_prefix_or_dedent"))) break
                        if (!parseElement()) break
                    }
                    print("escaped!")
                }

                if (!myBuilder.eof()) {
                    checkMatches(CwlTokenTypes.DEDENT, "Dedent expected")
                }
                indentedBlock.done(blockType)
            }
        }
        return true
    }

    fun parseKeyValue(parseValue: () -> Unit): Unit {

        nextToken() // Skip key th is already matched
        if (!checkMatches(CwlTokenTypes.COLON, CwlBundle.message("PARSE.expected.colon"))) return
        parseValue()
        return
    }

    fun parseKeyValue(statementElement: IElementType, parseValue: () -> Unit): Unit {

        val statement: PsiBuilder.Marker = myBuilder.mark()
        nextToken() // Skip key that is already matched
        if (!checkMatches(CwlTokenTypes.COLON, CwlBundle.message("PARSE.expected.colon"))) {
//            statement.drop()
//            return
        }
        parseValue()
        statement.done(statementElement)
        return
    }

    fun checkKeyValue(parseValue: () -> Boolean): Boolean {

        nextToken() // Skip key that is already matched
        if (!checkMatches(CwlTokenTypes.COLON, CwlBundle.message("PARSE.expected.colon"))) return false
        return parseValue()
    }


    fun parseFlowSequence(blockType: IElementType, elementType: CwlElementType): Boolean {
        nextToken()
        with(CwlTokenTypes) {
            if (!checkMatches(COLON, CwlBundle.message("PARSE.expected.colon"))) return false
            if (!checkMatches(LBRACKET, CwlBundle.message("PARSE.expected.lbracket"))) return false
            if (!checkMatches(elementType, "Empty sequence")) return false
            while (!atToken(RBRACKET)) {
                println("in do statement")
                if (!checkMatches(COMMA, CwlBundle.message("PARSE.expected.comma"))) return false
                if (!checkMatches(elementType, "$elementType expected")) return false
            }
            if (!checkMatches(RBRACKET, CwlBundle.message("PARSE.expected.rbracket"))) return false
        }
        return checkMatches(CwlTokenTypes.LINE_BREAK, CwlBundle.message("PARSE.expected.line_break"))
    }

    fun parseFlowMapping(blockType: IElementType, parseStatement: () -> Boolean): Boolean {
        nextToken()
        with(CwlTokenTypes) {
            if (!checkMatches(COLON, CwlBundle.message("PARSE.expected.colon"))) return false
            if (!checkMatches(LBRACE, CwlBundle.message("PARSE.expected.lbracket"))) return false
            if (!parseStatement()) return false
            while (!atToken(RBRACKET)) {
                println("in do statement")
                if (!checkMatches(COMMA, CwlBundle.message("PARSE.expected.comma"))) return false
                if (!parseStatement()) return false
            }
            if (!checkMatches(RBRACE, CwlBundle.message("PARSE.expected.rbracket"))) return false
        }
        return checkMatches(CwlTokenTypes.LINE_BREAK, CwlBundle.message("PARSE.expected.line_break"))
    }

    fun parseIntValue(): Boolean {
        checkMatches(CwlTokenTypes.INT, CwlBundle.message("PARSE.expected.int"))
        return checkMatches(CwlTokenTypes.LINE_BREAK, CwlBundle.message("PARSE.expected.line_break"))
    }

    fun parseBoolValue(): Boolean {
        checkMatches(CwlTokenTypes.BOOLEAN, CwlBundle.message("PARSE.expected.bool"))
        return checkMatches(CwlTokenTypes.LINE_BREAK, CwlBundle.message("PARSE.expected.line_break"))
    }

    fun parseStringValue(): Boolean {

        with(CwlTokenTypes) {
            when (myBuilder.tokenType) {
                PIPE -> {
                    nextToken()
                    val multiLineString: PsiBuilder.Marker = myBuilder.mark()
                    if (!parseMultiLineString()) {
                        multiLineString.drop()
                        return false
                    }
                    multiLineString.done(CwlElementTypes.MULTI_LINE_STRING)
                    return true
                }
                STRING -> {
                    nextToken()
                    return checkMatches(LINE_BREAK, CwlBundle.message("PARSE.expected.line_break"))
                }
                else -> {
                    myBuilder.error("PARSE.expected.string")
                    return false
                }
            }
        }
    }




    fun parseMultiLineString(): Boolean {
        with(CwlTokenTypes) {
            if (!checkMatches(LINE_BREAK, CwlBundle.message("PARSE.expected.line_break"))) return false
            if (!checkMatches(INDENT, "Indent expected")) return false
            if (!checkMatches(MLSPART, "Start of mls expected")) return false
            if (!checkMatches(LINE_BREAK, CwlBundle.message("PARSE.expected.line_break"))) return false
            while (!atToken(DEDENT)) {
                println("in do statement")
                if (!checkMatches(MLSPART, "Dedent or mls expected")) return false
                if (!checkMatches(LINE_BREAK, CwlBundle.message("PARSE.expected.line_break"))) return false
            }
            if (!checkMatches(DEDENT, "End of mls expected")) return false
        }
        return true
    }
}