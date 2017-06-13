package com.cwlplugin.psi

import com.intellij.psi.PsiElement

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
val PsiElement.startOffset: Int
    get() = textRange.startOffset