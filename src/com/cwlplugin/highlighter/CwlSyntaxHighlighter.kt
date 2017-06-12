package com.cwlplugin.highlighter

import com.cwlplugin.lexer.CwlLexerAdapter
import com.cwlplugin.lexer.CwlLexerTypes
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

        val REQUIREMENTS: TextAttributesKey =
                createTextAttributesKey("CWL_REQUIREMENTS", DefaultLanguageHighlighterColors.CONSTANT)
        val INPUTS: TextAttributesKey =
                createTextAttributesKey("CWL_INPUTS", DefaultLanguageHighlighterColors.LABEL)
        val OUTPUTS: TextAttributesKey =
                createTextAttributesKey("CWL_OUTPUTS", DefaultLanguageHighlighterColors.LABEL)
        val DOC: TextAttributesKey =
                createTextAttributesKey("CWL_DOCS", DefaultLanguageHighlighterColors.DOC_COMMENT)
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

        private val REQUIREMENTS_KEYS: Array<TextAttributesKey> = arrayOf(REQUIREMENTS)
        private val INPUTS_KEYS: Array<TextAttributesKey> = arrayOf(INPUTS)
        private val OUTPUTS_KEYS: Array<TextAttributesKey> = arrayOf(OUTPUTS)
        private val DOC_KEYS: Array<TextAttributesKey> = arrayOf(DOC)
        private val BAD_CHAR_KEYS: Array<TextAttributesKey> = arrayOf(BAD_CHARACTER)
        private val SEPARATOR_KEYS: Array<TextAttributesKey> = arrayOf(SEPARATOR)
        private val KEY_KEYS: Array<TextAttributesKey> = arrayOf(KEY)
        private val VALUE_KEYS: Array<TextAttributesKey> = arrayOf(VALUE)
        private val COMMENT_KEYS: Array<TextAttributesKey> = arrayOf(COMMENT)
        private val EMPTY_KEYS: Array<TextAttributesKey> = arrayOf()
    }

  override fun getHighlightingLexer(): Lexer = CwlLexerAdapter()

  override fun getTokenHighlights(tokenType: IElementType? ): Array<TextAttributesKey> {

      when (tokenType) {

          com.intellij.psi.TokenType.BAD_CHARACTER -> return BAD_CHAR_KEYS
          CwlTypes.REQUIREMENTS -> return REQUIREMENTS_KEYS
          CwlTypes.INPUTS -> return INPUTS_KEYS
          CwlTypes.OUTPUTS -> return OUTPUTS_KEYS
          CwlTypes.DOC -> return DOC_KEYS
          CwlLexerTypes.COMMENT -> return COMMENT_KEYS
          CwlTypes.COLON -> return SEPARATOR_KEYS
          else -> return EMPTY_KEYS
      }
  }
}