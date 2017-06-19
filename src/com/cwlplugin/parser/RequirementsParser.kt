package com.cwlplugin.parser

import com.cwlplugin.CwlBundle.message
import com.cwlplugin.psi.CwlElement
import com.cwlplugin.psi.CwlElementType
import com.cwlplugin.psi.CwlElementTypes
import com.intellij.lang.PsiBuilder
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.tree.IElementType

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class RequirementsParser(context: ParsingContext) : Parsing(context) {

    private val LOG = Logger.getInstance(RequirementsParser::class.java.name)


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
                    else -> {
                        reportParseStatementError(myBuilder, firstToken); return false
                    }
                }
            }
        }
        return false
    }

    /**
     * Parse all requirements statements and trailing COLON after requirements keyword
     */
    fun parseRequirementsBlock(): Unit {
        parseColonAndIndentedBlock(CwlElementTypes.REQUIREMENTS_BLOCK, this::parseRequirementsList)
        val requirementsBlock: PsiBuilder.Marker = myBuilder.mark()
        nextToken()
        checkMatches(CwlTokenTypes.COLON, message("PARSE.expected.colon"))
        parseRequirementsList()
        requirementsBlock.done(CwlElementTypes.REQUIREMENTS_BLOCK)
    }



    fun parseRequirementsList(): Unit {
        return parseIndentedBlock(CwlElementTypes.REQUIREMENT_LIST, this::parseRequirement)
    }

    /**
     * Parse requirement statement
     *
     *  class: requirement
     */
    protected fun parseRequirement(): Boolean {

        println("parseRequirement:: ${myBuilder.tokenType}")
        if (!checkMatches(CwlTokenTypes.CLASS_KEYWORD, "Class keyword expected", advanceLexer = false)) return false
        val requirement = myBuilder.mark()
        nextToken()
        if (!checkMatches(CwlTokenTypes.COLON, message("PARSE.expected.colon"))) {
            requirement.drop(); return false
        }
        val requirementType: CwlElementType = when (myBuilder.tokenType) {
            CwlTokenTypes.INLINE_JAVASCRIPT_REQUIREMENT_KEYWORD -> CwlElementTypes.INLINE_JAVASCRIPT_REQUIREMENT
            CwlTokenTypes.DOCKER_REQUIREMENT_KEYWORD -> CwlElementTypes.DOCKER_REQUIREMENT
            CwlTokenTypes.SCHEMA_DEF_REQUIREMENT_KEYWORD ->  CwlElementTypes.SCHEMA_DEF_REQUIREMENT
            CwlTokenTypes.INITIAL_WORKDIR_REQUIREMENT_KEYWORD ->  CwlElementTypes.INITIAL_WORKDIR_REQUIREMENT
            CwlTokenTypes.RESOURCE_REQUIREMENT_KEYWORD ->  CwlElementTypes.RESOURCE_REQUIREMENT
            CwlTokenTypes.ENV_VAR_REQUIREMENT_KEYWORD ->  CwlElementTypes.ENV_VAR_REQUIREMENT
            CwlTokenTypes.SHELL_COMMAND_REQUIREMENT_KEYWORD ->  CwlElementTypes.SHELL_COMMAND_REQUIREMENT
            CwlTokenTypes.SOFTWARE_REQUIREMENT_KEYWORD ->  CwlElementTypes.SOFTWARE_REQUIREMENT
            else -> {
                myBuilder.error("Requirement expected")
                requirement.drop(); return false
            }
        }
        nextToken()
        requirement.done(requirementType)
        return true
    }
}


