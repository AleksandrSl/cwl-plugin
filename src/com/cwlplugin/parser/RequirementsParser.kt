package com.cwlplugin.parser

import com.cwlplugin.CwlBundle.message
import com.cwlplugin.psi.CwlElementType
import com.cwlplugin.psi.CwlElementTypes
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
        parseColonAndIndentedBlock(CwlElementTypes.REQUIREMENTS_BLOCK, this::parseRequirementsList)
    }

    fun parseRequirementsList(): Unit {
        parseSequence(CwlElementTypes.REQUIREMENT_LIST, parseStatement = this::parseRequirement)
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
        with (CwlTokenTypes) {
            val requirementType: CwlElementType = when (myBuilder.tokenType) {
                INLINE_JAVASCRIPT_REQUIREMENT_KEYWORD -> {
                    // TODO
                    nextToken()
                    if (!checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break")))
                        return false
                    CwlElementTypes.INLINE_JAVASCRIPT_REQUIREMENT
                }
                DOCKER_REQUIREMENT_KEYWORD -> {
                    if (!parseDockerRequirement()) {
                        requirement.drop()
                        return false
                    }
                    CwlElementTypes.DOCKER_REQUIREMENT
                }
                SCHEMA_DEF_REQUIREMENT_KEYWORD -> {
                    // TODO
                    nextToken()
                    if (!checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break")))
                        return false
                    CwlElementTypes.SCHEMA_DEF_REQUIREMENT
                }
                INITIAL_WORKDIR_REQUIREMENT_KEYWORD -> {
                    // TODO
                    nextToken()
                    if (!checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break")))
                        return false
                    CwlElementTypes.INITIAL_WORKDIR_REQUIREMENT
                }
                RESOURCE_REQUIREMENT_KEYWORD -> {
                    // TODO
                    nextToken()
                    if (!checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break")))
                        return false
                    CwlElementTypes.RESOURCE_REQUIREMENT
                }
                ENV_VAR_REQUIREMENT_KEYWORD -> {
                    // TODO
                    nextToken()
                    if (!checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break")))
                        return false
                    CwlElementTypes.ENV_VAR_REQUIREMENT
                }
                SHELL_COMMAND_REQUIREMENT_KEYWORD -> {
                    // TODO
                    println("Shell command requirement: ${myBuilder.tokenType}")
                    nextToken()
                    println("Shell command requirement: ${myBuilder.tokenType}")
                    if (!checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break")))
                        return false
                    CwlElementTypes.SHELL_COMMAND_REQUIREMENT
                }
                SOFTWARE_REQUIREMENT_KEYWORD -> {
                    // TODO
                    nextToken()
                    if (!checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break")))
                        return false
                    CwlElementTypes.SOFTWARE_REQUIREMENT
                }
                else -> {
                    myBuilder.error("Requirement expected")
                    requirement.drop()
                    return false
                }
            }
            println("parseRequirement:: ${myBuilder.tokenType}")
            requirement.done(requirementType)
            println("parseRequirement:: ${myBuilder.tokenType}")
        }
//        return checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break"))
        return true
    }

    fun parseDockerRequirement(): Boolean {

        nextToken()
        println("ParseDocker, ${myBuilder.tokenType}")
        if (!checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break")))
            return false
        var isRight: Boolean = true
        with(CwlTokenTypes) {
            if (!checkMatches(CwlTokenTypes.INDENT, message("PARSE.expected.indent")))
                return false

            infinite_while@while (!atToken(DEDENT)) {
                when (myBuilder.tokenType) {
                    DOCKER_FILE_KEYWORD -> {
                        isRight = parseStringValue()
                    }
                    DOCKER_IMAGE_ID_KEYWORD -> {
                        isRight = parseStringValue()
                    }
                    DOCKER_IMPORT_KEYWORD -> {
                        isRight = parseStringValue()
                    }
                    DOCKER_LOAD_KEYWORD -> {
                        isRight = parseStringValue()
                    }
                    DOCKER_PULL_KEYWORD -> {
                        isRight = parseStringValue()
                    }
                    DOCKER_OUTPUT_DIRECTORY_KEYWORD -> {
                        isRight = parseStringValue()
                    }
                    else -> {
                        isRight = false
                        break@infinite_while
                    }
                }
            }
            print("Dedent at Docker requirement")
            if (!checkMatches(DEDENT, message("PARSE.expected.dedent"))) return false
        }
        print("Docker requirement parsing result: ${isRight}")
        return isRight
    }
}



