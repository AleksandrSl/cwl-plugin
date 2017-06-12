package com.cwlplugin.psi

import com.cwlplugin.CwlFileType
import com.cwlplugin.CwlLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import javax.swing.Icon

class CwlanguageFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, CwlLanguage) {

    override fun getFileType(): FileType = CwlFileType

    override fun toString(): String = "Cwl File"

    override fun getIcon(flags: Int): Icon? = super.getIcon(flags)
}