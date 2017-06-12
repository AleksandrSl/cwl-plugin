//package com.cwlplugin
//
// import com.cwlplugin.psi.CwlanguageFile
// import com.cwlplugin.psi.CwlItem
//import com.intellij.openapi.fileTypes.FileType
//import com.intellij.openapi.project.Project
//import com.intellij.psi.util.PsiTreeUtil
//import com.intellij.psi.PsiManager
//import com.intellij.openapi.vfs.VirtualFile
//import com.intellij.psi.search.GlobalSearchScope
//import com.intellij.psi.search.FileTypeIndex
//import com.intellij.util.indexing.FileBasedIndex
//
//
///**
// * Created by aleksandrsl on 08.05.17.
// */
//object CwlUtil {
//
//    fun findItems(project: Project, key: String): List<CwlItem> {
//
//        val virtualFiles: Collection<VirtualFile> = FileBasedIndex.getInstance()
//                .getContainingFiles<FileType, Void>(FileTypeIndex.NAME, CwlFileType,
//                        GlobalSearchScope.allScope(project))
//        val result: MutableList<CwlItem> = mutableListOf()
//
//        virtualFiles
//                .mapNotNull { PsiManager.getInstance(project).findFile(it) as CwlanguageFile? }
//                .map { PsiTreeUtil.getChildrenOfType(it, CwlItem::class.java) }
//                .forEach { properties -> properties?.filter { it -> it.key == key}?.toCollection(result) }
//        return result
//    }
//
//    fun findItems(project: Project): List<CwlItem> {
//        val result: MutableList<CwlItem> = mutableListOf()
//        val virtualFiles = FileBasedIndex.getInstance().getContainingFiles<FileType, Void>(FileTypeIndex.NAME,
//                CwlFileType, GlobalSearchScope.allScope(project))
//        virtualFiles
//                .mapNotNull { PsiManager.getInstance(project).findFile(it) as CwlanguageFile? }
//                .mapNotNull { PsiTreeUtil.getChildrenOfType(it, CwlItem::class.java) }
//                .forEach { properties -> properties.toCollection(result) }
//
//        return result
//    }
//}