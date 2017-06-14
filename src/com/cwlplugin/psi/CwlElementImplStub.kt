//package com.cwlplugin.psi
//
//import com.cwlplugin.CwlLanguage
//import com.cwlplugin.junk.CwlCustomVisitor
//import com.cwlplugin.junk.CwlElement
//import com.intellij.extapi.psi.StubBasedPsiElementBase
//import com.intellij.lang.ASTNode
//import com.intellij.psi.PsiElement
//import com.intellij.psi.PsiElementVisitor
//import com.intellij.psi.PsiFile
//import com.intellij.psi.PsiReference
//import com.intellij.psi.PsiReferenceService
//import com.intellij.psi.StubBasedPsiElement
//import com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry
//import com.intellij.psi.stubs.IStubElementType
//import com.intellij.psi.stubs.StubElement
//
///**
// * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
// */
//open class CwlElementImplStub<T : StubElement<*>> : StubBasedPsiElementBase<T>, CwlElement, StubBasedPsiElement<T>{
//
//    constructor(stub: T, nodeType: IStubElementType<*, *>) : super(stub, nodeType)
//
//    constructor(node: ASTNode) : super(node)
//
//    val language: CwlLanguage = CwlLanguage
//
//    override fun toString(): String  = elementType.toString()
//
//    override fun accept(visitor: PsiElementVisitor) {
//        if (visitor is CwlCustomVisitor<*, *>) {
//            accept(visitor, null)
//        } else {
//            visitor.visitElement(this)
//        }
//    }
//
//    override fun <D> acceptChildren(visitor: CwlCustomVisitor<Void, D>, data: D?) {
//        var child: PsiElement? = firstChild
//        while (child != null) {
//            if (child is CwlElement) {
//                child.accept(visitor, data)
//            }
//            child = child.nextSibling
//        }
//    }
//
//    override fun <R, D> accept(visitor: CwlCustomVisitor<R, D>, data: D?): R? = visitor.visitCwlElement(this, data)
//
//    override fun delete() {
////        KtElementUtilsKt.deleteSemicolon(this);
//        super.delete()
//    }
//
//    override fun getReference(): PsiReference? {
//        val references: Array<PsiReference> = references
//        return if (references.size == 1) references[0] else null
//    }
//
//    override fun getReferences(): Array<PsiReference> =
//            ReferenceProvidersRegistry.getReferencesFromProviders(this, PsiReferenceService.Hints.NO_HINTS)
//
//    protected fun  <PsiT : CwlElementImplStub<*>, StubT : StubElement<*>> getStubOrPsiChildrenAsList(
//            elementType: CwlStubElementType<StubT, PsiT>) =
//        getStubOrPsiChildren(elementType, elementType.arrayFactory).toList()
//
//    /**
//     * Returns this or parent source element (for synthetic element declarations).
//     * Use it only for the purposes of source attribution.
//     */
//    override fun getPsiOrParent(): CwlElement {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun getContainingCwlFile(): CwlFile {
//        val file: PsiFile = containingFile
//        assert(file is CwlFile){ "CwlElement not inside CwlFile: $file ${if (file.isValid) file.text else "<invalid>"}" }
//        return file as CwlFile
//    }
//
//
//}