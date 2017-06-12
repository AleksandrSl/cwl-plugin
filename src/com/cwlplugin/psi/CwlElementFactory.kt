package com.cwlplugin.psi


import com.cwlplugin.CwlFileType
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory


/**
 * Created by aleksandrsl on 12.06.17.
 */

  fun createRequirement(project: Project, name: String, value: String): CwlRequirement {
    val file: CwlFile = createFile(project, name + " = " + value)
    return file.firstChild as CwlRequirement
  }

  fun createRequirement(project: Project, name: String): CwlRequirement {
    val file: CwlFile = createFile(project, name)
    return file.firstChild as CwlRequirement
  }

  fun createCRLF(project: Project): PsiElement {
    val file: CwlFile = createFile(project, "\n")
    return file.firstChild
  }

  fun createFile(project: Project, text: String): CwlFile {
    val name: String = "dummy.cwl"
    return PsiFileFactory.getInstance(project).
        createFileFromText(name, CwlFileType, text) as CwlFile
  }
