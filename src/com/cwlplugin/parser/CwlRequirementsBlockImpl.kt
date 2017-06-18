package com.cwlplugin.parser

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