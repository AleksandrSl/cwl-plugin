package com.cwlplugin.parser

import com.intellij.psi.PsiElementVisitor

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlElementVisitor : PsiElementVisitor() {
    fun visitCwlElement(node: CwlElement) {
        visitElement(node)
    }

    fun  visitCwlRequirementsBlock(node: CwlRequirementsBlock) {
        visitCwlElement(node)
    }
}