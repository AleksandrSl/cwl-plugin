// This is a generated file. Not intended for manual editing.
package com.cwlplugin.psi;

import com.cwlplugin.psi.impl.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

public interface CwlTypes {

  IElementType COMMAND_INPUT_ARRAY_ITEMS = new CwlElementType("COMMAND_INPUT_ARRAY_ITEMS");
  IElementType COMMAND_INPUT_ARRAY_SCHEMA = new CwlElementType("COMMAND_INPUT_ARRAY_SCHEMA");
  IElementType COMMAND_INPUT_ARRAY_SCHEMA_ARRAY = new CwlElementType("COMMAND_INPUT_ARRAY_SCHEMA_ARRAY");
  IElementType COMMAND_INPUT_ENUM_SCHEMA = new CwlElementType("COMMAND_INPUT_ENUM_SCHEMA");
  IElementType COMMAND_INPUT_ENUM_SCHEMA_ARRAY = new CwlElementType("COMMAND_INPUT_ENUM_SCHEMA_ARRAY");
  IElementType COMMAND_INPUT_PARAMETER_FIELD = new CwlElementType("COMMAND_INPUT_PARAMETER_FIELD");
  IElementType COMMAND_INPUT_RECORD_FIELD = new CwlElementType("COMMAND_INPUT_RECORD_FIELD");
  IElementType COMMAND_INPUT_RECORD_FIELDS = new CwlElementType("COMMAND_INPUT_RECORD_FIELDS");
  IElementType COMMAND_INPUT_RECORD_FIELD_TYPE = new CwlElementType("COMMAND_INPUT_RECORD_FIELD_TYPE");
  IElementType COMMAND_INPUT_RECORD_SCHEMA_ARRAY = new CwlElementType("COMMAND_INPUT_RECORD_SCHEMA_ARRAY");
  IElementType COMMAND_LINE_BINDING_FIELD = new CwlElementType("COMMAND_LINE_BINDING_FIELD");
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
  IElementType FILE = new CwlElementType("FILE");
  IElementType FILE_ARRAY = new CwlElementType("FILE_ARRAY");
  IElementType FILE_FIELD = new CwlElementType("FILE_FIELD");
  IElementType INITIAL_WORKDIR_LISTING = new CwlElementType("INITIAL_WORKDIR_LISTING");
  IElementType INT_ARRAY = new CwlElementType("INT_ARRAY");
  IElementType OUTPUT_BINDING = new CwlElementType("OUTPUT_BINDING");
  IElementType PACKAGES = new CwlElementType("PACKAGES");
  IElementType RECORD_TYPE = new CwlElementType("RECORD_TYPE");
  IElementType REQUIREMENT = new CwlElementType("REQUIREMENT");
  IElementType RESOURCE_REQUIREMENT_FIELD = new CwlElementType("RESOURCE_REQUIREMENT_FIELD");
  IElementType SOFTWARE_PACKAGE = new CwlElementType("SOFTWARE_PACKAGE");
  IElementType SOFTWARE_PACKAGE_ARRAY = new CwlElementType("SOFTWARE_PACKAGE_ARRAY");
  IElementType SYMBOLS = new CwlElementType("SYMBOLS");

