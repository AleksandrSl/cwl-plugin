//package com.cwlplugin.refactoring
//
//import com.cwlplugin.psi.CwlCommandInputParameter
//import com.intellij.lang.refactoring.RefactoringSupportProvider
//import com.intellij.psi.PsiElement
//import com.intellij.refactoring.Refactoring
//
///**
// * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
// */
//class CwlRefactoringSupportProvider : RefactoringSupportProvider() {
//
//    override fun isMemberInplaceRenameAvailable(element: PsiElement, context: PsiElement?): Boolean {
//        return element is CwlCommandInputParameter
//    }
//}