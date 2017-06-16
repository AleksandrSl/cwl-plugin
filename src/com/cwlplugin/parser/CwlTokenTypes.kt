package com.cwlplugin.parser

import com.cwlplugin.CwlLanguage
import com.cwlplugin.lexer.CwlLexerTypes
import com.cwlplugin.lexer.CwlTokenType
import com.cwlplugin.psi.CwlElementType
import com.cwlplugin.psi.CwlTypes
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
object CwlTokenTypes {

    val IDENTIFIER = CwlElementType("IDENTIFIER")
    val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
    val COMMENTS = TokenSet.create(CwlLexerTypes.COMMENT)


    val ANY_TYPE_KEYWORD = CwlElementType("Any")
    val ARRAY_TYPE_KEYWORD = CwlElementType("array")
    val BASECOMMAND_KEYWORD = CwlElementType("baseCommand")
    val BASENAME_KEYWORD = CwlElementType("basename")
    val BOOLEAN = CwlElementType("BOOLEAN_VALUE")
    val BOOLEAN_TYPE_KEYWORD = CwlElementType("boolean")
    val CHECKSUM_KEYWORD = CwlElementType("checksum")
    val CLASS_KEYWORD = CwlElementType("class")
    val COMMAND_LINE_TOOL_KEYWORD = CwlElementType("CommandLineTool")
    val CONTENTS_KEYWORD = CwlElementType("contents")
    val CORES_MAX_KEYWORD = CwlElementType("CORES_MAX")
    val CORES_MIN_KEYWORD = CwlElementType("coresMin")
    val CWL_VERSION_KEYWORD = CwlElementType("cwlVersion")
    val CWL_VERSION_VALUE_KEYWORD = CwlElementType("v1.0")
    val DEFAULT_KEYWORD = CwlElementType("default")
    val DIRECTORY_TYPE_KEYWORD = CwlElementType("Directory")
    val DIRNAME_KEYWORD = CwlElementType("dirname")
    val DOC_KEYWORD = CwlElementType("doc")
    val DOCKER_FILE_KEYWORD = CwlElementType("dockerFile")
    val DOCKER_IMAGE_ID_KEYWORD = CwlElementType("dockerImageId")
    val DOCKER_IMPORT_KEYWORD = CwlElementType("dockerImport")
    val DOCKER_LOAD_KEYWORD = CwlElementType("dockerLoad")
    val DOCKER_OUTPUT_DIRECTORY_KEYWORD = CwlElementType("dockerOutputDirectory")
    val DOCKER_PULL_KEYWORD = CwlElementType("dockerPull")
    val DOCKER_REQUIREMENT_KEYWORD = CwlElementType("DockerRequirement")
    val DOUBLE_TYPE_KEYWORD = CwlElementType("double")
    val ENTRY_KEYWORD = CwlElementType("entry")
    val ENTRYNAME_KEYWORD = CwlElementType("entryname")
    val ENUM_TYPE_KEYWORD = CwlElementType("enum")
    val ENV_DEF_KEYWORD = CwlElementType("envDef")
    val ENV_NAME_KEYWORD = CwlElementType("envName")
    val ENV_VALUE_KEYWORD = CwlElementType("envValue")
    val ENV_VAR_REQUIREMENT_KEYWORD = CwlElementType("EnvVarRequirement")
    val EXPRESSION_KEYWORD = CwlElementType("$()")
    val EXPRESSION_TOOL_KEYWORD = CwlElementType("ExpressionTool")
    val FILE_KEYWORD = CwlElementType("file")
    val FILE_TYPE_KEYWORD = CwlElementType("File")
    val FLOAT_TYPE_KEYWORD = CwlElementType("float")
    val FORMAT_KEYWORD = CwlElementType("format")
    val GLOB_KEYWORD = CwlElementType("glob")
    val HINTS_KEYWORD = CwlElementType("hints")
    val ID_KEYWORD = CwlElementType("id")
    val IDENTIFIER_KEYWORD = CwlElementType("IDENTIFIER")
    val INITIAL_WORKDIR_REQUIREMENT_KEYWORD = CwlElementType("InitialWorkDirRequirement")
    val INLINE_JAVASCRIPT_REQUIREMENT_KEYWORD = CwlElementType("InlineJavascriptRequirement")
    val INPUTS_KEYWORD = CwlElementType("inputs")
    val INPUT_BINDING_KEYWORD = CwlElementType("inputBinding")
    val INT = CwlElementType("INT_VALUE")
    val INT_TYPE_KEYWORD = CwlElementType("int")
    val ITEM_SEPARATOR_KEYWORD = CwlElementType("itemSeparator")
    val LABEL_KEYWORD = CwlElementType("label")
    val LISTING_KEYWORD = CwlElementType("listing")
    val LOAD_CONTENTS_KEYWORD = CwlElementType("loadContents")
    val LOCATION_KEYWORD = CwlElementType("location")
    val LONG_TYPE_KEYWORD = CwlElementType("long")
    val NAME_KEYWORD = CwlElementType("name")
    val NAMEEXT_KEYWORD = CwlElementType("nameext")
    val NAMEROOT_KEYWORD = CwlElementType("nameroot")
    val NULL_TYPE_KEYWORD = CwlElementType("null")
    val NUMBER_KEYWORD = CwlElementType("NUMBER")
    val OUTDIR_MAX_KEYWORD = CwlElementType("outdirMax")
    val OUTDIR_MIN_KEYWORD = CwlElementType("outdirMin")
    val OUTPUTS_KEYWORD = CwlElementType("outputs")
    val OUTPUT_EVAL_KEYWORD = CwlElementType("outputEval")
    val PACKAGE_KEYWORD = CwlElementType("package")
    val PATH_KEYWORD = CwlElementType("path")
    val PERMANENT_FAIL_CODES_KEYWORD = CwlElementType("permanentFailCodes")
    val POSITION_KEYWORD = CwlElementType("position")
    val PREFIX_KEYWORD = CwlElementType("prefix")
    val RAM_MAX_KEYWORD = CwlElementType("ramMax")
    val RAM_MIN_KEYWORD = CwlElementType("ramMin")
    val RECORD_KEYWORD = CwlElementType("record")
    val REQUIREMENTS_KEYWORD = CwlElementType("requirements")
    val RESOURCE_REQUIREMENT_KEYWORD = CwlElementType("ResourceRequirement")
    val SCHEMA_DEF_REQUIREMENT_KEYWORD = CwlElementType("SchemaDefRequirement")
    val SECONDARY_FILES_KEYWORD = CwlElementType("secondaryFiles")
    val SEPARATE_KEYWORD = CwlElementType("separate")
    val SHELL_COMMAND_REQUIREMENT_KEYWORD = CwlElementType("ShellCommandRequirement")
    val SHELL_QUOTE_KEYWORD = CwlElementType("shellQuote")
    val SIZE_KEYWORD = CwlElementType("size")
    val SOFTWARE_REQUIREMENT_KEYWORD = CwlElementType("SoftwareRequirement")
    val SPECS_KEYWORD = CwlElementType("specs")
    val STREAMABLE_KEYWORD = CwlElementType("streamable")
    val STRING = CwlElementType("STRING_VALUE")
    val STRING_TYPE_KEYWORD = CwlElementType("string")
    val SUCCESS_CODES_KEYWORD = CwlElementType("successCodes")
    val TEMPORARY_FAIL_CODES_KEYWORD = CwlElementType("temporaryFailCodes")
    val TMPDIR_MAX_KEYWORD = CwlElementType("tmpdirMax")
    val TMPDIR_MIN_KEYWORD = CwlElementType("tmpdirMin")
    val TYPE_KEYWORD = CwlElementType("type")
    val VALUE_FROM_KEYWORD = CwlElementType("valueFrom")
    val VERSION_KEYWORD = CwlElementType("version")
    val WORKFLOW_KEYWORD = CwlElementType("Workflow")
    val WRITABLE_KEYWORD = CwlElementType("writable")