  IElementType ANY = new CwlTokenType(".*");
  IElementType ARRAY_TYPE = new CwlTokenType("array");
  IElementType BASECOMMAND = new CwlTokenType("baseCommand");
  IElementType BASENAME = new CwlTokenType("basename");
  IElementType BOOLEAN = new CwlTokenType("True");
  IElementType BOOLEAN_TYPE = new CwlTokenType("boolean");
  IElementType CHECKSUM = new CwlTokenType("checksum");
  IElementType CLASS = new CwlTokenType("class");
  IElementType COLON = new CwlTokenType(":");
  IElementType COMMA = new CwlTokenType(",");
  IElementType COMMAND_LINE_TOOL = new CwlTokenType("CommandLineTool");
  IElementType CONTENTS = new CwlTokenType("contents");
  IElementType CORES_MAX = new CwlTokenType("CORES_MAX");
  IElementType CORES_MIN = new CwlTokenType("coresMin");
  IElementType CWL_VERSION = new CwlTokenType("cwlVersion");
  IElementType CWL_VERSION_VALUE = new CwlTokenType("v1.0");
  IElementType DEDENT = new CwlTokenType("Deindentation");
  IElementType DEFAULT = new CwlTokenType("default");
  IElementType DIRECTORY_TYPE = new CwlTokenType("Directory");
  IElementType DIRNAME = new CwlTokenType("dirname");
  IElementType DOC = new CwlTokenType("doc");
  IElementType DOCKER_FILE = new CwlTokenType("dockerFile");
  IElementType DOCKER_IMAGE_ID = new CwlTokenType("dockerImageId");
  IElementType DOCKER_IMPORT = new CwlTokenType("dockerImport");
  IElementType DOCKER_LOAD = new CwlTokenType("dockerLoad");
  IElementType DOCKER_OUTPUT_DIRECTORY = new CwlTokenType("dockerOutputDirectory");
  IElementType DOCKER_PULL = new CwlTokenType("dockerPull");
  IElementType DOCKER_REQUIREMENT = new CwlTokenType("DockerRequirement");
  IElementType DOUBLE_TYPE = new CwlTokenType("double");
  IElementType ENTRY = new CwlTokenType("entry");
  IElementType ENTRYNAME = new CwlTokenType("entryname");
  IElementType ENUM_TYPE = new CwlTokenType("enum");
  IElementType ENV_DEF = new CwlTokenType("envDef");
  IElementType ENV_NAME = new CwlTokenType("envName");
  IElementType ENV_VALUE = new CwlTokenType("envValue");
  IElementType ENV_VAR_REQUIREMENT = new CwlTokenType("EnvVarRequirement");
  IElementType EXPRESSION = new CwlTokenType("$()");
  IElementType EXPRESSION_TOOL = new CwlTokenType("ExpressionTool");
  IElementType FILE_TYPE = new CwlTokenType("File");
  IElementType FLOAT_TYPE = new CwlTokenType("float");
  IElementType FORMAT = new CwlTokenType("format");
  IElementType GLOB = new CwlTokenType("glob");
  IElementType HINTS = new CwlTokenType("hints");
  IElementType ID = new CwlTokenType("id");
  IElementType IDENTIFIER = new CwlTokenType("input_file");
  IElementType INDENT = new CwlTokenType("Indentation");
  IElementType INITIAL_WORKDIR_REQUIREMENT = new CwlTokenType("InitialWorkDirRequirement");
  IElementType INLINE_JAVASCRIPT_REQUIREMENT = new CwlTokenType("InlineJavascriptRequirement");
  IElementType INPUTS = new CwlTokenType("inputs");
  IElementType INPUT_BINDING = new CwlTokenType("inputBinding");
  IElementType INT = new CwlTokenType("INT");
  IElementType INT_TYPE = new CwlTokenType("int");
  IElementType ITEM_SEPARATOR = new CwlTokenType("itemSeparator");
  IElementType LABEL = new CwlTokenType("label");
  IElementType LBRACKET = new CwlTokenType("[");
  IElementType LISTING = new CwlTokenType("listing");
  IElementType LOAD_CONTENTS = new CwlTokenType("loadContents");
  IElementType LOCATION = new CwlTokenType("location");
  IElementType LONG_TYPE = new CwlTokenType("long");
  IElementType NAME = new CwlTokenType("name");
  IElementType NAMEEXT = new CwlTokenType("nameext");
  IElementType NAMEROOT = new CwlTokenType("nameroot");
  IElementType NULL_TYPE = new CwlTokenType("null");
  IElementType NUMBER = new CwlTokenType("NUMBER");
  IElementType OUTDIR_MAX = new CwlTokenType("outdirMax");
  IElementType OUTDIR_MIN = new CwlTokenType("outdirMin");
  IElementType OUTPUTS = new CwlTokenType("outputs");
  IElementType OUTPUT_EVAL = new CwlTokenType("outputEval");
  IElementType PACKAGE = new CwlTokenType("package");
  IElementType PATH = new CwlTokenType("path");
  IElementType PERMANENT_FAIL_CODES = new CwlTokenType("permanentFailCodes");
  IElementType POSITION = new CwlTokenType("position");
  IElementType PREFIX = new CwlTokenType("prefix");
  IElementType RAM_MAX = new CwlTokenType("ramMax");
  IElementType RAM_MIN = new CwlTokenType("ramMin");
  IElementType RBRACKET = new CwlTokenType("]");
  IElementType RECORD = new CwlTokenType("record");
  IElementType REQUIREMENTS = new CwlTokenType("requirements");
  IElementType RESOURCE_REQUIREMENT = new CwlTokenType("ResourceRequirement");
  IElementType SCHEMA_DEF_REQUIREMENT = new CwlTokenType("SchemaDefRequirement");
  IElementType SECONDARY_FILES = new CwlTokenType("secondaryFiles");
  IElementType SEPARATE = new CwlTokenType("separate");
  IElementType SHELL_COMMAND_REQUIREMENT = new CwlTokenType("ShellCommandRequirement");
  IElementType SHELL_QUOTE = new CwlTokenType("shellQuote");
  IElementType SIZE = new CwlTokenType("size");
  IElementType SOFTWARE_REQUIREMENT = new CwlTokenType("SoftwareRequirement");
  IElementType SPECS = new CwlTokenType("specs");
  IElementType STREAMABLE = new CwlTokenType("streamable");
  IElementType STRING = new CwlTokenType("some_string");
  IElementType STRING_TYPE = new CwlTokenType("string");
  IElementType SUCCESS_CODES = new CwlTokenType("successCodes");
  IElementType TEMPORARY_FAIL_CODES = new CwlTokenType("temporaryFailCodes");
  IElementType TMPDIR_MAX = new CwlTokenType("tmpdirMax");
  IElementType TMPDIR_MIN = new CwlTokenType("tmpdirMin");
  IElementType TYPE = new CwlTokenType("type");
  IElementType VALUE_FROM = new CwlTokenType("valueFrom");
  IElementType VERSION = new CwlTokenType("version");
  IElementType WORKFLOW = new CwlTokenType("Workflow");
  IElementType WRITABLE = new CwlTokenType("writable");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == COMMAND_INPUT_ARRAY_ITEMS) {
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
      else if (type == FILE) {
        return new CwlFileImpl(node);
      }
      else if (type == FILE_ARRAY) {
        return new CwlFileArrayImpl(node);
      }
      else if (type == FILE_FIELD) {
        return new CwlFileFieldImpl(node);
      }
      else if (type == INITIAL_WORKDIR_LISTING) {
        return new CwlInitialWorkdirListingImpl(node);
      }
      else if (type == INT_ARRAY) {
        return new CwlIntArrayImpl(node);
      }
      else if (type == OUTPUT_BINDING) {
        return new CwlOutputBindingImpl(node);
      }
      else if (type == PACKAGES) {
        return new CwlPackagesImpl(node);
      }
      else if (type == RECORD_TYPE) {
        return new CwlRecordTypeImpl(node);
      }
      else if (type == REQUIREMENT) {
        return new CwlRequirementImpl(node);
      }
      else if (type == RESOURCE_REQUIREMENT_FIELD) {
        return new CwlResourceRequirementFieldImpl(node);
      }
      else if (type == SOFTWARE_PACKAGE) {
        return new CwlSoftwarePackageImpl(node);
      }
      else if (type == SOFTWARE_PACKAGE_ARRAY) {
        return new CwlSoftwarePackageArrayImpl(node);
      }
      else if (type == SYMBOLS) {
        return new CwlSymbolsImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
