package com.cwlplugin.parser

import com.cwlplugin.CwlBundle
import com.cwlplugin.psi.CwlElementTypes
import com.intellij.lang.PsiBuilder
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.tree.IElementType

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
                CWL_VERSION -> parseSimpleStatement(CWL_VERSION_VALUE, CwlElementTypes.VERSION)
                INPUTS_KEYWORD -> {
                    parseInputs()
                }
                CLASS_KEYWORD -> {
                    parseSimpleStatement(COMMAND_LINE_TOOL_KEYWORD, CwlElementTypes.COMMAND_LINE_TOOL_CLASS)
                }
                BASECOMMAND_KEYWORD -> {
                    parseSimpleStatement(STRING, CwlElementTypes.BASE_COMMAND)
                } // TODO
                OUTPUTS_KEYWORD -> {
                }
                ID_KEYWORD -> {
                    parseSimpleStatement(STRING, CwlElementTypes.ID)
                } // TODO
                LABEL_KEYWORD -> {
                    parseSimpleStatement(STRING, CwlElementTypes.LABEL)
                } // TODO
                DOC_KEYWORD -> {
                    parseSimpleStatement(STRING, CwlElementTypes.DOC)
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
                    parseSimpleStatement(STRING, CwlElementTypes.STDIN)
                } // TODO
                STDOUT_KEYWORD -> {
                    parseSimpleStatement(STRING, CwlElementTypes.STDOUT)
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
                  myBuilder.error("Unexpected $firstToken")
                    return false
                }
            }
        }
        return true
    }

    fun parseInputs(): Boolean {
        parseColonAndIndentedBlock(CwlElementTypes.INPUTS, parseIndentedBlock = this::parseCommandInputParameters)
        return true
    }

    fun parseCommandInputParameters() {
        parseIndentedBlock(CwlElementTypes.COMMAND_INPUT_PARAMETER, parseStatement = this::parseCommandInputParameter)
    }

    fun parseCommandInputParameter(): Boolean {
        if (myBuilder.tokenType == CwlTokenTypes.STRING) {
            parseColonAndIndentedBlock(CwlElementTypes.COMMAND_INPUT_PARAMETER,
                    parseIndentedBlock = this::parseCommandInputParameterFields)
            return true
        }
        return false
    }

    fun parseCommandInputParameterFields() {
        parseIndentedBlock(CwlElementTypes.COMMAND_INPUT_PARAMETER, parseStatement = this::parseCommandInputParameterField)
    }

    fun parseCommandInputParameterField(): Boolean {
        val firstToken = myBuilder.tokenType ?: return false
        with(CwlTokenTypes) {
                when (firstToken) {
                    DEFAULT_KEYWORD -> {
                        parseSimpleStatement(STRING, CwlElementTypes.DEFAULT)
                    } // TODO
                    DOC_KEYWORD -> {
                        parseSimpleStatement(STRING, CwlElementTypes.DOC)
                    } // TODO
                    FORMAT_KEYWORD -> {
                        parseSimpleStatement(STRING, CwlElementTypes.FORMAT)
                    } // TODO
                    ID_KEYWORD -> {
                        parseSimpleStatement(STRING, CwlElementTypes.ID)
                    } // TODO
                    INPUT_BINDING_KEYWORD -> {
                        parseInputBinding()
                    } // TODO
                    LABEL_KEYWORD -> {
                        parseSimpleStatement(STRING, CwlElementTypes.LABEL)
                    } // TODO
                    SECONDARY_FILES_KEYWORD -> {
                        parseSimpleStatement(STRING, CwlElementTypes.SECONDARY_FILES)
                    } // TODO
                    STREAMABLE_KEYWORD -> {
                        parseSimpleStatement(STRING, CwlElementTypes.STREAMABLE)
                    } // TODO
                    TYPE_KEYWORD -> {
                        parseSimpleStatement(STRING, CwlElementTypes.TYPE)
                    } // TODO
                    else -> {
                        reportParseStatementError(myBuilder, firstToken); return false
                    }
                }
            }

        return true
    }

    fun parseInputBinding() {
        parseColonAndIndentedBlock(CwlElementTypes.INPUT_BINDING, this::parseInputBindingField)
    }

    fun parseInputBindingField() {
        val firstToken = myBuilder.tokenType
        if (firstToken != null) {
            with(CwlTokenTypes) {
                when (firstToken) {
                    VALUE_FROM_KEYWORD -> {
                        parseSimpleStatement(STRING, CwlElementTypes.VALUE_FROM)
                    } // TODO
                    POSITION_KEYWORD -> {
                        parseSimpleStatement(INT, CwlElementTypes.POSITION)
                    } // TODO
                    SEPARATE_KEYWORD -> {
                        parseSimpleStatement(STRING, CwlElementTypes.SEPARATE)
                    } // TODO
                    ITEM_SEPARATOR_KEYWORD -> {
                        parseSimpleStatement(STRING, CwlElementTypes.ITEM_SEPARATOR)
                    } // TODO
                    PREFIX_KEYWORD -> {
                        parseSimpleStatement(STRING, CwlElementTypes.PREFIX)
                    } // TODO
                    SHELL_QUOTE_KEYWORD -> {
                        parseSimpleStatement(STRING, CwlElementTypes.SHELL_QUOTE)
                    } // TODO
                    LOAD_CONTENTS_KEYWORD -> {
                        parseSimpleStatement(BOOLEAN, CwlElementTypes.LOAD_CONTENTS)
                    } // TODO
                    else -> {
                        reportParseStatementError(myBuilder, firstToken); return
                    }
                }
            }
        }
    }

    fun parseOutput(): Boolean {
        return true
    }

    fun parseBaseCommand(): Boolean {
        return true
    }

//    fun parseDoc()
//    fun parseId()
//    fun parseLabel()
//    fun parseStderr()
//    fun parseStdout()
//    fun parseStdin()
}