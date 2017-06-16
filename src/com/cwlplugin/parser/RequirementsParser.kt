package com.cwlplugin.parser

import com.cwlplugin.parser.CwlTokenTypes.REQUIREMENTS_KEYWORD
import com.cwlplugin.psi.CwlElementType
import com.cwlplugin.psi.CwlTypes
import com.intellij.CommonBundle
import com.intellij.CommonBundle.message
import com.intellij.lang.PsiBuilder
import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.PropertyKey
import java.util.ResourceBundle.getBundle

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class RequirementsParser(context: ParsingContext) : Parsing(context) {

    fun parsePrimaryRequirements(): Boolean {
        val firstToken: IElementType? = myBuilder.tokenType
        if (firstToken != null) {
            with(CwlTokenTypes) {
                when (firstToken) {
                    REQUIREMENTS_KEYWORD -> {
//                        buildTokenElement(CwlElementTypes.TARGET_REQUIREMENTS_BLOCK, myBuilder)
                        parseRequirements()
                        return true
                    }
                    else -> return false
                }
            }
        }
        return false
    }

    fun parseRequirementsDeclaration(): Unit {
        myBuilder.advanceLexer()
        checkMatches(CwlTokenTypes.COLON, message("PARSE.expected.colon"))
        val context: ParsingContext = parsingContext
        context.pushScope(context.currentScope.withRequirements())
        parseSingleRequirement()
        context.popScope()
    }

    fun parseSingleRequirement(): Unit {
        while (myBuilder.tokenType === CwlTokenTypes.STATEMENT_BREAK) {
            myBuilder.advanceLexer()
        }
        val firstToken: IElementType = myBuilder.tokenType ?: return
        with(CwlTokenTypes) {
            assertCurrentToken(CLASS_KEYWORD)
            val singleRequirement: PsiBuilder.Marker = myBuilder.mark()
            myBuilder.advanceLexer()
            if (!true) {
                myBuilder.error("requirement expected")
            }
            parse
        }
    }

    private fun parseColonAndSuite() {
        if (expectColon()) {
            parseSuite()
        } else {
            val mark = myBuilder.mark()
            mark.done(PyElementTypes.STATEMENT_LIST)
        }
    }
}


