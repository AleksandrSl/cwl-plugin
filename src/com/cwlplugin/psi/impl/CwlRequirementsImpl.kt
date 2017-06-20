package com.cwlplugin.psi.impl

import com.cwlplugin.parser.CwlElementVisitor
import com.cwlplugin.psi.CwlDockerRequirement
import com.cwlplugin.psi.CwlEnvVarRequirement
import com.cwlplugin.psi.CwlInitialWorkDirRequirement
import com.cwlplugin.psi.CwlInlineJavascriptRequirement
import com.cwlplugin.psi.CwlResourceRequirement
import com.cwlplugin.psi.CwlSchemaDefRequirement
import com.cwlplugin.psi.CwlShellCommandRequirement
import com.cwlplugin.psi.CwlSoftwareRequirement
import com.intellij.lang.ASTNode

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlDockerRequirementImpl(node: ASTNode) : CwlElementImpl(node), CwlDockerRequirement {

    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
        cwlVisitor.visitCwlDockerRequirement(this)
    }
}

class CwlInlineJavascriptRequirementImpl(node: ASTNode) : CwlElementImpl(node), CwlInlineJavascriptRequirement {

    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
        cwlVisitor.visitCwlInlineJavascriptRequirement(this)
    }
}

class CwlSchemaDefRequirementImpl(node: ASTNode) : CwlElementImpl(node), CwlSchemaDefRequirement {

    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
        cwlVisitor.visitCwlSchemaDefRequirement(this)
    }
}

class CwlSoftwareRequirementImpl(node: ASTNode) : CwlElementImpl(node), CwlSoftwareRequirement {

    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
        cwlVisitor.visitCwlSoftwareRequirement(this)
    }
}

class CwlInitialWorkDirRequirementImpl(node: ASTNode) : CwlElementImpl(node), CwlInitialWorkDirRequirement {

    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
        cwlVisitor.visitCwlInitialWorkDirRequirement(this)
    }
}

class CwlEnvVarRequirementImpl(node: ASTNode) : CwlElementImpl(node), CwlEnvVarRequirement {

    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
        cwlVisitor.visitCwlEnvVarRequirement(this)
    }
}

class CwlShellCommandRequirementImpl(node: ASTNode) : CwlElementImpl(node), CwlShellCommandRequirement {

    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
        cwlVisitor.visitCwlShellCommandRequirement(this)
    }
}

class CwlResourceRequirementImpl(node: ASTNode) : CwlElementImpl(node), CwlResourceRequirement {

    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
        cwlVisitor.visitCwlResourceRequirement(this)
    }
}
