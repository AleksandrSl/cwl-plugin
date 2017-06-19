package com.cwlplugin.psi.impl

import com.cwlplugin.parser.CwlElementVisitor
import com.cwlplugin.parser.CwlTokenTypes
import com.cwlplugin.psi.CwlRequirementsBlock
import com.intellij.lang.ASTNode

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlRequirementsBlockImpl(node: ASTNode) : CwlElementImpl(node), CwlRequirementsBlock {

    val requirementsBlock: CwlRequirementsBlock
        get() = childToPsiNotNull(CwlTokenTypes.REQUIREMENTS_TOKENS, 0)

    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
        cwlVisitor.visitCwlRequirementsBlock(this)
    }
}