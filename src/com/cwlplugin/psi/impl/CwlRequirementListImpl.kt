package com.cwlplugin.psi.impl

import com.cwlplugin.psi.CwlRequirementList

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlRequirementListImpl(node: com.intellij.lang.ASTNode): CwlElementImpl(node), CwlRequirementList {

    override fun acceptCwlVisitor(cwlVisitor: com.cwlplugin.parser.CwlElementVisitor) {
        cwlVisitor.visitCwlRequirementList(this)
    }
}