    // Delimiters
    val LBRACKET = CwlElementType("LBRACKET")
    val COLON = CwlElementType("COLON")
    val COMMA = CwlElementType("COMMA")
    val RBRACKET = CwlElementType("RBRACKET")

    // Indentation
    val INDENT = CwlElementType("INDENT")
    val DEDENT = CwlElementType("DEDENT")
    val INCONSISTENT_DEDENT = CwlElementType("INCONSISTENT_DEDENT")

    // Line formatting
    val SPACE = CwlElementType("SPACE")
    val TAB = CwlElementType("TAB")
    val FORMFEED = CwlElementType("FORMFEED")
    val LINE_BREAK = CwlElementType("LINE_BREAK")
    val STATEMENT_BREAK = CwlElementType("STATEMENT_BREAK")

    val BAD_CHARACTER = TokenType.BAD_CHARACTER
    val END_OF_LINE_COMMENT = CwlElementType("END_OF_LINE_COMMENT")

    val KEYWORDS: TokenSet = TokenSet.create(

            BASECOMMAND_KEYWORD,
            BASENAME_KEYWORD,

            CHECKSUM_KEYWORD,
            CLASS_KEYWORD,
            COMMAND_LINE_TOOL_KEYWORD,
            CONTENTS_KEYWORD,
            CORES_MAX_KEYWORD,
            CORES_MIN_KEYWORD,
            CWL_VERSION_KEYWORD,
            DEFAULT_KEYWORD,
            DIRECTORY_TYPE_KEYWORD,
            DIRNAME_KEYWORD,
            DOC_KEYWORD,
            DOCKER_FILE_KEYWORD,
            DOCKER_IMAGE_ID_KEYWORD,
            DOCKER_IMPORT_KEYWORD,
            DOCKER_LOAD_KEYWORD,
            DOCKER_OUTPUT_DIRECTORY_KEYWORD,
            DOCKER_PULL_KEYWORD,
            DOCKER_REQUIREMENT_KEYWORD,

            ENTRY_KEYWORD,
            ENTRYNAME_KEYWORD,
            ENUM_TYPE_KEYWORD,
            ENV_DEF_KEYWORD,
            ENV_NAME_KEYWORD,
            ENV_VALUE_KEYWORD,
            ENV_VAR_REQUIREMENT_KEYWORD,
            EXPRESSION_TOOL_KEYWORD,

            FORMAT_KEYWORD,
            GLOB_KEYWORD,
            HINTS_KEYWORD,
            ID_KEYWORD,
            INITIAL_WORKDIR_REQUIREMENT_KEYWORD,
            INLINE_JAVASCRIPT_REQUIREMENT_KEYWORD,
            INPUTS_KEYWORD,
            INPUT_BINDING_KEYWORD,
            INT_TYPE_KEYWORD,
            ITEM_SEPARATOR_KEYWORD,
            LABEL_KEYWORD,
            LISTING_KEYWORD,
            LOAD_CONTENTS_KEYWORD,
            LOCATION_KEYWORD,

            NAME_KEYWORD,
            NAMEEXT_KEYWORD,
            NAMEROOT_KEYWORD,

            OUTDIR_MAX_KEYWORD,
            OUTDIR_MIN_KEYWORD,
            OUTPUTS_KEYWORD,
            OUTPUT_EVAL_KEYWORD,
            PACKAGE_KEYWORD,
            PATH_KEYWORD,
            PERMANENT_FAIL_CODES_KEYWORD,
            POSITION_KEYWORD,
            PREFIX_KEYWORD,
            RAM_MAX_KEYWORD,
            RAM_MIN_KEYWORD,
            RECORD_KEYWORD,
            REQUIREMENTS_KEYWORD,
            RESOURCE_REQUIREMENT_KEYWORD,
            SCHEMA_DEF_REQUIREMENT_KEYWORD,
            SECONDARY_FILES_KEYWORD,
            SEPARATE_KEYWORD,
            SHELL_COMMAND_REQUIREMENT_KEYWORD,
            SHELL_QUOTE_KEYWORD,
            SIZE_KEYWORD,
            SOFTWARE_REQUIREMENT_KEYWORD,
            SPECS_KEYWORD,
            STREAMABLE_KEYWORD,
            SUCCESS_CODES_KEYWORD,
            TEMPORARY_FAIL_CODES_KEYWORD,
            TMPDIR_MAX_KEYWORD,
            TMPDIR_MIN_KEYWORD,
            TYPE_KEYWORD,
            VALUE_FROM_KEYWORD,
            VERSION_KEYWORD,
            WORKFLOW_KEYWORD,
            WRITABLE_KEYWORD)

