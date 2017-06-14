package com.cwlplugin.psi

import com.cwlplugin.CwlFileType
import com.cwlplugin.CwlLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import javax.swing.Icon

class CwlFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, CwlLanguage) {

    override fun getFileType(): FileType = CwlFileType

    override fun toString(): String = "CWL File"

    override fun getIcon(flags: Int): Icon? = super.getIcon(flags)
}