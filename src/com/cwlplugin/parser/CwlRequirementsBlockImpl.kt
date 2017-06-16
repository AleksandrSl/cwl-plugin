package com.cwlplugin.parser

import com.intellij.lang.ASTNode
import com.intellij.vcs.log.VcsLogProvider

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlRequirementsBlockImpl(node: ASTNode) : CwlElementImpl(node), CwlRequirementsBlock {

    val requirementsBlock: CwlRequirementsBlock
        get() = childToPsiNotNull(CwlTokenTypes.REQUIREMENTS_TOKENS, 0)

    override fun acceptCwlVisitor(CwlVisitor: CwlElementVisitor) {
        CwlVisitor.visitCwlRequirementsBlock(this)
    }
}