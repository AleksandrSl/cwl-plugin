package com.cwlplugin.lexer

import com.intellij.lexer.FlexAdapter

/**
 * Created by aleksandrsl on 06.05.17.
 */
class CwlLexerAdapter: FlexAdapter(_CwlLexer()) {

    override fun getFlex(): _CwlLexer {
        return super.getFlex() as _CwlLexer
    }
}