package com.cwlplugin.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.cwlplugin.psi.CwlTypes;

import java.util.ArrayList;
import java.util.List;

%%

%class _CwlLexer
%{
  public _CwlLexer() {
    this((java.io.Reader)null);
  }
%}
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{
    return;
%eof}

/* To maintain portability, tab characters must not be used in indentation, since different systems treat tabs differently. Note that
/   most modern editors may be configured so that pressing the tab key results in the insertion of an appropriate number of spaces.
/   The amount of indentation is a presentation detail and must not be used to convey content information.
/  [63] s-indent(n) ::= s-space × n
*/

/*
A block style construct is terminated when encountering a line which is less indented than the construct. The productions use the
notation “s-indent(<n)” and “s-indent(≤n)” to express this.
[64] s-indent(<n) ::= s-space × m /* Where m < n */
[65] s-indent(≤n) ::= s-space × m /* Where m ≤ n */
 */


// Whitespaces
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = [ \t\f\n\r]
// Comment
Comment = {TraditionalComment}
// Comment can be the last line of the file, without line terminator
TraditionalComment = "#" {InputCharacter}* {LineTerminator}?
// Put constrains on identifier myself. I don't see meaning in identifiers like "*&&****&" or uyutut&&&%
Identifier = [:jletter:] [:jletterdigit:]*
DecIntegerLiteral = 0 | [1-9][0-9]*
SimpleString = \" [^\r\n]* \"
BareString = [^\n\r\(: \)]+
String = {BareString} | {SimpleString}
Expression = \$\(.*\) | \$\{.*\}

Boolean = True | False
%state STRING

