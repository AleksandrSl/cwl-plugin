package com.cwlplugin.parser

import com.cwlplugin.lexer.CwlLexerTypes
import com.cwlplugin.psi.CwlElementType
import com.intellij.psi.TokenType
import com.intellij.psi.tree.TokenSet

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
object CwlTokenTypes {

//    @JvmStatic
    @JvmField
    val IDENTIFIER = CwlElementType("IDENTIFIER")
    @JvmField
    val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
    @JvmField
    val COMMENTS = TokenSet.create(CwlLexerTypes.COMMENT)
    @JvmField
    val ANY_TYPE_KEYWORD = CwlElementType("Any")
    @JvmField val ARRAY_TYPE_KEYWORD = CwlElementType("array")
    @JvmField val BASECOMMAND_KEYWORD = CwlElementType("baseCommand")
    @JvmField val BASENAME_KEYWORD = CwlElementType("basename")
    @JvmField val BOOLEAN = CwlElementType("BOOLEAN_VALUE")
    @JvmField val BOOLEAN_TYPE_KEYWORD = CwlElementType("boolean")
    @JvmField val CHECKSUM_KEYWORD = CwlElementType("checksum")
    @JvmField val CLASS_KEYWORD = CwlElementType("class")
    @JvmField val COMMAND_LINE_TOOL_KEYWORD = CwlElementType("CommandLineTool")
    @JvmField val CONTENTS_KEYWORD = CwlElementType("contents")
    @JvmField val CORES_MAX_KEYWORD = CwlElementType("CORES_MAX")
    @JvmField val CORES_MIN_KEYWORD = CwlElementType("coresMin")
    @JvmField val CWL_VERSION_KEYWORD = CwlElementType("cwlVersion")
    @JvmField val CWL_VERSION_VALUE_KEYWORD = CwlElementType("v1.0")
    @JvmField val DEFAULT_KEYWORD = CwlElementType("default")
    @JvmField val DIRECTORY_TYPE_KEYWORD = CwlElementType("Directory")
    @JvmField val DIRNAME_KEYWORD = CwlElementType("dirname")
    @JvmField val DOC_KEYWORD = CwlElementType("doc")
    @JvmField val DOCKER_FILE_KEYWORD = CwlElementType("dockerFile")
    @JvmField val DOCKER_IMAGE_ID_KEYWORD = CwlElementType("dockerImageId")
    @JvmField val DOCKER_IMPORT_KEYWORD = CwlElementType("dockerImport")
    @JvmField val DOCKER_LOAD_KEYWORD = CwlElementType("dockerLoad")
    @JvmField val DOCKER_OUTPUT_DIRECTORY_KEYWORD = CwlElementType("dockerOutputDirectory")
    @JvmField val DOCKER_PULL_KEYWORD = CwlElementType("dockerPull")
    @JvmField val DOCKER_REQUIREMENT_KEYWORD = CwlElementType("DockerRequirement")
    @JvmField val DOUBLE_TYPE_KEYWORD = CwlElementType("double")
    @JvmField val ENTRY_KEYWORD = CwlElementType("entry")
    @JvmField val ENTRYNAME_KEYWORD = CwlElementType("entryname")
    @JvmField val ENUM_TYPE_KEYWORD = CwlElementType("enum")
    @JvmField val ENV_DEF_KEYWORD = CwlElementType("envDef")
    @JvmField val ENV_NAME_KEYWORD = CwlElementType("envName")
    @JvmField val ENV_VALUE_KEYWORD = CwlElementType("envValue")
    @JvmField val ENV_VAR_REQUIREMENT_KEYWORD = CwlElementType("EnvVarRequirement")
    @JvmField val EXPRESSION_KEYWORD = CwlElementType("$()")
    @JvmField val EXPRESSION_TOOL_KEYWORD = CwlElementType("ExpressionTool")
    @JvmField val FILE_KEYWORD = CwlElementType("file")
    @JvmField val FILE_TYPE_KEYWORD = CwlElementType("File")
    @JvmField val FLOAT_TYPE_KEYWORD = CwlElementType("float")
    @JvmField val FORMAT_KEYWORD = CwlElementType("format")
    @JvmField val GLOB_KEYWORD = CwlElementType("glob")
    @JvmField val HINTS_KEYWORD = CwlElementType("hints")
    @JvmField val ID_KEYWORD = CwlElementType("id")
    @JvmField val IDENTIFIER_KEYWORD = CwlElementType("IDENTIFIER")
    @JvmField val INITIAL_WORKDIR_REQUIREMENT_KEYWORD = CwlElementType("InitialWorkDirRequirement")
    @JvmField val INLINE_JAVASCRIPT_REQUIREMENT_KEYWORD = CwlElementType("InlineJavascriptRequirement")
    @JvmField val INPUTS_KEYWORD = CwlElementType("inputs")
    @JvmField val INPUT_BINDING_KEYWORD = CwlElementType("inputBinding")
    @JvmField val INT = CwlElementType("INT_VALUE")
    @JvmField val INT_TYPE_KEYWORD = CwlElementType("int")
    @JvmField val ITEM_SEPARATOR_KEYWORD = CwlElementType("itemSeparator")
    @JvmField val LABEL_KEYWORD = CwlElementType("label")
    @JvmField val LISTING_KEYWORD = CwlElementType("listing")
    @JvmField val LOAD_CONTENTS_KEYWORD = CwlElementType("loadContents")
    @JvmField val LOCATION_KEYWORD = CwlElementType("location")
    @JvmField val LONG_TYPE_KEYWORD = CwlElementType("long")
    @JvmField val NAME_KEYWORD = CwlElementType("name")
    @JvmField val NAMEEXT_KEYWORD = CwlElementType("nameext")
    @JvmField val NAMEROOT_KEYWORD = CwlElementType("nameroot")
    @JvmField val NULL_TYPE_KEYWORD = CwlElementType("null")
    @JvmField val NUMBER_KEYWORD = CwlElementType("NUMBER")
    @JvmField val OUTDIR_MAX_KEYWORD = CwlElementType("outdirMax")
    @JvmField val OUTDIR_MIN_KEYWORD = CwlElementType("outdirMin")
    @JvmField val OUTPUTS_KEYWORD = CwlElementType("outputs")
    @JvmField val OUTPUT_EVAL_KEYWORD = CwlElementType("outputEval")
    @JvmField val PACKAGE_KEYWORD = CwlElementType("package")
    @JvmField val PATH_KEYWORD = CwlElementType("path")
    @JvmField val PERMANENT_FAIL_CODES_KEYWORD = CwlElementType("permanentFailCodes")
    @JvmField val POSITION_KEYWORD = CwlElementType("position")
    @JvmField val PREFIX_KEYWORD = CwlElementType("prefix")
    @JvmField val RAM_MAX_KEYWORD = CwlElementType("ramMax")
    @JvmField val RAM_MIN_KEYWORD = CwlElementType("ramMin")
    @JvmField val RECORD_KEYWORD = CwlElementType("record")
    @JvmField val REQUIREMENTS_KEYWORD = CwlElementType("requirements")
    @JvmField val RESOURCE_REQUIREMENT_KEYWORD = CwlElementType("ResourceRequirement")
    @JvmField val SCHEMA_DEF_REQUIREMENT_KEYWORD = CwlElementType("SchemaDefRequirement")
    @JvmField val SECONDARY_FILES_KEYWORD = CwlElementType("secondaryFiles")
    @JvmField val SEPARATE_KEYWORD = CwlElementType("separate")
    @JvmField val SHELL_COMMAND_REQUIREMENT_KEYWORD = CwlElementType("ShellCommandRequirement")
    @JvmField val SHELL_QUOTE_KEYWORD = CwlElementType("shellQuote")
    @JvmField val SIZE_KEYWORD = CwlElementType("size")
    @JvmField val SOFTWARE_REQUIREMENT_KEYWORD = CwlElementType("SoftwareRequirement")
    @JvmField val SPECS_KEYWORD = CwlElementType("specs")
    @JvmField val STREAMABLE_KEYWORD = CwlElementType("streamable")
    @JvmField val STRING = CwlElementType("STRING_VALUE")
    @JvmField val STRING_TYPE_KEYWORD = CwlElementType("string")
    @JvmField val SUCCESS_CODES_KEYWORD = CwlElementType("successCodes")
    @JvmField val TEMPORARY_FAIL_CODES_KEYWORD = CwlElementType("temporaryFailCodes")
    @JvmField val TMPDIR_MAX_KEYWORD = CwlElementType("tmpdirMax")
    @JvmField val TMPDIR_MIN_KEYWORD = CwlElementType("tmpdirMin")
    @JvmField val TYPE_KEYWORD = CwlElementType("type")
    @JvmField val VALUE_FROM_KEYWORD = CwlElementType("valueFrom")
    @JvmField val VERSION_KEYWORD = CwlElementType("version")
    @JvmField val WORKFLOW_KEYWORD = CwlElementType("Workflow")
    @JvmField val WRITABLE_KEYWORD = CwlElementType("writable")

