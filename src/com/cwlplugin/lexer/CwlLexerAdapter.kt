package com.cwlplugin.lexer

import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.FlexLexer

/**
 * Created by aleksandrsl on 06.05.17.
 */
class CwlLexerAdapter: FlexAdapter(_CwlLexer(null as java.io.Reader?)) {

    public override fun getFlex(): FlexLexer {
        return super.getFlex()
    }
}