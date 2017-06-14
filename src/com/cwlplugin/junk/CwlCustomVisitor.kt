//package com.cwlplugin.junk
//
//
///**
// * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
// */
//class CwlCustomVisitor<R, D> : com.intellij.psi.PsiElementVisitor() {
//
//    fun visitCwlElement(element: CwlElement, data: D?): R? {
//        visitElement(element as com.intellij.psi.PsiElement)
//        return null
//    }
//
//    fun visitCwlRequirements(requirements: com.cwlplugin.psi.CwlRequirements, data: D?): R? = visitCwlElement(requirements, data)
//
//}