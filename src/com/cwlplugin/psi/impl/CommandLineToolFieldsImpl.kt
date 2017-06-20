package com.cwlplugin.psi.impl

import com.cwlplugin.parser.CwlElementVisitor
import com.cwlplugin.psi.CwlArguments
import com.cwlplugin.psi.CwlBaseCommand
import com.cwlplugin.psi.CwlCommandLineToolClass
import com.cwlplugin.psi.CwlDoc
import com.cwlplugin.psi.CwlDockerRequirement
import com.cwlplugin.psi.CwlElement
import com.cwlplugin.psi.CwlHints
import com.cwlplugin.psi.CwlId
import com.cwlplugin.psi.CwlInputs
import com.cwlplugin.psi.CwlLabel
import com.cwlplugin.psi.CwlOutputs
import com.cwlplugin.psi.CwlPermanentFailCodes
import com.cwlplugin.psi.CwlStderr
import com.cwlplugin.psi.CwlStdin
import com.cwlplugin.psi.CwlStdout
import com.cwlplugin.psi.CwlSuccessCodes
import com.cwlplugin.psi.CwlTemporaryFailCodes
import com.cwlplugin.psi.CwlVersion
import com.intellij.lang.ASTNode

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlVersionImpl(node: ASTNode) : CwlElementImpl(node), CwlVersion {

    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
        cwlVisitor.visitCwlVersion(this)
    }
}
class CwlInputsImpl(node: ASTNode) : CwlElementImpl(node), CwlInputs {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
//        cwlVisitor.visitCwlInputs(this)
//    }
}
class CwlOutputsImpl(node: ASTNode) : CwlElementImpl(node), CwlOutputs {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
//        cwlVisitor.visitCwlOutputs(this)
//    }
}
class CwlCommandLineToolClassImpl(node: ASTNode) : CwlElementImpl(node), CwlCommandLineToolClass {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
//        cwlVisitor.visitCwlCommandLineToolClass(this)
//    }
}
class CwlBaseCommandImpl(node: ASTNode) : CwlElementImpl(node), CwlBaseCommand {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
//        cwlVisitor.visitCwlBaseCommand(this)
//    }
}
class CwlIdImpl(node: ASTNode) : CwlElementImpl(node), CwlId {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) = cwlVisitor.visitCwlId(this)
}
class CwlLabelImpl(node: ASTNode) : CwlElementImpl(node), CwlLabel {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
//        cwlVisitor.visitCwlCwlLabel(this)
//    }
}
class CwlDocImpl(node: ASTNode) : CwlElementImpl(node), CwlDoc {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
//        cwlVisitor.visitCwlDoc(this)
//    }
}
class CwlHintsImpl(node: ASTNode) : CwlElementImpl(node), CwlHints {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
//        cwlVisitor.visitCwlHints(this)
//    }
}
class CwlArgumentsImpl(node: ASTNode) : CwlElementImpl(node), CwlArguments {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
//        cwlVisitor.visitCwlArguments(this)
//    }
}
class CwlStderrImpl(node: ASTNode) : CwlElementImpl(node), CwlStderr {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
//        cwlVisitor.visitCwlStderr(this)
//    }
}
class CwlStdinImpl(node: ASTNode) : CwlElementImpl(node), CwlStdin {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
//        cwlVisitor.visitCwlStdin(this)
//    }
}
class CwlStdoutImpl(node: ASTNode) : CwlElementImpl(node), CwlStdout {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
//        cwlVisitor.visitCwlStdout(this)
//    }
}
class CwlSuccessCodesImpl(node: ASTNode) : CwlElementImpl(node), CwlSuccessCodes {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
//        cwlVisitor.visitCwlSuccessCodes(this)
//    }
}
class CwlTemporaryFailCodesImpl(node: ASTNode) : CwlElementImpl(node), CwlTemporaryFailCodes {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
//        cwlVisitor.visitCwlTemporaryFailCodes(this)
//    }
}
class CwlPermanentFailCodesImpl(node: ASTNode) : CwlElementImpl(node), CwlPermanentFailCodes {

//    override fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
//        cwlVisitor.visitCwlPermanentFailCodes(this)
//    }
}