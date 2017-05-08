package com.cwlplugin.parser

import com.cwlplugin.parser.grammar.CwlLexerTokens
import com.cwlplugin.psi.CwlTokenType
import com.intellij.psi.TokenType
import com.intellij.psi.tree.TokenSet

/**
 * Created by aleksandrsl on 07.05.17.
 */
public val KEYWORDS: List<CwlTokenType> = listOf(
        CwlLexerTokens.CLASS,
        CwlLexerTokens.IN,
        CwlLexerTokens.CWLVERSION,
        CwlLexerTokens.OUT,
        CwlLexerTokens.REQUIREMENTS,
        CwlLexerTokens.HINTS
        )

val OPERATORS: List<CwlTokenType> = listOf(
        CwlLexerTokens.COLON)


val BLOCK_COMMENT: CwlTokenType = CwlTokenType("COMMENT")
val END_OF_LINE_COMMENT: CwlTokenType = CwlTokenType("#")

val NEW_LINE: CwlTokenType = CwlTokenType("NL")

val COMMENTS: TokenSet = TokenSet.create(
        END_OF_LINE_COMMENT,
        BLOCK_COMMENT)

val WHITESPACES: TokenSet = TokenSet.create(TokenType.WHITE_SPACE, NEW_LINE)