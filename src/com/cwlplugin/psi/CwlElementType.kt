package com.cwlplugin.psi

/**
 * Created by aleksandrsl on 06.05.17.
 */

import com.intellij.psi.tree.IElementType;
import com.cwlplugin.CwlLanguage
import org.jetbrains.annotations.*

class CwlElementType(debugName: String): IElementType(debugName, CwlLanguage)