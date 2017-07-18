package com.cwlplugin.parser

import com.cwlplugin.CwlBundle.message
import com.cwlplugin.psi.CwlElementType
import com.cwlplugin.psi.CwlElementTypes
import com.intellij.lang.PsiBuilder
import com.intellij.openapi.diagnostic.Logger

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class RequirementsParser(context: ParsingContext) : Parsing(context) {

    private val LOG = Logger.getInstance(RequirementsParser::class.java.name)

    /**
     * Parse all requirements statements and trailing COLON after requirements keyword
     */
    fun parseRequirementsBlock(): Unit {
        parseKeyValue(CwlElementTypes.REQUIREMENTS_BLOCK, this::parseRequirementsSequence)
    }

    fun parseRequirementsSequence(): Unit {
        parseSequence(CwlElementTypes.REQUIREMENT_LIST, parseElement = this::parseRequirement)
    }

    protected fun parseRequirement(): Boolean {
        return if (checkMatches(CwlTokenTypes.CLASS_KEYWORD, "Class keyword expected", advanceLexer = false)) {
            checkKeyValue(this::parseRequirementStatement)
        } else false
    }

    /**
     * Parse requirement statement
     *
     *  class: requirement
     */
    protected fun parseRequirementStatement(): Boolean {

        println("parseRequirement:: ${myBuilder.tokenType}")

        with(CwlTokenTypes) {
            val requirementType: CwlElementType = when (myBuilder.tokenType) {
                INLINE_JAVASCRIPT_REQUIREMENT_KEYWORD -> {
                    // TODO
                    nextToken()
                    checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break"))
                    CwlElementTypes.INLINE_JAVASCRIPT_REQUIREMENT
                }
                DOCKER_REQUIREMENT_KEYWORD -> {
                    val statement: PsiBuilder.Marker = myBuilder.mark()
                    parseDockerRequirement()
                    statement.done(CwlElementTypes.DOCKER_REQUIREMENT)
                    CwlElementTypes.DOCKER_REQUIREMENT
                }
                SCHEMA_DEF_REQUIREMENT_KEYWORD -> {
                    // TODO
                    nextToken()
                    checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break"))
                    CwlElementTypes.SCHEMA_DEF_REQUIREMENT
                }
                INITIAL_WORKDIR_REQUIREMENT_KEYWORD -> {
                    // TODO
                    nextToken()
                    checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break"))
                    CwlElementTypes.INITIAL_WORKDIR_REQUIREMENT
                }
                RESOURCE_REQUIREMENT_KEYWORD -> {
                    // TODO
                    nextToken()
                    checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break"))
                    CwlElementTypes.RESOURCE_REQUIREMENT
                }
                ENV_VAR_REQUIREMENT_KEYWORD -> {
                    // TODO
                    nextToken()
                    checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break"))
                    CwlElementTypes.ENV_VAR_REQUIREMENT
                }
                SHELL_COMMAND_REQUIREMENT_KEYWORD -> {
                    // TODO
                    println("Shell command requirement: ${myBuilder.tokenType}")
                    nextToken()
                    checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break"))
                    println("Shell command requirement: ${myBuilder.tokenType}")
                    CwlElementTypes.SHELL_COMMAND_REQUIREMENT
                }
                SOFTWARE_REQUIREMENT_KEYWORD -> {
                    // TODO
                    nextToken()
                    checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break"))
                    CwlElementTypes.SOFTWARE_REQUIREMENT
                }
                else -> {
                    myBuilder.error("Requirement expected")
                    return false
                }
            }
        }
        return true
    }

    fun parseDockerRequirement(): Boolean {
        nextToken()
        return parseSequence(CwlElementTypes.DOCKER_REQUIREMENT, this@RequirementsParser::parseDockerRequirementField,
                simplified = true)
    }

    fun parseDockerRequirementField(): Boolean {
        val firstToken = myBuilder.tokenType ?: return false
        with(CwlTokenTypes) {
            return when (firstToken) {
                DOCKER_FILE_KEYWORD -> {
                    checkKeyValue { parseStringValue() }
                }
                DOCKER_IMAGE_ID_KEYWORD -> {
                    checkKeyValue { parseStringValue() }
                }
                DOCKER_IMPORT_KEYWORD -> {
                    checkKeyValue { parseStringValue() }
                }
                DOCKER_LOAD_KEYWORD -> {
                    checkKeyValue { parseStringValue() }
                }
                DOCKER_PULL_KEYWORD -> {
                    checkKeyValue { parseStringValue() }
                }
                DOCKER_OUTPUT_DIRECTORY_KEYWORD -> {
                    checkKeyValue { parseStringValue() }
                }
                else -> {
                    false
                }
            }
        }
    }
}



