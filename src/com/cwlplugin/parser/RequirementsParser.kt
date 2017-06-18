package com.cwlplugin.parser

import com.cwlplugin.CwlBundle.message
import com.intellij.lang.ITokenTypeRemapper
import com.intellij.lang.PsiBuilder
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.tree.IElementType

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class RequirementsParser(context: ParsingContext) : Parsing(context), ITokenTypeRemapper {

    override fun filter(source: IElementType?, start: Int, end: Int, text: CharSequence?): IElementType {
        return source!!
    }

    private val LOG = Logger.getInstance(RequirementsParser::class.java.name)

    fun reportParseStatementError(builder: PsiBuilder, firstToken: IElementType) {
        if (firstToken === CwlTokenTypes.INCONSISTENT_DEDENT) {
            builder.error("Unindent does not match any outer indentation level")
        } else if (firstToken === CwlTokenTypes.INDENT) {
            builder.error("Unexpected indent")
        } else {
            builder.error("Statement expected, found " + firstToken.toString())
        }
    }

    fun parsePrimaryRequirements(): Boolean {
        val firstToken: IElementType? = myBuilder.tokenType
        if (firstToken != null) {
            with(CwlTokenTypes) {
                when (firstToken) {
                    REQUIREMENTS_KEYWORD -> {
//                        buildTokenElement(CwlElementTypes.TARGET_REQUIREMENTS_BLOCK, myBuilder)
                        parseRequirementsBlock()
                        return true
                    }
                    else ->{ reportParseStatementError(myBuilder, firstToken); return false}
                }
            }
        }
        return false
    }

    /**
     * Parse all requirements statements and trailing COLON after requirements keyword
     */
    fun parseRequirementsBlock(): Unit {
        val requirementsBlock: PsiBuilder.Marker = myBuilder.mark()
        nextToken()
        checkMatches(CwlTokenTypes.COLON, message("PARSE.expected.colon"))
        parseRequirementsList()
        requirementsBlock.done(CwlElementTypes.REQUIREMENTS_BLOCK)
    }

    fun parseRequirementsList() : Unit{
        // TODO When new line
        if (myBuilder.tokenType == CwlTokenTypes.STATEMENT_BREAK) {
            myBuilder.error("STATEMENT_BREAK IS FOUND")
            nextToken()
            val indentFound = myBuilder.tokenType == CwlTokenTypes.INDENT
            if (indentFound) {
                nextToken()
                println("parseRequirementsList:1:${myBuilder.tokenType}")
                if (myBuilder.eof()) {
                    myBuilder.error("Indented block expected")
                } else {
                    while (!myBuilder.eof() && myBuilder.tokenType !== CwlTokenTypes.DEDENT) {
                        if (!parseRequirement()) break
                        println("parseRequirementsList:2:${myBuilder.tokenType}")
                    }
                }
            } else {
                myBuilder.error("Indent expected")
            }
            if (indentFound && !myBuilder.eof()) {
                checkMatches(CwlTokenTypes.DEDENT, "Dedent expected")
            }
        } else {myBuilder.error("WTF!! ${myBuilder.tokenType}")}

    }

    /**
     * Parse requirement statement class: requirement
     *
     * All current token should already be matched
     * New token is generated at function beginning
     */
    protected fun parseRequirement(): Boolean {

        if (!checkMatches(CwlTokenTypes.CLASS_KEYWORD, "Class keyword expected")) return false
//        if (!matchToken(CwlTokenTypes.CLASS_KEYWORD)) return
        val requirement = myBuilder.mark()
        if (!checkMatches(CwlTokenTypes.COLON, "Colon keyword expected")) { requirement.drop(); return false}
        if (!checkMatches(CwlTokenTypes.INLINE_JAVASCRIPT_REQUIREMENT_KEYWORD, "InlineJavascriptRequirement keyword expected")) { requirement.drop(); return false}
        requirement.done(CwlElementTypes.INLINE_JAVASCRIPT_REQUIREMENT)
//        requirement.done(CwlTokenTypes.INLINE_JAVASCRIPT_REQUIREMENT_KEYWORD) // TODO
        return true
    }
}