    val CWL_TYPES = TokenSet.create(
            STRING_TYPE_KEYWORD,
            NULL_TYPE_KEYWORD,
            LONG_TYPE_KEYWORD,
            DOUBLE_TYPE_KEYWORD,
            FILE_TYPE_KEYWORD,
            FLOAT_TYPE_KEYWORD,
            ANY_TYPE_KEYWORD,
            ARRAY_TYPE_KEYWORD,
            BOOLEAN_TYPE_KEYWORD
    )

    val REQUIREMENTS_TOKENS = TokenSet.create(
            REQUIREMENTS_KEYWORD,
            SCHEMA_DEF_REQUIREMENT_KEYWORD,
            DOCKER_REQUIREMENT_KEYWORD,
            INITIAL_WORKDIR_REQUIREMENT_KEYWORD,
            INLINE_JAVASCRIPT_REQUIREMENT_KEYWORD,
            DOCKER_FILE_KEYWORD,
            DOCKER_IMAGE_ID_KEYWORD,
            DOCKER_IMPORT_KEYWORD,
            DOCKER_LOAD_KEYWORD,
            DOCKER_OUTPUT_DIRECTORY_KEYWORD,
            DOCKER_PULL_KEYWORD,
            DOCKER_REQUIREMENT_KEYWORD
    )

    val OPEN_BRACES = TokenSet.create(LBRACKET)
    val CLOSE_BRACES = TokenSet.create(RBRACKET)
    val END_OF_STATEMENT = TokenSet.create(STATEMENT_BREAK)

    val WHITESPACE = TokenSet.create(SPACE, TAB, FORMFEED)
    val WHITESPACE_OR_LINEBREAK = TokenSet.create(SPACE, TAB, FORMFEED, LINE_BREAK)

}
