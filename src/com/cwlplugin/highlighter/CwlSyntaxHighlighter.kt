package com.cwlplugin.highlighter

import com.cwlplugin.lexer.CwlLexerAdapter
import com.cwlplugin.psi.CwlTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType


class CwlSyntaxHighlighter: SyntaxHighlighterBase() {

    companion object {
        val SEPARATOR: TextAttributesKey =
                createTextAttributesKey("CWL_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val KEY: TextAttributesKey =
                createTextAttributesKey("CWL_KEY", DefaultLanguageHighlighterColors.KEYWORD)
        val VALUE: TextAttributesKey =
                createTextAttributesKey("CWL_VALUE", DefaultLanguageHighlighterColors.STRING)
        val COMMENT: TextAttributesKey =
                createTextAttributesKey("CWL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BAD_CHARACTER: TextAttributesKey =
                createTextAttributesKey("CWL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)
    }

    val BAD_CHAR_KEYS: Array<TextAttributesKey> = arrayOf(BAD_CHARACTER)
    val SEPARATOR_KEYS: Array<TextAttributesKey> = arrayOf(SEPARATOR)
    val KEY_KEYS: Array<TextAttributesKey> = arrayOf(KEY)
    val VALUE_KEYS: Array<TextAttributesKey> = arrayOf(VALUE)
    val COMMENT_KEYS: Array<TextAttributesKey> = arrayOf(COMMENT)
    val EMPTY_KEYS: Array<TextAttributesKey> = arrayOf()

  override fun getHighlightingLexer(): Lexer {
    return CwlLexerAdapter()
  }

  override fun getTokenHighlights(tokenType: IElementType? ): Array<TextAttributesKey> {
      when (tokenType) {
          CwlTypes.SEPARATOR -> return SyntaxHighlighterBase.pack(BAD_CHARACTER)
          CwlTypes.KEY -> return SyntaxHighlighterBase.pack(KEY)
          CwlTypes.VALUE -> return SyntaxHighlighterBase.pack(VALUE)
          CwlTypes.COMMENT -> return SyntaxHighlighterBase.pack(COMMENT)
          CwlTypes.SEPARATOR -> return SyntaxHighlighterBase.pack(SEPARATOR)
          else -> return SyntaxHighlighterBase.pack(null)
      }
  }
}