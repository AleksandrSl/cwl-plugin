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
WhiteSpace = [ \t\f\n\r]+
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
        {DecIntegerLiteral}                { return CwlTypes.INT; }
        "array"                            { return CwlTypes.ARRAY_TYPE; }
        "baseCommand"                      { return CwlTypes.BASECOMMAND; }
        "basename"                         { return CwlTypes.BASENAME; }
        {Boolean}                          { return CwlTypes.BOOLEAN; }
        "boolean"                          { return CwlTypes.BOOLEAN_TYPE; }
        "checksum"                         { return CwlTypes.CHECKSUM; }
        "class"                            { return CwlTypes.CLASS; }
        ":"                                { return CwlTypes.COLON; }
        ","                                { return CwlTypes.COMMA; }
        "CommandLineTool"                  { return CwlTypes.COMMAND_LINE_TOOL; }
        "contents"                         { return CwlTypes.CONTENTS; }
        "coresMax"                         { return CwlTypes.CORES_MAX; }
        "coresMin"                         { return CwlTypes.CORES_MIN; }
        "cwlVersion"                       { return CwlTypes.CWL_VERSION; }
        "default"                          { return CwlTypes.DEFAULT; }
        "Directory"                        { return CwlTypes.DIRECTORY_TYPE; }
        "dirname"                          { return CwlTypes.DIRNAME; }
        "doc"                              { return CwlTypes.DOC; }
        "dockerFile"                       { return CwlTypes.DOCKER_FILE; }
        "dockerImageId"                    { return CwlTypes.DOCKER_IMAGE_ID; }
        "dockerImport"                     { return CwlTypes.DOCKER_IMPORT; }
        "dockerLoad"                       { return CwlTypes.DOCKER_LOAD; }
        "dockerOutputDirectory"            { return CwlTypes.DOCKER_OUTPUT_DIRECTORY; }
        "dockerPull"                       { return CwlTypes.DOCKER_PULL; }
        "DockerRequirement"                { return CwlTypes.DOCKER_REQUIREMENT; }
        "double"                           { return CwlTypes.DOUBLE_TYPE; }
        "entry"                            { return CwlTypes.ENTRY; }
        "entryname"                        { return CwlTypes.ENTRYNAME; }
        "enum"                             { return CwlTypes.ENUM_TYPE; }
        "envDef"                           { return CwlTypes.ENV_DEF; }
        "envName"                          { return CwlTypes.ENV_NAME; }
        "envValue"                         { return CwlTypes.ENV_VALUE; }
        "EnvVarRequirement"                { return CwlTypes.ENV_VAR_REQUIREMENT; }
        {Expression}                       { return CwlTypes.EXPRESSION; }
        "ExpressionTool"                   { return CwlTypes.EXPRESSION_TOOL; }
        "File"                             { return CwlTypes.FILE_TYPE; }
        "float"                            { return CwlTypes.FLOAT_TYPE; }
        "format"                           { return CwlTypes.FORMAT; }
        "glob"                             { return CwlTypes.GLOB; }
        "hints"                            { return CwlTypes.HINTS; }
        "id"                               { return CwlTypes.ID; }
        "InitialWorkDirRequirement"        { return CwlTypes.INITIAL_WORKDIR_REQUIREMENT; }
        "InlineJavascriptRequirement"      { return CwlTypes.INLINE_JAVASCRIPT_REQUIREMENT; }
        "inputBinding"                     { return CwlTypes.INPUT_BINDING; }
        "inputs"                           { return CwlTypes.INPUTS_TK; }
        "int"                              { return CwlTypes.INT_TYPE; }
        "itemSeparator"                    { return CwlTypes.ITEM_SEPARATOR; }
        "label"                            { return CwlTypes.LABEL; }
        "["                                { return CwlTypes.LBRACKET; }
        "listing"                          { return CwlTypes.LISTING; }
        "loadContents"                     { return CwlTypes.LOAD_CONTENTS; }
        "location"                         { return CwlTypes.LOCATION; }
        "long"                             { return CwlTypes.LONG_TYPE; }
        "name"                             { return CwlTypes.NAME; }
        "nameext"                          { return CwlTypes.NAMEEXT; }
        "nameroot"                         { return CwlTypes.NAMEROOT; }
        "null"                             { return CwlTypes.NULL_TYPE; }
        "outdirMax"                        { return CwlTypes.OUTDIR_MAX; }
        "outdirMin"                        { return CwlTypes.OUTDIR_MIN; }
        "outputEval"                       { return CwlTypes.OUTPUT_EVAL; }
        "outputs"                          { return CwlTypes.OUTPUTS; }
        "package"                          { return CwlTypes.PACKAGE; }
        "path"                             { return CwlTypes.PATH; }
        "position"                         { return CwlTypes.POSITION; }
        "prefix"                           { return CwlTypes.PREFIX; }
        "ramMax"                           { return CwlTypes.RAM_MAX; }
        "ramMin"                           { return CwlTypes.RAM_MIN; }
        "]"                                { return CwlTypes.RBRACKET; }
        "record"                           { return CwlTypes.RECORD; }
        "requirements"                     { return CwlTypes.REQUIREMENTS_TK; }
        "ResourceRequirement"              { return CwlTypes.RESOURCE_REQUIREMENT; }
        "SchemaDefRequirement"             { return CwlTypes.SCHEMA_DEF_REQUIREMENT; }
        "secondaryFiles"                   { return CwlTypes.SECONDARY_FILES; }
        "separate"                         { return CwlTypes.SEPARATE; }
        "ShellCommandRequirement"          { return CwlTypes.SHELL_COMMAND_REQUIREMENT; }
        "shellQuote"                       { return CwlTypes.SHELL_QUOTE; }
        "size"                             { return CwlTypes.SIZE; }
        "SoftwareRequirement"              { return CwlTypes.SOFTWARE_REQUIREMENT; }
        "specs"                            { return CwlTypes.SPECS; }
        "streamable"                       { return CwlTypes.STREAMABLE; }
        "string"                           { return CwlTypes.STRING_TYPE; }
        "tmpdirMax"                        { return CwlTypes.TMPDIR_MAX; }
        "tmpdirMin"                        { return CwlTypes.TMPDIR_MIN; }
        "type"                             { return CwlTypes.TYPE; }
        "valueFrom"                        { return CwlTypes.VALUE_FROM; }
        "v1.0"                             { return CwlTypes.CWL_VERSION_VALUE; }
        "version"                          { return CwlTypes.VERSION; }
        "Workflow"                         { return CwlTypes.WORKFLOW; }
        "writable"                         { return CwlTypes.WRITABLE; }
        {Identifier}                       { return CwlTypes.IDENTIFIER; }
        {String}                           { return CwlTypes.STRING;}
    }
    .                                      { return TokenType.BAD_CHARACTER;}