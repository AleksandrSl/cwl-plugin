package com.cwlplugin.psi

import com.*
import com.cwlplugin.CwlFileType
import com.cwlplugin.CwlLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

import javax.*
import javax.swing.*

class CwlFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, CwlLanguage) {

    override fun getFileType(): FileType {
        return CwlFileType
    }

    override fun toString(): String {
        return "Cwl File"
    }

    override fun getIcon(flags: Int): Icon? {
        return super.getIcon(flags)
    }
}