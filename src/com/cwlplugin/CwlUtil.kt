package com.cwlplugin

import com.cwlplugin.psi.CwlFile
import com.cwlplugin.psi.CwlProperty
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.project.Project
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.psi.PsiManager
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.search.FileTypeIndex
import com.intellij.util.indexing.FileBasedIndex
import java.util.ArrayList



/**
 * Created by aleksandrsl on 08.05.17.
 */
object CwlUtil {

    fun findProperties(project: Project, key: String): List<CwlProperty> {

        val virtualFiles: Collection<VirtualFile> = FileBasedIndex.getInstance()
                .getContainingFiles<FileType, Void>(FileTypeIndex.NAME, CwlFileType,
                        GlobalSearchScope.allScope(project))
        val result: MutableList<CwlProperty> = mutableListOf()

        virtualFiles
                .mapNotNull { PsiManager.getInstance(project).findFile(it) as CwlFile? }
                .map { PsiTreeUtil.getChildrenOfType(it, CwlProperty::class.java) }
                .forEach { properties -> properties?.filter { it -> it.key == key}?.toCollection(result) }
        return result
    }

    fun findProperties(project: Project): List<CwlProperty> {
        val result: MutableList<CwlProperty> = mutableListOf()
        val virtualFiles = FileBasedIndex.getInstance().getContainingFiles<FileType, Void>(FileTypeIndex.NAME,
                CwlFileType, GlobalSearchScope.allScope(project))
        virtualFiles
                .mapNotNull { PsiManager.getInstance(project).findFile(it) as CwlFile? }
                .mapNotNull { PsiTreeUtil.getChildrenOfType(it, CwlProperty::class.java) }
                .forEach { properties -> properties.toCollection(result) }

        return result
    }
}