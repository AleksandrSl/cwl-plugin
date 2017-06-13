package com.cwlplugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlElementImpl : ASTWrapperPsiElement, CwlElement {

    override fun <D> acceptChildren(visitor: CwlCustomVisitor<Void, D>, data: D) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <R, D> accept(visitor: CwlCustomVisitor<R, D>, data: D): R? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Returns this or parent source element (for synthetic element declarations).
     * Use it only for the purposes of source attribution.
     */
    override fun getPsiOrParent(): CwlElement {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getContainingCwlFile(): CwlFile {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    protected constructor(node: ASTNode) : super(node)
}