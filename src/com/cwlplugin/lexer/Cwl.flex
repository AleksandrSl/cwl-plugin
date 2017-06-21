package com.cwlplugin.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.cwlplugin.parser.CwlTokenTypes;

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
Comment = {EndOfLineComment}
// Comment can be the last line of the file, without line terminator
EndOfLineComment = "#"{InputCharacter}*
// Put constrains on identifier myself. I don't see meaning in identifiers like "*&&****&" or uyutut&&&%
Identifier = [:jletter:] [:jletterdigit:]*
DecIntegerLiteral = 0 | [1-9][0-9]*
SimpleString = \"[^\"\r\n]*\"
BareString = [^\n\r\(:\),\"]+
String = {BareString} | {SimpleString}
Expression = \$\(.*\) | \$\{.*\}

Boolean = True | False

%state STRING
%%


    <YYINITIAL> {

        [\ ]                               { return CwlTokenTypes.SPACE; }
        [\t]                               { return CwlTokenTypes.TAB; }
        [\f]                               { return CwlTokenTypes.FORMFEED; }
        {LineTerminator}                   { return CwlTokenTypes.LINE_BREAK; }
//        "|"                                { yybegin(MULTILINE_STRING); }
        "- "                               { return CwlTokenTypes.SEQUENCE_ELEMENT_PREFIX; }
        {Comment}                          { return CwlTokenTypes.END_OF_LINE_COMMENT; }
        {DecIntegerLiteral}                { return CwlTokenTypes.INT; }
        "array"                            { return CwlTokenTypes.ARRAY_TYPE_KEYWORD; }
        "baseCommand"                      { return CwlTokenTypes.BASECOMMAND_KEYWORD; }
        "basename"                         { return CwlTokenTypes.BASENAME_KEYWORD; }
        {Boolean}                          { return CwlTokenTypes.BOOLEAN; }
        "boolean"                          { return CwlTokenTypes.BOOLEAN_TYPE_KEYWORD; }
        "checksum"                         { return CwlTokenTypes.CHECKSUM_KEYWORD; }
        "class"                            { return CwlTokenTypes.CLASS_KEYWORD; }
        ":"                                { return CwlTokenTypes.COLON; }
        ","                                { return CwlTokenTypes.COMMA; }
        "CommandLineTool"                  { return CwlTokenTypes.COMMAND_LINE_TOOL_KEYWORD; }
        "contents"                         { return CwlTokenTypes.CONTENTS_KEYWORD; }
        "coresMax"                         { return CwlTokenTypes.CORES_MAX_KEYWORD; }
        "coresMin"                         { return CwlTokenTypes.CORES_MIN_KEYWORD; }
        "cwlVersion"                       { return CwlTokenTypes.CWL_VERSION; }
        "default"                          { return CwlTokenTypes.DEFAULT_KEYWORD; }
        "Directory"                        { return CwlTokenTypes.DIRECTORY_TYPE_KEYWORD; }
        "dirname"                          { return CwlTokenTypes.DIRNAME_KEYWORD; }
        "doc"                              { return CwlTokenTypes.DOC_KEYWORD; }
        "dockerFile"                       { return CwlTokenTypes.DOCKER_FILE_KEYWORD; }
        "dockerImageId"                    { return CwlTokenTypes.DOCKER_IMAGE_ID_KEYWORD; }
        "dockerImport"                     { return CwlTokenTypes.DOCKER_IMPORT_KEYWORD; }
        "dockerLoad"                       { return CwlTokenTypes.DOCKER_LOAD_KEYWORD; }
        "dockerOutputDirectory"            { return CwlTokenTypes.DOCKER_OUTPUT_DIRECTORY_KEYWORD; }
        "dockerPull"                       { return CwlTokenTypes.DOCKER_PULL_KEYWORD; }
        "DockerRequirement"                { return CwlTokenTypes.DOCKER_REQUIREMENT_KEYWORD; }
        "double"                           { return CwlTokenTypes.DOUBLE_TYPE_KEYWORD; }
        "entry"                            { return CwlTokenTypes.ENTRY_KEYWORD; }
        "entryname"                        { return CwlTokenTypes.ENTRYNAME_KEYWORD; }
        "enum"                             { return CwlTokenTypes.ENUM_TYPE_KEYWORD; }
        "envDef"                           { return CwlTokenTypes.ENV_DEF_KEYWORD; }
        "envName"                          { return CwlTokenTypes.ENV_NAME_KEYWORD; }
        "envValue"                         { return CwlTokenTypes.ENV_VALUE_KEYWORD; }
        "EnvVarRequirement"                { return CwlTokenTypes.ENV_VAR_REQUIREMENT_KEYWORD; }
        {Expression}                       { return CwlTokenTypes.EXPRESSION; }
        "ExpressionTool"                   { return CwlTokenTypes.EXPRESSION_TOOL_KEYWORD; }
        "File"                             { return CwlTokenTypes.FILE_TYPE_KEYWORD; }
        "float"                            { return CwlTokenTypes.FLOAT_TYPE_KEYWORD; }
        "format"                           { return CwlTokenTypes.FORMAT_KEYWORD; }
        "glob"                             { return CwlTokenTypes.GLOB_KEYWORD; }
        "hints"                            { return CwlTokenTypes.HINTS_KEYWORD; }
        "id"                               { return CwlTokenTypes.ID_KEYWORD; }
        "InitialWorkDirRequirement"        { return CwlTokenTypes.INITIAL_WORKDIR_REQUIREMENT_KEYWORD; }
        "InlineJavascriptRequirement"      { return CwlTokenTypes.INLINE_JAVASCRIPT_REQUIREMENT_KEYWORD; }
        "inputBinding"                     { return CwlTokenTypes.INPUT_BINDING_KEYWORD; }
        "inputs"                           { return CwlTokenTypes.INPUTS_KEYWORD; }
        "int"                              { return CwlTokenTypes.INT_TYPE_KEYWORD; }
        "itemSeparator"                    { return CwlTokenTypes.ITEM_SEPARATOR_KEYWORD; }
        "label"                            { return CwlTokenTypes.LABEL_KEYWORD; }
        "["                                { return CwlTokenTypes.LBRACKET; }
        "listing"                          { return CwlTokenTypes.LISTING_KEYWORD; }
        "loadContents"                     { return CwlTokenTypes.LOAD_CONTENTS_KEYWORD; }
        "location"                         { return CwlTokenTypes.LOCATION_KEYWORD; }
        "long"                             { return CwlTokenTypes.LONG_TYPE_KEYWORD; }
        "name"                             { return CwlTokenTypes.NAME_KEYWORD; }
        "nameext"                          { return CwlTokenTypes.NAMEEXT_KEYWORD; }
        "nameroot"                         { return CwlTokenTypes.NAMEROOT_KEYWORD; }
        "null"                             { return CwlTokenTypes.NULL_TYPE_KEYWORD; }
        "outdirMax"                        { return CwlTokenTypes.OUTDIR_MAX_KEYWORD; }
        "outdirMin"                        { return CwlTokenTypes.OUTDIR_MIN_KEYWORD; }
        "outputEval"                       { return CwlTokenTypes.OUTPUT_EVAL_KEYWORD; }
        "outputs"                          { return CwlTokenTypes.OUTPUTS_KEYWORD; }
        "package"                          { return CwlTokenTypes.PACKAGE_KEYWORD; }
        "path"                             { return CwlTokenTypes.PATH_KEYWORD; }
        "position"                         { return CwlTokenTypes.POSITION_KEYWORD; }
        "prefix"                           { return CwlTokenTypes.PREFIX_KEYWORD; }
        "ramMax"                           { return CwlTokenTypes.RAM_MAX_KEYWORD; }
        "ramMin"                           { return CwlTokenTypes.RAM_MIN_KEYWORD; }
        "]"                                { return CwlTokenTypes.RBRACKET; }
        "record"                           { return CwlTokenTypes.RECORD_KEYWORD; }
        "requirements"                     { return CwlTokenTypes.REQUIREMENTS_KEYWORD; }
        "ResourceRequirement"              { return CwlTokenTypes.RESOURCE_REQUIREMENT_KEYWORD; }
        "SchemaDefRequirement"             { return CwlTokenTypes.SCHEMA_DEF_REQUIREMENT_KEYWORD; }
        "secondaryFiles"                   { return CwlTokenTypes.SECONDARY_FILES_KEYWORD; }
        "separate"                         { return CwlTokenTypes.SEPARATE_KEYWORD; }
        "ShellCommandRequirement"          { return CwlTokenTypes.SHELL_COMMAND_REQUIREMENT_KEYWORD; }
        "shellQuote"                       { return CwlTokenTypes.SHELL_QUOTE_KEYWORD; }
        "size"                             { return CwlTokenTypes.SIZE_KEYWORD; }
        "SoftwareRequirement"              { return CwlTokenTypes.SOFTWARE_REQUIREMENT_KEYWORD; }
        "specs"                            { return CwlTokenTypes.SPECS_KEYWORD; }
        "streamable"                       { return CwlTokenTypes.STREAMABLE_KEYWORD; }
        "string"                           { return CwlTokenTypes.STRING_TYPE_KEYWORD; }
        "tmpdirMax"                        { return CwlTokenTypes.TMPDIR_MAX_KEYWORD; }
        "tmpdirMin"                        { return CwlTokenTypes.TMPDIR_MIN_KEYWORD; }
        "type"                             { return CwlTokenTypes.TYPE_KEYWORD; }
        "valueFrom"                        { return CwlTokenTypes.VALUE_FROM_KEYWORD; }
        "v1.0"                             { return CwlTokenTypes.CWL_VERSION_VALUE; }
        "version"                          { return CwlTokenTypes.VERSION_KEYWORD; }
        "Workflow"                         { return CwlTokenTypes.WORKFLOW_KEYWORD; }
        "writable"                         { return CwlTokenTypes.WRITABLE_KEYWORD; }
//        {Identifier}                       { return CwlTokenTypes.IDENTIFIER; }
        {String}                           { return CwlTokenTypes.STRING;}
    }
    .                                      { return TokenType.BAD_CHARACTER;}