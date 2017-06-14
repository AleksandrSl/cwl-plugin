//package com.cwlplugin.junk
//
///**
// *  From Kotlin plugin
// * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
// */
//interface CwlElement : com.intellij.psi.NavigatablePsiElement, com.cwlplugin.psi.CwlPureElement {
//
//    fun <D> acceptChildren(visitor: com.cwlplugin.psi.CwlCustomVisitor<Void, D>, data: D?)
//
//    fun <R, D> accept(visitor: com.cwlplugin.psi.CwlCustomVisitor<R, D>, data: D?): R?
//
//    @Deprecated("Don't use getReference() on JetElement for the choice is unpredictable")
//    override fun getReference(): com.intellij.psi.PsiReference?
//}
//
////fun CwlElement.getModificationStamp(): Long {
////    return when (this) {
////        is CwlFile -> this.modificationStamp
////        is CwlDeclarationStub<*> -> this.modificationStamp
////        is CwlSuperTypeList -> this.modificationStamp
////        else -> (parent as CwlElement).getModificationStamp()
////    }
////}