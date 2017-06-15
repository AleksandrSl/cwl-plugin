// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.cwlplugin.lexer.CwlTokenType;
import com.cwlplugin.psi.impl.*;

public interface CwlTypes {

  IElementType ARGUMENTS = new CwlElementType("ARGUMENTS");
  IElementType BASE_COMMAND = new CwlElementType("BASE_COMMAND");
  IElementType COMMAND_INPUT_ARRAY_ITEMS = new CwlElementType("COMMAND_INPUT_ARRAY_ITEMS");
  IElementType COMMAND_INPUT_ARRAY_SCHEMA = new CwlElementType("COMMAND_INPUT_ARRAY_SCHEMA");
  IElementType COMMAND_INPUT_ARRAY_SCHEMA_ARRAY = new CwlElementType("COMMAND_INPUT_ARRAY_SCHEMA_ARRAY");
  IElementType COMMAND_INPUT_ENUM_SCHEMA = new CwlElementType("COMMAND_INPUT_ENUM_SCHEMA");
  IElementType COMMAND_INPUT_ENUM_SCHEMA_ARRAY = new CwlElementType("COMMAND_INPUT_ENUM_SCHEMA_ARRAY");
  IElementType COMMAND_INPUT_PARAMETER = new CwlElementType("COMMAND_INPUT_PARAMETER");
  IElementType COMMAND_INPUT_PARAMETER_FIELD = new CwlElementType("COMMAND_INPUT_PARAMETER_FIELD");
  IElementType COMMAND_INPUT_RECORD_FIELD = new CwlElementType("COMMAND_INPUT_RECORD_FIELD");
  IElementType COMMAND_INPUT_RECORD_FIELDS = new CwlElementType("COMMAND_INPUT_RECORD_FIELDS");
  IElementType COMMAND_INPUT_RECORD_FIELD_TYPE = new CwlElementType("COMMAND_INPUT_RECORD_FIELD_TYPE");
  IElementType COMMAND_INPUT_RECORD_SCHEMA_ARRAY = new CwlElementType("COMMAND_INPUT_RECORD_SCHEMA_ARRAY");
  IElementType COMMAND_LINE_BINDING_FIELD = new CwlElementType("COMMAND_LINE_BINDING_FIELD");
  IElementType COMMAND_LINE_TOOL = new CwlElementType("COMMAND_LINE_TOOL");
  IElementType COMMAND_LINE_TOOL_CLASS = new CwlElementType("COMMAND_LINE_TOOL_CLASS");
  IElementType COMMAND_LINE_TOOL_FIELD = new CwlElementType("COMMAND_LINE_TOOL_FIELD");
  IElementType COMMAND_OUTPUT_ARRAY_ITEMS = new CwlElementType("COMMAND_OUTPUT_ARRAY_ITEMS");
  IElementType COMMAND_OUTPUT_ARRAY_SCHEMA = new CwlElementType("COMMAND_OUTPUT_ARRAY_SCHEMA");
  IElementType COMMAND_OUTPUT_ARRAY_SCHEMA_ARRAY = new CwlElementType("COMMAND_OUTPUT_ARRAY_SCHEMA_ARRAY");
  IElementType COMMAND_OUTPUT_BINDING = new CwlElementType("COMMAND_OUTPUT_BINDING");
  IElementType COMMAND_OUTPUT_BINDING_FIELD = new CwlElementType("COMMAND_OUTPUT_BINDING_FIELD");
  IElementType COMMAND_OUTPUT_ENUM_SCHEMA = new CwlElementType("COMMAND_OUTPUT_ENUM_SCHEMA");
  IElementType COMMAND_OUTPUT_ENUM_SCHEMA_ARRAY = new CwlElementType("COMMAND_OUTPUT_ENUM_SCHEMA_ARRAY");
  IElementType COMMAND_OUTPUT_PARAMETER = new CwlElementType("COMMAND_OUTPUT_PARAMETER");
  IElementType COMMAND_OUTPUT_PARAMETER_FIELD = new CwlElementType("COMMAND_OUTPUT_PARAMETER_FIELD");
  IElementType COMMAND_OUTPUT_RECORD_FIELD = new CwlElementType("COMMAND_OUTPUT_RECORD_FIELD");
  IElementType COMMAND_OUTPUT_RECORD_FIELDS = new CwlElementType("COMMAND_OUTPUT_RECORD_FIELDS");
  IElementType COMMAND_OUTPUT_RECORD_FIELD_TYPE = new CwlElementType("COMMAND_OUTPUT_RECORD_FIELD_TYPE");
  IElementType COMMAND_OUTPUT_RECORD_SCHEMA = new CwlElementType("COMMAND_OUTPUT_RECORD_SCHEMA");
  IElementType COMMAND_OUTPUT_RECORD_SCHEMA_ARRAY = new CwlElementType("COMMAND_OUTPUT_RECORD_SCHEMA_ARRAY");
  IElementType CWL_TYPE = new CwlElementType("CWL_TYPE");
  IElementType CWL_TYPE_ARRAY = new CwlElementType("CWL_TYPE_ARRAY");
  IElementType DIRECTORY = new CwlElementType("DIRECTORY");
  IElementType DIRECTORY_ARRAY = new CwlElementType("DIRECTORY_ARRAY");
  IElementType DIRECTORY_FIELD = new CwlElementType("DIRECTORY_FIELD");
  IElementType DIRENT = new CwlElementType("DIRENT");
  IElementType DIRENT_ARRAY = new CwlElementType("DIRENT_ARRAY");
  IElementType DOCKER_REQUIREMENT = new CwlElementType("DOCKER_REQUIREMENT");
  IElementType DOCKER_REQUIREMENT_FIELD = new CwlElementType("DOCKER_REQUIREMENT_FIELD");
  IElementType ENV_VAR_REQUIREMENT = new CwlElementType("ENV_VAR_REQUIREMENT");
  IElementType FILE_ = new CwlElementType("FILE_");
  IElementType FILE_ARRAY = new CwlElementType("FILE_ARRAY");
  IElementType FILE_FIELD = new CwlElementType("FILE_FIELD");
  IElementType HINTS = new CwlElementType("HINTS");
  IElementType INITIAL_WORKDIR_LISTING = new CwlElementType("INITIAL_WORKDIR_LISTING");
  IElementType INITIAL_WORKDIR_REQUIREMENT = new CwlElementType("INITIAL_WORKDIR_REQUIREMENT");
  IElementType INLINE_JAVASCRIPT_REQUIREMENT = new CwlElementType("INLINE_JAVASCRIPT_REQUIREMENT");
  IElementType INPUTS = new CwlElementType("INPUTS");
  IElementType INPUT_BINDING = new CwlElementType("INPUT_BINDING");
  IElementType INT_ARRAY = new CwlElementType("INT_ARRAY");
  IElementType LABEL = new CwlElementType("LABEL");
  IElementType OUTPUTS = new CwlElementType("OUTPUTS");
  IElementType OUTPUT_BINDING = new CwlElementType("OUTPUT_BINDING");
  IElementType PACKAGES = new CwlElementType("PACKAGES");
  IElementType PERMANENT_FAIL_CODES = new CwlElementType("PERMANENT_FAIL_CODES");
  IElementType RECORD_TYPE = new CwlElementType("RECORD_TYPE");
  IElementType REQUIREMENT = new CwlElementType("REQUIREMENT");
  IElementType REQUIREMENTS = new CwlElementType("REQUIREMENTS");
  IElementType RESOURCE_REQUIREMENT = new CwlElementType("RESOURCE_REQUIREMENT");
  IElementType RESOURCE_REQUIREMENT_FIELD = new CwlElementType("RESOURCE_REQUIREMENT_FIELD");
  IElementType SCHEMA_DEF_REQUIREMENT = new CwlElementType("SCHEMA_DEF_REQUIREMENT");
  IElementType SECONDARY_FILES = new CwlElementType("SECONDARY_FILES");
  IElementType SHELL_COMMAND_REQUIREMENT = new CwlElementType("SHELL_COMMAND_REQUIREMENT");
  IElementType SOFTWARE_PACKAGE = new CwlElementType("SOFTWARE_PACKAGE");
  IElementType SOFTWARE_PACKAGE_ARRAY = new CwlElementType("SOFTWARE_PACKAGE_ARRAY");
  IElementType SOFTWARE_REQUIREMENT = new CwlElementType("SOFTWARE_REQUIREMENT");
  IElementType STDERR = new CwlElementType("STDERR");
  IElementType STDIN = new CwlElementType("STDIN");
  IElementType STDOUT = new CwlElementType("STDOUT");
  IElementType STREAMABLE = new CwlElementType("STREAMABLE");
  IElementType SUCCESS_CODES = new CwlElementType("SUCCESS_CODES");
  IElementType SYMBOLS = new CwlElementType("SYMBOLS");
  IElementType TEMPORARY_FAIL_CODES = new CwlElementType("TEMPORARY_FAIL_CODES");
  IElementType TOOL_DESCRIPTION = new CwlElementType("TOOL_DESCRIPTION");
  IElementType TYPE = new CwlElementType("TYPE");