%%
    <YYINITIAL> {
//        "|"                                { yybegin(MULTILINE_STRING); }

        {WhiteSpace}                       { return TokenType.WHITE_SPACE; }
        {DecIntegerLiteral}                { return CwlTypes.INT_TK; }
        {Comment}                          { return CwlLexerTypes.COMMENT; }
        "array"                            { return CwlTypes.ARRAY_TYPE_TK; }
        "baseCommand"                      { return CwlTypes.BASECOMMAND_TK; }
        "basename"                         { return CwlTypes.BASENAME_TK; }
        {Boolean}                          { return CwlTypes.BOOLEAN_TK; }
        "boolean"                          { return CwlTypes.BOOLEAN_TYPE_TK; }
        "checksum"                         { return CwlTypes.CHECKSUM_TK; }
        "class"                            { return CwlTypes.CLASS_TK; }
        ":"                                { return CwlTypes.COLON_TK; }
        ","                                { return CwlTypes.COMMA_TK; }
        "CommandLineTool"                  { return CwlTypes.COMMAND_LINE_TOOL_TK; }
        "contents"                         { return CwlTypes.CONTENTS_TK; }
        "coresMax"                         { return CwlTypes.CORES_MAX_TK; }
        "coresMin"                         { return CwlTypes.CORES_MIN_TK; }
        "cwlVersion"                       { return CwlTypes.CWL_VERSION_TK; }
        "default"                          { return CwlTypes.DEFAULT_TK; }
        "Directory"                        { return CwlTypes.DIRECTORY_TYPE_TK; }
        "dirname"                          { return CwlTypes.DIRNAME_TK; }
        "doc"                              { return CwlTypes.DOC_TK; }
        "dockerFile"                       { return CwlTypes.DOCKER_FILE_TK; }
        "dockerImageId"                    { return CwlTypes.DOCKER_IMAGE_ID_TK; }
        "dockerImport"                     { return CwlTypes.DOCKER_IMPORT_TK; }
        "dockerLoad"                       { return CwlTypes.DOCKER_LOAD_TK; }
        "dockerOutputDirectory"            { return CwlTypes.DOCKER_OUTPUT_DIRECTORY_TK; }
        "dockerPull"                       { return CwlTypes.DOCKER_PULL_TK; }
        "DockerRequirement"                { return CwlTypes.DOCKER_REQUIREMENT_TK; }
        "double"                           { return CwlTypes.DOUBLE_TYPE_TK; }
        "entry"                            { return CwlTypes.ENTRY_TK; }
        "entryname"                        { return CwlTypes.ENTRYNAME_TK; }
        "enum"                             { return CwlTypes.ENUM_TYPE_TK; }
        "envDef"                           { return CwlTypes.ENV_DEF_TK; }
        "envName"                          { return CwlTypes.ENV_NAME_TK; }
        "envValue"                         { return CwlTypes.ENV_VALUE_TK; }
        "EnvVarRequirement"                { return CwlTypes.ENV_VAR_REQUIREMENT_TK; }
        {Expression}                       { return CwlTypes.EXPRESSION_TK; }
        "ExpressionTool"                   { return CwlTypes.EXPRESSION_TOOL_TK; }
        "File"                             { return CwlTypes.FILE_TYPE_TK; }
        "float"                            { return CwlTypes.FLOAT_TYPE_TK; }
        "format"                           { return CwlTypes.FORMAT_TK; }
        "glob"                             { return CwlTypes.GLOB_TK; }
        "hints"                            { return CwlTypes.HINTS_TK; }
        "id"                               { return CwlTypes.ID_TK; }
        "InitialWorkDirRequirement"        { return CwlTypes.INITIAL_WORKDIR_REQUIREMENT_TK; }
        "InlineJavascriptRequirement"      { return CwlTypes.INLINE_JAVASCRIPT_REQUIREMENT_TK; }
        "inputBinding"                     { return CwlTypes.INPUT_BINDING_TK; }
        "inputs"                           { return CwlTypes.INPUTS_TK; }
        "int"                              { return CwlTypes.INT_TYPE_TK; }
        "itemSeparator"                    { return CwlTypes.ITEM_SEPARATOR_TK; }
        "label"                            { return CwlTypes.LABEL_TK; }
        "["                                { return CwlTypes.LBRACKET_TK; }
        "listing"                          { return CwlTypes.LISTING_TK; }
        "loadContents"                     { return CwlTypes.LOAD_CONTENTS_TK; }
        "location"                         { return CwlTypes.LOCATION_TK; }
        "long"                             { return CwlTypes.LONG_TYPE_TK; }
        "name"                             { return CwlTypes.NAME_TK; }
        "nameext"                          { return CwlTypes.NAMEEXT_TK; }
        "nameroot"                         { return CwlTypes.NAMEROOT_TK; }
        "null"                             { return CwlTypes.NULL_TYPE_TK; }
        "outdirMax"                        { return CwlTypes.OUTDIR_MAX_TK; }
        "outdirMin"                        { return CwlTypes.OUTDIR_MIN_TK; }
        "outputEval"                       { return CwlTypes.OUTPUT_EVAL_TK; }
        "outputs"                          { return CwlTypes.OUTPUTS_TK; }
        "package"                          { return CwlTypes.PACKAGE_TK; }
        "path"                             { return CwlTypes.PATH_TK; }
        "position"                         { return CwlTypes.POSITION_TK; }
        "prefix"                           { return CwlTypes.PREFIX_TK; }
        "ramMax"                           { return CwlTypes.RAM_MAX_TK; }
        "ramMin"                           { return CwlTypes.RAM_MIN_TK; }
        "]"                                { return CwlTypes.RBRACKET_TK; }
        "record"                           { return CwlTypes.RECORD_TK; }
        "requirements"                     { return CwlTypes.REQUIREMENTS_TK; }
        "ResourceRequirement"              { return CwlTypes.RESOURCE_REQUIREMENT_TK; }
        "SchemaDefRequirement"             { return CwlTypes.SCHEMA_DEF_REQUIREMENT_TK; }
        "secondaryFiles"                   { return CwlTypes.SECONDARY_FILES_TK; }
        "separate"                         { return CwlTypes.SEPARATE_TK; }
        "ShellCommandRequirement"          { return CwlTypes.SHELL_COMMAND_REQUIREMENT_TK; }
        "shellQuote"                       { return CwlTypes.SHELL_QUOTE_TK; }
        "size"                             { return CwlTypes.SIZE_TK; }
        "SoftwareRequirement"              { return CwlTypes.SOFTWARE_REQUIREMENT_TK; }
        "specs"                            { return CwlTypes.SPECS_TK; }
        "streamable"                       { return CwlTypes.STREAMABLE_TK; }
        "string"                           { return CwlTypes.STRING_TYPE_TK; }
        "tmpdirMax"                        { return CwlTypes.TMPDIR_MAX_TK; }
        "tmpdirMin"                        { return CwlTypes.TMPDIR_MIN_TK; }
        "type"                             { return CwlTypes.TYPE_TK; }
        "valueFrom"                        { return CwlTypes.VALUE_FROM_TK; }
        "v1.0"                             { return CwlTypes.CWL_VERSION_VALUE_TK; }
        "version"                          { return CwlTypes.VERSION_TK; }
        "Workflow"                         { return CwlTypes.WORKFLOW_TK; }
        "writable"                         { return CwlTypes.WRITABLE_TK; }
        {Identifier}                       { return CwlTypes.IDENTIFIER_TK; }
        {String}                           { return CwlTypes.STRING_TK;}
    }
    .                                      { return TokenType.BAD_CHARACTER;}