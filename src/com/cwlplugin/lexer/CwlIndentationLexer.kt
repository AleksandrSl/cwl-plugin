package com.cwlplugin.lexer

import com.cwlplugin.parser.CwlTokenTypes
import com.intellij.psi.tree.TokenSet
import java.io.Reader

/**
 * @author yole
 * Created by aleksandrsl on 17.06.17.
 */
class CwlIndentationLexer : CwlIndentationProcessor(_CwlLexer(null as Reader?), TokenSet.EMPTY) {

    internal var addFinalBreak = true
    override fun processSpecialTokens() {
        super.processSpecialTokens()
        val tokenStart = baseTokenStart
        if (baseTokenType == null && addFinalBreak) {
            pushToken(CwlTokenTypes.LINE_BREAK, tokenStart, tokenStart)
            addFinalBreak = false
        }
    }
}