  IElementType ANY_TYPE_TK = new CwlTokenType("Any");
  IElementType ARRAY_TYPE = new CwlTokenType("ARRAY_TYPE");
  IElementType ARRAY_TYPE_TK = new CwlTokenType("array");
  IElementType BASECOMMAND_TK = new CwlTokenType("baseCommand");
  IElementType BASENAME_TK = new CwlTokenType("basename");
  IElementType BOOLEAN_TK = new CwlTokenType("BOOLEAN_VALUE");
  IElementType BOOLEAN_TYPE_TK = new CwlTokenType("boolean");
  IElementType CHECKSUM_TK = new CwlTokenType("checksum");
  IElementType CLASS_TK = new CwlTokenType("class");
  IElementType COLON_TK = new CwlTokenType(":");
  IElementType COMMAND_LINE_TOOL_TK = new CwlTokenType("CommandLineTool");
  IElementType COMMA_TK = new CwlTokenType(",");
  IElementType CONTENTS_TK = new CwlTokenType("contents");
  IElementType CORES_MAX_TK = new CwlTokenType("CORES_MAX_TK");
  IElementType CORES_MIN_TK = new CwlTokenType("coresMin");
  IElementType CWL_VERSION_TK = new CwlTokenType("cwlVersion");
  IElementType CWL_VERSION_VALUE_TK = new CwlTokenType("v1.0");
  IElementType DEFAULT_TK = new CwlTokenType("default");
  IElementType DIRECTORY_TYPE_TK = new CwlTokenType("Directory");
  IElementType DIRNAME_TK = new CwlTokenType("dirname");
  IElementType DOCKER_FILE_TK = new CwlTokenType("dockerFile");
  IElementType DOCKER_IMAGE_ID_TK = new CwlTokenType("dockerImageId");
  IElementType DOCKER_IMPORT_TK = new CwlTokenType("dockerImport");
  IElementType DOCKER_LOAD_TK = new CwlTokenType("dockerLoad");
  IElementType DOCKER_OUTPUT_DIRECTORY_TK = new CwlTokenType("dockerOutputDirectory");
  IElementType DOCKER_PULL_TK = new CwlTokenType("dockerPull");
  IElementType DOCKER_REQUIREMENT_TK = new CwlTokenType("DockerRequirement");
  IElementType DOC_TK = new CwlTokenType("doc");
  IElementType DOUBLE_TYPE_TK = new CwlTokenType("double");
  IElementType ENTRYNAME_TK = new CwlTokenType("entryname");
  IElementType ENTRY_TK = new CwlTokenType("entry");
  IElementType ENUM_TYPE = new CwlTokenType("ENUM_TYPE");
  IElementType ENUM_TYPE_TK = new CwlTokenType("enum");
  IElementType ENV_DEF_TK = new CwlTokenType("envDef");
  IElementType ENV_NAME_TK = new CwlTokenType("envName");
  IElementType ENV_VALUE_TK = new CwlTokenType("envValue");
  IElementType ENV_VAR_REQUIREMENT_TK = new CwlTokenType("EnvVarRequirement");
  IElementType EXPRESSION_TK = new CwlTokenType("$()");
  IElementType EXPRESSION_TOOL_TK = new CwlTokenType("ExpressionTool");
  IElementType FILE_TYPE = new CwlTokenType("FILE_TYPE");
  IElementType FILE_TYPE_TK = new CwlTokenType("File");
  IElementType FLOAT_TYPE_TK = new CwlTokenType("float");
  IElementType FORMAT_TK = new CwlTokenType("format");
  IElementType GLOB_TK = new CwlTokenType("glob");
  IElementType HINTS_TK = new CwlTokenType("hints");
  IElementType IDENTIFIER_TK = new CwlTokenType("IDENTIFIER");
  IElementType ID_TK = new CwlTokenType("id");
  IElementType INITIAL_WORKDIR_REQUIREMENT_TK = new CwlTokenType("InitialWorkDirRequirement");
  IElementType INLINE_JAVASCRIPT_REQUIREMENT_TK = new CwlTokenType("InlineJavascriptRequirement");
  IElementType INPUTS_TK = new CwlTokenType("inputs");
  IElementType INPUT_BINDING_TK = new CwlTokenType("inputBinding");
  IElementType INT_TK = new CwlTokenType("INT_TK");
  IElementType INT_TYPE_TK = new CwlTokenType("int");
  IElementType ITEM_SEPARATOR_TK = new CwlTokenType("itemSeparator");
  IElementType LABEL_TK = new CwlTokenType("label");
  IElementType LBRACKET_TK = new CwlTokenType("[");
  IElementType LISTING_TK = new CwlTokenType("listing");
  IElementType LOAD_CONTENTS_TK = new CwlTokenType("loadContents");
  IElementType LOCATION_TK = new CwlTokenType("location");
  IElementType LONG_TYPE_TK = new CwlTokenType("long");
  IElementType NAMEEXT_TK = new CwlTokenType("nameext");
  IElementType NAMEROOT_TK = new CwlTokenType("nameroot");
  IElementType NAME_TK = new CwlTokenType("name");
  IElementType NULL_TYPE_TK = new CwlTokenType("null");
  IElementType NUMBER_TK = new CwlTokenType("NUMBER_TK");
  IElementType OUTDIR_MAX_TK = new CwlTokenType("outdirMax");
  IElementType OUTDIR_MIN_TK = new CwlTokenType("outdirMin");
  IElementType OUTPUTS_TK = new CwlTokenType("outputs");
  IElementType OUTPUT_EVAL_TK = new CwlTokenType("outputEval");
  IElementType PACKAGE_TK = new CwlTokenType("package");
  IElementType PATH_TK = new CwlTokenType("path");
  IElementType PERMANENT_FAIL_CODES_TK = new CwlTokenType("permanentFailCodes");
  IElementType POSITION_TK = new CwlTokenType("position");
  IElementType PREFIX_TK = new CwlTokenType("prefix");
  IElementType RAM_MAX_TK = new CwlTokenType("ramMax");
  IElementType RAM_MIN_TK = new CwlTokenType("ramMin");
  IElementType RBRACKET_TK = new CwlTokenType("]");
  IElementType RECORD_TK = new CwlTokenType("record");
  IElementType REQUIREMENTS_TK = new CwlTokenType("requirements");
  IElementType RESOURCE_REQUIREMENT_TK = new CwlTokenType("ResourceRequirement");
  IElementType SCHEMA_DEF_REQUIREMENT_TK = new CwlTokenType("SchemaDefRequirement");
  IElementType SECONDARY_FILES_TK = new CwlTokenType("secondaryFiles");
  IElementType SEPARATE_TK = new CwlTokenType("separate");
  IElementType SHELL_COMMAND_REQUIREMENT_TK = new CwlTokenType("ShellCommandRequirement");
  IElementType SHELL_QUOTE_TK = new CwlTokenType("shellQuote");
  IElementType SIZE_TK = new CwlTokenType("size");
  IElementType SOFTWARE_REQUIREMENT_TK = new CwlTokenType("SoftwareRequirement");
  IElementType SPECS_TK = new CwlTokenType("specs");
  IElementType STDERR_TK = new CwlTokenType("STDERR_TK");
  IElementType STDIN_TK = new CwlTokenType("STDIN_TK");
  IElementType STDOUT_TK = new CwlTokenType("STDOUT_TK");
  IElementType STREAMABLE_TK = new CwlTokenType("streamable");
  IElementType STRING_TK = new CwlTokenType("STRING_VALUE");
  IElementType STRING_TYPE_TK = new CwlTokenType("string");
  IElementType SUCCESS_CODES_TK = new CwlTokenType("successCodes");
  IElementType TEMPORARY_FAIL_CODES_TK = new CwlTokenType("temporaryFailCodes");
  IElementType TMPDIR_MAX_TK = new CwlTokenType("tmpdirMax");
  IElementType TMPDIR_MIN_TK = new CwlTokenType("tmpdirMin");
  IElementType TYPE_TK = new CwlTokenType("type");
  IElementType VALUE_FROM_TK = new CwlTokenType("valueFrom");
  IElementType VERSION_TK = new CwlTokenType("version");
  IElementType WORKFLOW_TK = new CwlTokenType("Workflow");
  IElementType WRITABLE_TK = new CwlTokenType("writable");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARGUMENTS) {
        return new CwlArgumentsImpl(node);
      }
      else if (type == BASE_COMMAND) {
        return new CwlBaseCommandImpl(node);
      }
      else if (type == COMMAND_INPUT_ARRAY_ITEMS) {
        return new CwlCommandInputArrayItemsImpl(node);
      }
      else if (type == COMMAND_INPUT_ARRAY_SCHEMA) {
        return new CwlCommandInputArraySchemaImpl(node);
      }
      else if (type == COMMAND_INPUT_ARRAY_SCHEMA_ARRAY) {
        return new CwlCommandInputArraySchemaArrayImpl(node);
      }
      else if (type == COMMAND_INPUT_ENUM_SCHEMA) {
        return new CwlCommandInputEnumSchemaImpl(node);
      }
      else if (type == COMMAND_INPUT_ENUM_SCHEMA_ARRAY) {
        return new CwlCommandInputEnumSchemaArrayImpl(node);
      }
      else if (type == COMMAND_INPUT_PARAMETER) {
        return new CwlCommandInputParameterImpl(node);
      }
      else if (type == COMMAND_INPUT_PARAMETER_FIELD) {
        return new CwlCommandInputParameterFieldImpl(node);
      }
      else if (type == COMMAND_INPUT_RECORD_FIELD) {
        return new CwlCommandInputRecordFieldImpl(node);
      }
      else if (type == COMMAND_INPUT_RECORD_FIELDS) {
        return new CwlCommandInputRecordFieldsImpl(node);
      }
      else if (type == COMMAND_INPUT_RECORD_FIELD_TYPE) {
        return new CwlCommandInputRecordFieldTypeImpl(node);
      }
      else if (type == COMMAND_INPUT_RECORD_SCHEMA_ARRAY) {
        return new CwlCommandInputRecordSchemaArrayImpl(node);
      }
      else if (type == COMMAND_LINE_BINDING_FIELD) {
        return new CwlCommandLineBindingFieldImpl(node);
      }
      else if (type == COMMAND_LINE_TOOL) {
        return new CwlCommandLineToolImpl(node);
      }
      else if (type == COMMAND_LINE_TOOL_CLASS) {
        return new CwlCommandLineToolClassImpl(node);
      }
      else if (type == COMMAND_LINE_TOOL_FIELD) {
        return new CwlCommandLineToolFieldImpl(node);
      }
      else if (type == COMMAND_OUTPUT_ARRAY_ITEMS) {
        return new CwlCommandOutputArrayItemsImpl(node);
      }
      else if (type == COMMAND_OUTPUT_ARRAY_SCHEMA) {
        return new CwlCommandOutputArraySchemaImpl(node);
      }
      else if (type == COMMAND_OUTPUT_ARRAY_SCHEMA_ARRAY) {
        return new CwlCommandOutputArraySchemaArrayImpl(node);
      }
      else if (type == COMMAND_OUTPUT_BINDING) {
        return new CwlCommandOutputBindingImpl(node);
      }
      else if (type == COMMAND_OUTPUT_BINDING_FIELD) {
        return new CwlCommandOutputBindingFieldImpl(node);
      }
      else if (type == COMMAND_OUTPUT_ENUM_SCHEMA) {
        return new CwlCommandOutputEnumSchemaImpl(node);
      }
      else if (type == COMMAND_OUTPUT_ENUM_SCHEMA_ARRAY) {
        return new CwlCommandOutputEnumSchemaArrayImpl(node);
      }
      else if (type == COMMAND_OUTPUT_PARAMETER) {
        return new CwlCommandOutputParameterImpl(node);
      }
      else if (type == COMMAND_OUTPUT_PARAMETER_FIELD) {
        return new CwlCommandOutputParameterFieldImpl(node);
      }
      else if (type == COMMAND_OUTPUT_RECORD_FIELD) {
        return new CwlCommandOutputRecordFieldImpl(node);
      }
      else if (type == COMMAND_OUTPUT_RECORD_FIELDS) {
        return new CwlCommandOutputRecordFieldsImpl(node);
      }
      else if (type == COMMAND_OUTPUT_RECORD_FIELD_TYPE) {
        return new CwlCommandOutputRecordFieldTypeImpl(node);
      }
      else if (type == COMMAND_OUTPUT_RECORD_SCHEMA) {
        return new CwlCommandOutputRecordSchemaImpl(node);
      }
      else if (type == COMMAND_OUTPUT_RECORD_SCHEMA_ARRAY) {
        return new CwlCommandOutputRecordSchemaArrayImpl(node);
      }
      else if (type == CWL_TYPE) {
        return new CwlCwlTypeImpl(node);
      }
      else if (type == CWL_TYPE_ARRAY) {
        return new CwlCwlTypeArrayImpl(node);
      }
      else if (type == DIRECTORY) {
        return new CwlDirectoryImpl(node);
      }
      else if (type == DIRECTORY_ARRAY) {
        return new CwlDirectoryArrayImpl(node);
      }
      else if (type == DIRECTORY_FIELD) {
        return new CwlDirectoryFieldImpl(node);
      }
      else if (type == DIRENT) {
        return new CwlDirentImpl(node);
      }
      else if (type == DIRENT_ARRAY) {
        return new CwlDirentArrayImpl(node);
      }
      else if (type == DOCKER_REQUIREMENT) {
        return new CwlDockerRequirementImpl(node);
      }
      else if (type == DOCKER_REQUIREMENT_FIELD) {
        return new CwlDockerRequirementFieldImpl(node);
      }
      else if (type == ENV_VAR_REQUIREMENT) {
        return new CwlEnvVarRequirementImpl(node);
      }
      else if (type == FILE_) {
        return new CwlFile_Impl(node);
      }
      else if (type == FILE_ARRAY) {
        return new CwlFileArrayImpl(node);
      }
      else if (type == FILE_FIELD) {
        return new CwlFileFieldImpl(node);
      }
      else if (type == HINTS) {
        return new CwlHintsImpl(node);
      }
      else if (type == INITIAL_WORKDIR_LISTING) {
        return new CwlInitialWorkdirListingImpl(node);
      }
      else if (type == INITIAL_WORKDIR_REQUIREMENT) {
        return new CwlInitialWorkdirRequirementImpl(node);
      }
      else if (type == INLINE_JAVASCRIPT_REQUIREMENT) {
        return new CwlInlineJavascriptRequirementImpl(node);
      }
      else if (type == INPUTS) {
        return new CwlInputsImpl(node);
      }
      else if (type == INPUT_BINDING) {
        return new CwlInputBindingImpl(node);
      }
      else if (type == INT_ARRAY) {
        return new CwlIntArrayImpl(node);
      }
      else if (type == LABEL) {
        return new CwlLabelImpl(node);
      }
      else if (type == OUTPUTS) {
        return new CwlOutputsImpl(node);
      }
      else if (type == OUTPUT_BINDING) {
        return new CwlOutputBindingImpl(node);
      }
      else if (type == PACKAGES) {
        return new CwlPackagesImpl(node);
      }
      else if (type == PERMANENT_FAIL_CODES) {
        return new CwlPermanentFailCodesImpl(node);
      }
      else if (type == RECORD_TYPE) {
        return new CwlRecordTypeImpl(node);
      }
      else if (type == REQUIREMENT) {
        return new CwlRequirementImpl(node);
      }
      else if (type == REQUIREMENTS) {
        return new CwlRequirementsImpl(node);
      }
      else if (type == RESOURCE_REQUIREMENT) {
        return new CwlResourceRequirementImpl(node);
      }
      else if (type == RESOURCE_REQUIREMENT_FIELD) {
        return new CwlResourceRequirementFieldImpl(node);
      }
      else if (type == SCHEMA_DEF_REQUIREMENT) {
        return new CwlSchemaDefRequirementImpl(node);
      }
      else if (type == SECONDARY_FILES) {
        return new CwlSecondaryFilesImpl(node);
      }
      else if (type == SHELL_COMMAND_REQUIREMENT) {
        return new CwlShellCommandRequirementImpl(node);
      }
      else if (type == SOFTWARE_PACKAGE) {
        return new CwlSoftwarePackageImpl(node);
      }
      else if (type == SOFTWARE_PACKAGE_ARRAY) {
        return new CwlSoftwarePackageArrayImpl(node);
      }
      else if (type == SOFTWARE_REQUIREMENT) {
        return new CwlSoftwareRequirementImpl(node);
      }
      else if (type == STDERR) {
        return new CwlStderrImpl(node);
      }
      else if (type == STDIN) {
        return new CwlStdinImpl(node);
      }
      else if (type == STDOUT) {
        return new CwlStdoutImpl(node);
      }
      else if (type == STREAMABLE) {
        return new CwlStreamableImpl(node);
      }
      else if (type == SUCCESS_CODES) {
        return new CwlSuccessCodesImpl(node);
      }
      else if (type == SYMBOLS) {
        return new CwlSymbolsImpl(node);
      }
      else if (type == TEMPORARY_FAIL_CODES) {
        return new CwlTemporaryFailCodesImpl(node);
      }
      else if (type == TOOL_DESCRIPTION) {
        return new CwlToolDescriptionImpl(node);
      }
      else if (type == TYPE) {
        return new CwlTypeImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
