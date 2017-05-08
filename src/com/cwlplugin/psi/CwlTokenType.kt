package com.cwlplugin.psi

import com.intellij.psi.tree.IElementType
import com.cwlplugin.CwlLanguage
import org.jetbrains.annotations.*

/**
 * Created by aleksandrsl on 06.05.17.
 */
class CwlTokenType(debugName: String): IElementType(debugName, CwlLanguage) {

    override fun toString(): String {
        return "CwlTokenType." + super.toString()
    }
}
