package com.cwlplugin.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
//import com.cwlplugin.psi.CwlLexerTokens;
import com.intellij.psi.TokenType;
import com.cwlplugin.lexer.CwlLexerTokens;

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
%eof{  return;
%eof}



// Whitespaces
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]

// Comment
Comment = {TraditionalComment}
// Comment can be the last line of the file, without line terminator
TraditionalComment = "#" {InputCharacter}* {LineTerminator}?

Identifier = [:jletter:] [:jletterdigit:]*

DecIntegerLiteral = 0 | [1-9][0-9]*

%state STRING
%state WAITING_VALUE

%%

    /* keywords */
    <YYINITIAL> {
        "requirements"           { return CwlLexerTokens.REQUIREMENTS; }
        "cwlVersion"           { return CwlLexerTokens.CWLVERSION; }
        "class"                { return CwlLexerTokens.CLASS; }
        "inputs"           { return CwlLexerTokens.INPUTS; }
        "outputs"           { return CwlLexerTokens.OUTPUTS; }
        ":"                 { yybegin(WAITING_VALUE); return CwlLexerTokens.COLON; }
        {Comment}           { return CwlLexerTokens.COMMENT; }
    }

    <WAITING_VALUE> {
        {Identifier}        { yybegin(YYINITIAL); return CwlLexerTokens.IDENTIFIER; }
    }

//    <YYINITIAL> "boolean"            { return symbol(sym.BOOLEAN); }
//    <YYINITIAL> "break"              { return symbol(sym.BREAK); }
//
//    <YYINITIAL> {
//      /* identifiers */
//      {Identifier}                   { return symbol(sym.IDENTIFIER); }
//
//      /* literals */
//      {DecIntegerLiteral}            { return symbol(sym.INTEGER_LITERAL); }
//      \"                             { string.setLength(0); yybegin(STRING); }
//
//      /* operators */
//      "="                            { return symbol(sym.EQ); }
//      "=="                           { return symbol(sym.EQEQ); }
//      "+"                            { return symbol(sym.PLUS); }
//
//      /* comments */
//      {Comment}                      { /* ignore */ }
//
//      /* whitespace */
//      {WhiteSpace}                   { /* ignore */ }
//    }
//
//    <STRING> {
//      \"                             { yybegin(YYINITIAL);
//                                       return symbol(sym.STRING_LITERAL,
//                                       string.toString()); }
//      [^\n\r\"\\]+                   { string.append( yytext() ); }
//      \\t                            { string.append('\t'); }
//      \\n                            { string.append('\n'); }
//
//      \\r                            { string.append('\r'); }
//      \\\"                           { string.append('\"'); }
//      \\                             { string.append('\\'); }
//    }
//
//    /* error fallback */
    [^]                              { return TokenType.BAD_CHARACTER;}

///////////////////////////////////////////////////////////////////////////////////////////////////
// Literals
///////////////////////////////////////////////////////////////////////////////////////////////////

//EXPONENT      = [eE] [-+]? [0-9_]+
//
//FLT_LITERAL   = ( {DEC_LITERAL} \. {DEC_LITERAL} {EXPONENT}? {SUFFIX}? )
//              | ( {DEC_LITERAL} {EXPONENT} {SUFFIX}? )
//              | ( {DEC_LITERAL} "f" [\p{xidcontinue}]* )
//
//FLT_LITERAL_TDOT = {DEC_LITERAL} \.
//
//INT_LITERAL = ( {DEC_LITERAL}
//              | {HEX_LITERAL}
//              | {OCT_LITERAL}
//              | {BIN_LITERAL} ) {SUFFIX}?
//
//DEC_LITERAL = [0-9] [0-9_]*
//HEX_LITERAL = "0x" [a-fA-F0-9_]*
//OCT_LITERAL = "0o" [0-7_]*
//BIN_LITERAL = "0b" [01_]*
//
//
//CHAR_LITERAL   = ( \' ( [^\\\'\r\n] | \\[^\r\n] | "\\x" [a-fA-F0-9]+ | "\\u{" [a-fA-F0-9]* "}"? )? ( \' {SUFFIX}? | \\ )? )
//               | ( \' [\p{xidcontinue}]* \' {SUFFIX}? )
//STRING_LITERAL = \" ( [^\\\"] | \\[^] )* ( \" {SUFFIX}? | \\ )?
//
//INNER_EOL_DOC = ({LINE_WS}*"//!".*{EOL_WS})*({LINE_WS}*"//!".*)
// !(!a|b) is a (set) difference between a and b.
//EOL_DOC_LINE  = {LINE_WS}*!(!("///".*)|("////".*))
//OUTER_EOL_DOC = ({EOL_DOC_LINE}{EOL_WS})*{EOL_DOC_LINE}