package com.cwlplugin.parser

import com.cwlplugin.CwlBundle
import com.cwlplugin.psi.CwlElementTypes
import com.intellij.openapi.diagnostic.Logger

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CommandLineToolParser(context: ParsingContext) : Parsing(context) {

    private val LOG = Logger.getInstance(RequirementsParser::class.java.name)

    fun parseCommandLineTool(): Boolean {
        while (!myBuilder.eof()) {
            if (!parseCommandLineToolField()) {
                return false
            }
        }
        return true
    }

    fun parseCommandLineToolField(): Boolean {

        val firstToken = myBuilder.tokenType ?: return false
        with(CwlTokenTypes) {
            when (firstToken) {
                REQUIREMENTS_KEYWORD -> {
                    requirementsParser.parseRequirementsBlock()
                }
                INPUTS_KEYWORD -> {
                    parseInputs()
                }
                BASECOMMAND_KEYWORD -> {
                    parseBaseCommand()
                } // TODO
                OUTPUTS_KEYWORD -> {
                    parseOutputs()
                }
                ID_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseStringValue)
                    parseSimpleStatement(STRING, CwlElementTypes.ID)
                } // TODO
                LABEL_KEYWORD, DOC_KEYWORD -> {
                    return checkKeyValue(this@CommandLineToolParser::parseStringValue)
//                    return parseStringValue()
                } // TODO
                HINTS_KEYWORD -> {
                    parseSimpleStatement(STRING, CwlElementTypes.HINTS)
                } // TODO
                ARGUMENTS_KEYWORD -> {
                    parseSimpleStatement(STRING, CwlElementTypes.ARGUMENTS)
                } // TODO
                STDERR_KEYWORD -> {
                    parseSimpleStatement(STRING, CwlElementTypes.STDERR)
                } // TODO
                STDIN_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseStringValue)
                } // TODO
                STDOUT_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseStringValue)
                } // TODO
                SUCCESS_CODES_KEYWORD -> {
                    parseSimpleStatement(STRING, CwlElementTypes.SUCCESS_CODES)
                } // TODO
                TEMPORARY_FAIL_CODES_KEYWORD -> {
                    parseSimpleStatement(STRING, CwlElementTypes.TEMPORARY_FAIL_CODES)
                } // TODO
                PERMANENT_FAIL_CODES_KEYWORD -> {
                    parseSimpleStatement(STRING, CwlElementTypes.PERMANENT_FAIL_CODES)
                } // TODO
                else -> {
                    return false
                }
            }
        }
        return true
    }

    fun parseInputs(): Unit {
        parseKeyValue(this::parseCommandInputParameters)
        return
    }

    fun parseCommandInputParameters(): Unit {
        parseSequence(CwlElementTypes.COMMAND_INPUT_PARAMETER, this::parseCommandInputParameter, simplified = true)
    }

    fun parseCommandInputParameter(): Boolean {
        if (myBuilder.tokenType == CwlTokenTypes.STRING) {
            parseKeyValue(CwlElementTypes.COMMAND_INPUT_PARAMETER, this::parseCommandInputParameterFields)
            return true
        }
        return false
    }

    fun parseCommandInputParameterFields() {
        parseSequence(CwlElementTypes.COMMAND_INPUT_PARAMETER, this::parseCommandInputParameterField, simplified = true)
    }

    fun parseCommandInputParameterField(): Boolean {
        val firstToken = myBuilder.tokenType ?: return false
        with(CwlTokenTypes) {
            return when (firstToken) {
                DEFAULT_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseStringValue)
                } // TODO
                DOC_KEYWORD, LABEL_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseStringValue)
                } // TODO
                FORMAT_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseStringValue)
                } // TODO
                ID_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseStringValue)
                } // TODO
                INPUT_BINDING_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseInputBindingFields)
                } // TODO
                SECONDARY_FILES_KEYWORD -> {
                    parseKeyValue(CwlElementTypes.SECONDARY_FILES, this@CommandLineToolParser::parseSecondaryFiles)
                    true
                } // TODO
                STREAMABLE_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseBoolValue)
                } // TODO
                TYPE_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseTypeValue)
                } // TODO
                else -> {
                    reportParseStatementError(myBuilder, firstToken)
                    false
                }
            }
        }
    }

    fun parseInputBindingFields(): Boolean {
        return parseSequence(CwlElementTypes.INPUT_BINDING, this::parseInputBindingField, simplified = true)
    }

    fun parseInputBindingField(): Boolean {
        val firstToken = myBuilder.tokenType
        if (firstToken != null) {
            with(CwlTokenTypes) {
                when (firstToken) {
                    VALUE_FROM_KEYWORD -> {
                        checkKeyValue(this@CommandLineToolParser::parseStringValue)
                    } // TODO
                    POSITION_KEYWORD -> {
                        checkKeyValue(this@CommandLineToolParser::parseIntValue)
                    } // TODO
                    SEPARATE_KEYWORD -> {
                        checkKeyValue(this@CommandLineToolParser::parseBoolValue)
                    } // TODO
                    ITEM_SEPARATOR_KEYWORD -> {
                        checkKeyValue(this@CommandLineToolParser::parseStringValue)
                    } // TODO
                    PREFIX_KEYWORD -> {
                        checkKeyValue(this@CommandLineToolParser::parseStringValue)
                    } // TODO
                    SHELL_QUOTE_KEYWORD -> {
                        checkKeyValue(this@CommandLineToolParser::parseStringValue)
                    } // TODO
                    LOAD_CONTENTS_KEYWORD -> {
                        checkKeyValue(this@CommandLineToolParser::parseBoolValue)
                    } // TODO
                    else -> {
                        println("parseInputBindingField")
                        reportParseStatementError(myBuilder, firstToken); return false
                    }
                }
            }
        }
        return true
    }

    fun parseSecondaryFiles(): Unit {
        parseSequence(CwlElementTypes.SECONDARY_FILES, this::parseStringValue)
        return
    }

    fun parseBaseCommand(): Boolean {
        return parseFlowSequence(CwlElementTypes.BASE_COMMAND, CwlTokenTypes.STRING)
    }

    fun parseTypeValue(): Boolean {
        with(CwlTokenTypes) {
            if (!CWL_TYPES.contains(myBuilder.tokenType)) {
                myBuilder.error("Type expected")
            } else {
                nextToken()
            }
            return checkMatches(CwlTokenTypes.LINE_BREAK, CwlBundle.message("PARSE.expected.line_break"))
        }
    }

    fun parseOutputs(): Unit {
        parseKeyValue(CwlElementTypes.OUTPUTS, this::parseCommandOutputParameters)
    }

    fun parseCommandOutputParameters(): Unit {
        parseSequence(CwlElementTypes.COMMAND_OUTPUT_PARAMETER, this::parseCommandOutputParameter, simplified = true)
    }

    fun parseCommandOutputParameter(): Boolean {
        if (myBuilder.tokenType == CwlTokenTypes.STRING) {
            parseKeyValue(CwlElementTypes.COMMAND_OUTPUT_PARAMETER, this::parseCommandOutputParameterFields)
            return true
        }
        return false
    }

    fun parseCommandOutputParameterFields() {
        parseSequence(CwlElementTypes.COMMAND_OUTPUT_PARAMETER, this::parseCommandOutputParameterField, simplified = true)
    }


    fun parseCommandOutputParameterField(): Boolean {
        val firstToken = myBuilder.tokenType ?: return false
        with(CwlTokenTypes) {
            return when (firstToken) {
                ID_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseStringValue)
                }
                LABEL_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseStringValue)
                }

                SECONDARY_FILES_KEYWORD -> {
                    parseKeyValue(CwlElementTypes.SECONDARY_FILES, this@CommandLineToolParser::parseSecondaryFiles)
                    true
                }
                FORMAT_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseStringValue)
                }
                STREAMABLE_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseBoolValue)
                }
                DOC_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseStringValue)
                }
                OUTPUT_BINDING_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseCommandOutputBindingFields)
                }
                TYPE_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseTypeValue)
                }
                else -> {
                    reportParseStatementError(myBuilder, firstToken); return false
                }
            }
        }
    }

    fun parseCommandOutputBindingFields(): Boolean {
        return parseSequence(CwlElementTypes.OUTPUT_BINDING, this::parseCommandOutputBindingField, simplified = true)
    }

    fun parseCommandOutputBindingField(): Boolean {
        val firstToken = myBuilder.tokenType ?: return false
        with(CwlTokenTypes) {
            return when (firstToken) {
                GLOB_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseStringValue)
                }
                LOAD_CONTENTS_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseBoolValue)
                }
                OUTPUT_EVAL_KEYWORD -> {
                    checkKeyValue(this@CommandLineToolParser::parseStringValue)
                }
                else -> {
                    reportParseStatementError(myBuilder, firstToken); return false
                }
            }
        }
    }

//    fun parseId()
//    fun parseStderr()
//    fun parseStdout()
//    fun parseStdin()
}