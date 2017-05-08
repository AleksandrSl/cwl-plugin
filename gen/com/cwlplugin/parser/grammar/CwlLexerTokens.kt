package com.cwlplugin.parser.grammar

import com.cwlplugin.psi.CwlTokenType

/**
 * Created by aleksandrsl on 07.05.17.
 */

object CwlLexerTokens {
    val CWLVERSION = CwlTokenType("cwlVersion")
    val REQUIREMENTS = CwlTokenType("requirements")
    val CLASS = CwlTokenType("class")
    val HINTS = CwlTokenType("hints")
    val OUT = CwlTokenType("out")
    val IN = CwlTokenType("in")
    val COLON = CwlTokenType(":")
}
