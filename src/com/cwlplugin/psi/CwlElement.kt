package com.cwlplugin.psi

import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiReference
import com.sun.tools.doclets.internal.toolkit.util.DocPath.parent

/**
 *  From Kotlin plugin
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
interface CwlElement : NavigatablePsiElement, CwlPureElement {
    
    fun <D> acceptChildren(visitor: CwlCustomVisitor<Void, D>, data: D?)

    fun <R, D> accept(visitor: CwlCustomVisitor<R, D>, data: D?): R?

    @Deprecated("Don't use getReference() on JetElement for the choice is unpredictable")
    override fun getReference(): PsiReference?
}

//fun CwlElement.getModificationStamp(): Long {
//    return when (this) {
//        is CwlFile -> this.modificationStamp
//        is CwlDeclarationStub<*> -> this.modificationStamp
//        is CwlSuperTypeList -> this.modificationStamp
//        else -> (parent as CwlElement).getModificationStamp()
//    }
//}