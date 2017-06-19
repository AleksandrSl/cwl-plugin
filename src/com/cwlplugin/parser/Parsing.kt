package com.cwlplugin.parser

import com.cwlplugin.CwlBundle
import com.cwlplugin.psi.CwlElementType
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
            nameExpected.error("PARSE.expected.identifier") // TODO Do I need bundle?
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
        if (checkMatches(CwlTokenTypes.STATEMENT_BREAK, "Statement break expected")) {
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

    fun parseColonAndIndentedBlock(blockType: IElementType, parseIndentedBlock: () -> Unit): Unit {
        val block: PsiBuilder.Marker = myBuilder.mark()
        nextToken()
        checkMatches(CwlTokenTypes.COLON, CwlBundle.message("PARSE.expected.colon"))
        parseIndentedBlock()
        block.done(blockType)
    }

    fun reportParseStatementError(builder: PsiBuilder, firstToken: IElementType) {
        if (firstToken === CwlTokenTypes.INCONSISTENT_DEDENT) {
            builder.error("Unindent does not match any outer indentation level")
        } else if (firstToken === CwlTokenTypes.INDENT) {
            builder.error("Unexpected indent")
        } else {
            builder.error("Statement expected, found " + firstToken.toString())
        }
    }
}