    // Delimiters
    @JvmField val LBRACKET = CwlElementType("LBRACKET")
    @JvmField val COLON = CwlElementType("COLON")
    @JvmField val COMMA = CwlElementType("COMMA")
    @JvmField val RBRACKET = CwlElementType("RBRACKET")

    // Indentation
    @JvmField val INDENT = CwlElementType("INDENT")
    @JvmField val DEDENT = CwlElementType("DEDENT")
    @JvmField  val INCONSISTENT_DEDENT = CwlElementType("INCONSISTENT_DEDENT")

    // Line formatting
    @JvmField val SPACE = CwlElementType("SPACE")
    @JvmField val TAB = CwlElementType("TAB")
    @JvmField val FORMFEED = CwlElementType("FORMFEED")
    @JvmField val LINE_BREAK = CwlElementType("LINE_BREAK")
    @JvmField val STATEMENT_BREAK = CwlElementType("STATEMENT_BREAK")

    @JvmField  val BAD_CHARACTER = TokenType.BAD_CHARACTER
    @JvmField val END_OF_LINE_COMMENT = CwlElementType("END_OF_LINE_COMMENT")

    @JvmField val KEYWORDS: TokenSet = TokenSet.create(

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

    @JvmField val CWL_TYPES = TokenSet.create(
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

    @JvmField  val REQUIREMENTS_TOKENS = TokenSet.create(
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

    @JvmField val OPEN_BRACES = TokenSet.create(LBRACKET)
    @JvmField val CLOSE_BRACES = TokenSet.create(RBRACKET)
    @JvmField val END_OF_STATEMENT = TokenSet.create(STATEMENT_BREAK)

    @JvmField val WHITESPACE = TokenSet.create(SPACE, TAB, FORMFEED)
    @JvmField val WHITESPACE_OR_LINEBREAK = TokenSet.create(SPACE, TAB, FORMFEED, LINE_BREAK)

    @JvmField val CWL_VERSION = CwlElementType("CWL_VERSION")
    @JvmField val CWL_VERSION_VALUE = CwlElementType("CWL_VERSION_VALUE")
    @JvmField val EXPRESSION = CwlElementType("EXPRESSION")

}
