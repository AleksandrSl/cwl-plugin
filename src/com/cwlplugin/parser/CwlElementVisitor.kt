package com.cwlplugin.parser

import com.cwlplugin.psi.CwlDockerRequirement
import com.cwlplugin.psi.CwlElement
import com.cwlplugin.psi.CwlEnvVarRequirement
import com.cwlplugin.psi.CwlInitialWorkDirRequirement
import com.cwlplugin.psi.CwlInlineJavascriptRequirement
import com.cwlplugin.psi.CwlRequirementList
import com.cwlplugin.psi.CwlRequirementsBlock
import com.cwlplugin.psi.CwlResourceRequirement
import com.cwlplugin.psi.CwlSchemaDefRequirement
import com.cwlplugin.psi.CwlShellCommandRequirement
import com.cwlplugin.psi.CwlSoftwareRequirement
import com.cwlplugin.psi.CwlVersion
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

    fun visitCwlRequirementList(node: CwlRequirementList) {
        visitCwlElement(node)
    }

    fun visitCwlDockerRequirement(node: CwlDockerRequirement) {
        visitCwlElement(node)
    }

    fun visitCwlSchemaDefRequirement(node: CwlSchemaDefRequirement) {
        visitCwlElement(node)
    }

    fun visitCwlSoftwareRequirement(node: CwlSoftwareRequirement) {
        visitCwlElement(node)
    }

    fun visitCwlInitialWorkDirRequirement(node: CwlInitialWorkDirRequirement) {
        visitCwlElement(node)
    }

    fun visitCwlEnvVarRequirement(node: CwlEnvVarRequirement) {
        visitCwlElement(node)
    }

    fun visitCwlShellCommandRequirement(node: CwlShellCommandRequirement) {
        visitCwlElement(node)
    }

    fun visitCwlResourceRequirement(node: CwlResourceRequirement) {
        visitCwlElement(node)
    }

    fun visitCwlInlineJavascriptRequirement(node: CwlInlineJavascriptRequirement) {
        visitCwlElement(node)
    }

    fun visitCwlVersion(node: CwlVersion) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}