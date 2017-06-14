package com.cwlplugin.junk


import com.cwlplugin.CwlFileType
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory


/**
 * Created by aleksandrsl on 12.06.17.
 */
object CwlElementFactory {

  fun createRequirement(project: com.intellij.openapi.project.Project, name: String, value: String): com.cwlplugin.psi.CwlRequirement {
    val file: com.cwlplugin.psi.CwlFile = com.cwlplugin.junk.CwlElementFactory.createFile(project, name + " = " + value)
    return file.firstChild as com.cwlplugin.psi.CwlRequirement
  }

  fun createRequirement(project: com.intellij.openapi.project.Project, name: String): com.cwlplugin.psi.CwlRequirement {
    val file: com.cwlplugin.psi.CwlFile = com.cwlplugin.junk.CwlElementFactory.createFile(project, name)
    return file.firstChild as com.cwlplugin.psi.CwlRequirement
  }

  fun createCRLF(project: com.intellij.openapi.project.Project): com.intellij.psi.PsiElement {
    val file: com.cwlplugin.psi.CwlFile = com.cwlplugin.junk.CwlElementFactory.createFile(project, "\n")
    return file.firstChild
  }

  fun createFile(project: com.intellij.openapi.project.Project, text: String): com.cwlplugin.psi.CwlFile {
    val name: String = "dummy.cwl"
    return com.intellij.psi.PsiFileFactory.getInstance(project).
            createFileFromText(name, com.cwlplugin.CwlFileType, text) as com.cwlplugin.psi.CwlFile
  }

  fun createCommandInputParameter(project: com.intellij.openapi.project.Project, name: String): com.cwlplugin.psi.CwlCommandInputParameter {
      val file: com.cwlplugin.psi.CwlFile = com.cwlplugin.junk.CwlElementFactory.createFile(project, name)
      return file.firstChild as com.cwlplugin.psi.CwlCommandInputParameter
  }
}