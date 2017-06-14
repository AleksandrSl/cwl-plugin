package com.cwlplugin.lexer

import com.intellij.psi.tree.IElementType
import com.cwlplugin.CwlLanguage
import org.jetbrains.annotations.*

/**
 * Created by aleksandrsl on 06.05.17.
 */
open class CwlTokenType(debugName: String): IElementType(debugName, CwlLanguage) {

    override fun toString(): String = "Cwl." + super.toString()
}
