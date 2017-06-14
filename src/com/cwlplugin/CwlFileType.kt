package com.cwlplugin

import com.cwlplugin.icons.CwlIcons
import com.intellij.openapi.fileTypes.LanguageFileType

import javax.swing.*

object CwlFileType: LanguageFileType(CwlLanguage) {

    override fun getName(): String {
        return "Cwl file"
    }

    override fun getDescription(): String {
        return "Common Workflow Language file"
    }

    override fun getDefaultExtension(): String {
        return "cwl"
    }

    override fun getIcon(): Icon {
        return CwlIcons.FILE
    }
}