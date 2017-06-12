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

  private int currentIndent = 0;
  private List<Integer> indentStack = new ArrayList<Integer>();

  private static <T> T beforeLast(List<T> list){
    return list.get(list.size() - 2);
  }

  private static <T> T last(List<T> list){
      return list.get(list.size() - 1);
  }

  private IElementType getWhitespaceTypeAndUpdateIndent() {
      String text = yytext().toString();
      // Handle all types of line endings
      int lastLineTerminator = text.lastIndexOf("\n");
      if (lastLineTerminator == -1) {
          lastLineTerminator = text.lastIndexOf("\r");
      }
      // If there is no line endings, then it is a white space between words
      if (lastLineTerminator == -1) {
          return TokenType.WHITE_SPACE;
      } else {
          // Logger, don't hear such word
          System.out.println("Line term is present");
          /* There can be lies with white space symbols only, they should be ignored
           * So get all white spaces after last line ending - they will mark current indentation
           */
          currentIndent = (text.length() - lastLineTerminator - 1);
          System.out.println(currentIndent);
          /* If there is no white space symbols after last line ending then line has zero indent and indent stack should be cleared
           * and corresponding DEDENTs should be returned. Since one cannot return many tokens at once,
           * push back this line ending to get in this block as much time as needed
           */
          if (currentIndent == 0 ){
              if (indentStack.size() > 0) {
                  indentStack.remove(indentStack.size() - 1);
                  yypushback(1);
                  return CwlLexerTypes.DEDENT;
              } else {
                  return TokenType.WHITE_SPACE;
              }
          // If current indent is equal to last indent in stack
          } else if(!indentStack.isEmpty() && currentIndent == last(indentStack)) {
              return TokenType.WHITE_SPACE;
          } else if(indentStack.isEmpty() || currentIndent > last(indentStack)) {
              indentStack.add(currentIndent);
              return CwlTypes.INDENT;
          } else if (indentStack.size() > 1) {
              // If current indent is less then last indent, check whether it is equal to one of the indent in stack
              int currentIndentIndex = indentStack.indexOf(currentIndent);
              if (currentIndentIndex >= 0) {
                  /* If it's the case, remove all indents after indent that is equal to current indent.
                   * As in the case with zero indent, one cannot do this at once, so push last line ending and all
                   * white spaces after it back.
                   */
                  indentStack.remove(indentStack.size() - 1);
                  yypushback(currentIndent + 1);
                  return CwlTypes.DEDENT;
              } else {
                  return TokenType.BAD_CHARACTER;
              }
          } else {
              return TokenType.BAD_CHARACTER;
          }
      }
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

        {WhiteSpace}                       { return getWhitespaceTypeAndUpdateIndent(); }
        {DecIntegerLiteral}                { return CwlTypes.INT; }
        {Comment}                          { return CwlLexerTypes.COMMENT; }
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
        "inputs"                           { return CwlTypes.INPUTS; }
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
        "requirements"                     { return CwlTypes.REQUIREMENTS; }
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