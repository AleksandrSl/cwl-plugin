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
        parseKeyValue(CwlElementTypes.REQUIREMENTS_BLOCK, this::parseRequirementsSequence)
//        parseColonAndIndentedBlock(CwlElementTypes.REQUIREMENTS_BLOCK, this::parseRequirementsSequence)
    }

    fun parseRequirementsSequence(): Unit {
        parseSequence(CwlElementTypes.REQUIREMENT_LIST, parseElement = this::parseRequirement)
    }

    /**
     * Parse requirement statement
     *
     *  class: requirement
     */
    protected fun parseRequirement(): Boolean {

        println("parseRequirement:: ${myBuilder.tokenType}")

        val requirement = myBuilder.mark()
        checkMatches(CwlTokenTypes.CLASS_KEYWORD, "Class keyword expected", advanceLexer = false)

        nextToken()
        if (!checkMatches(CwlTokenTypes.COLON, message("PARSE.expected.colon"))) {
//            requirement.drop(); return false
        }
        with (CwlTokenTypes) {
            val requirementType: CwlElementType = when (myBuilder.tokenType) {
                INLINE_JAVASCRIPT_REQUIREMENT_KEYWORD -> {
                    // TODO
                    nextToken()
                    checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break"))
//                        return false
                    CwlElementTypes.INLINE_JAVASCRIPT_REQUIREMENT
                }
                DOCKER_REQUIREMENT_KEYWORD -> {
                    if (!parseDockerRequirement()) {
//                        requirement.drop()
//                        return false
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
                    if (!checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break")))
                        return false
                    println("Shell command requirement: ${myBuilder.tokenType}")
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
//                    requirement.drop()
                    CwlElementTypes.DOCKER_REQUIREMENT
                }
            }
            println("parseRequirement:: ${myBuilder.tokenType}")
            requirement.done(requirementType)
            println("parseRequirement:: ${myBuilder.tokenType}")
        }
        return true
    }

    fun parseDockerRequirement(): Boolean {

        nextToken() // Skip already matched requirement
        if (!checkMatches(CwlTokenTypes.LINE_BREAK, message("PARSE.expected.line_break")))
            return false
        println("ParseDocker, ${myBuilder.tokenType}")
        var isRight: Boolean = true
        with(CwlTokenTypes) {
            if (!checkMatches(CwlTokenTypes.INDENT, message("PARSE.expected.indent")))
                return false

            infinite_while@while (!atToken(DEDENT)) {
                when (myBuilder.tokenType) {
                    DOCKER_FILE_KEYWORD -> {
                        isRight = checkKeyValue { parseStringValue() }
                    }
                    DOCKER_IMAGE_ID_KEYWORD -> {
                        isRight = checkKeyValue { parseStringValue() }
                    }
                    DOCKER_IMPORT_KEYWORD -> {
                        isRight = checkKeyValue { parseStringValue() }
                    }
                    DOCKER_LOAD_KEYWORD -> {
                        isRight = checkKeyValue { parseStringValue() }
                    }
                    DOCKER_PULL_KEYWORD -> {
                        isRight = checkKeyValue { parseStringValue() }
                    }
                    DOCKER_OUTPUT_DIRECTORY_KEYWORD -> {
                        isRight = checkKeyValue { parseStringValue() }
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



