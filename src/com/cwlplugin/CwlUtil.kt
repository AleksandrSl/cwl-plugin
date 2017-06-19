package com.cwlplugin


/**
 * Created by aleksandrsl on 08.05.17.
 */
object CwlUtil {
//
//    fun findCommandInputParameters(project: Project, identifier: String): List<CwlCommandInputParameter> {
//
//        val virtualFiles: Collection<VirtualFile> = FileBasedIndex.getInstance()
//                .getContainingFiles<FileType, Void>(FileTypeIndex.NAME, CwlFileType,
//                        GlobalSearchScope.allScope(project))
//        val result: MutableList<CwlCommandInputParameter> = mutableListOf()
//
//        virtualFiles
//                .mapNotNull { PsiManager.getInstance(project).findFile(it) as CwlFile? }
//                .map { PsiTreeUtil.getChildrenOfType(it, CwlCommandInputParameter::class.java) }
//                .forEach { commandInputParameters -> commandInputParameters?.filter { it -> (it as CwlCommandInputParameter).identifier == identifier}?.toCollection(result) }
//        return result
//    }

//    fun findItems(project: Project): List<CwlItem> {
//        val result: MutableList<CwlItem> = mutableListOf()
//        val virtualFiles = FileBasedIndex.getInstance().getContainingFiles<FileType, Void>(FileTypeIndex.NAME,
//                CwlFileType, GlobalSearchScope.allScope(project))
//        virtualFiles
//                .mapNotNull { PsiManager.getInstance(project).findFile(it) as CwlFile? }
//                .mapNotNull { PsiTreeUtil.getChildrenOfType(it, CwlItem::class.java) }
//                .forEach { properties -> properties.toCollection(result) }
//
//        return result
//    }

}