//package com.cwlplugin.psi
//
//import com.intellij.lang.ASTNode
//import com.intellij.psi.PsiElement
//import com.intellij.psi.stubs.StubElement
//
///**
// * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
// */
//class CwlRequirements<T : StubElement<*>> : CwlElement, CwlElementImplStub<T> {
//
//    protected constructor(node: ASTNode) : super(node)
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
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun <D> acceptChildren(visitor: CwlCustomVisitor<Void, D>, data: D?) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    fun getContainingCommandLineTool(): CwlCommandLineTool = parent as CwlCommandLineTool
//
////    fun getRequirementList() = PsiTreeUtil.getChildrenOfTypeAsList(this, CwlRequirement.class)
//
//    override fun <R, D> accept(visitor: CwlCustomVisitor<R, D>, data: D?): R? = visitor.visitCwlRequirements(this, data)
//
//
//}