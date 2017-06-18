package com.cwlplugin.parser

import com.cwlplugin.CwlFileType
import com.cwlplugin.psi.CwlElementType
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.StubBasedPsiElement
import com.intellij.psi.stubs.*

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
object CwlElementTypes {

    val REQUIREMENTS_BLOCK = CwlElementType("REQUIREMENTS_BLOCK", CwlRequirementsBlockImpl::class.java)
    val TARGET_REQUIREMENTS_BLOCK: CwlStubElementType<CwlTargetRequirementsBlockStub, CwlTargetRequirementsBlock> = CwlTargetRequirementsBlockElementType()
    val INLINE_JAVASCRIPT_REQUIREMENT = CwlElementType("REQUIREMENTS_BLOCK", CwlRequirementsBlockImpl::class.java)

}

class CwlTargetRequirementsBlockElementType
    : CwlStubElementType<CwlTargetRequirementsBlockStub,
        CwlTargetRequirementsBlock>("TARGET_REQUIREMENTS_BLOCK") {

    override fun serialize(stub: CwlTargetRequirementsBlockStub, stream: StubOutputStream) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createPsi(stub: CwlTargetRequirementsBlockStub): CwlTargetRequirementsBlock {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createStub(psi: CwlTargetRequirementsBlock, parentStub: StubElement<*>?): CwlTargetRequirementsBlockStub {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createElement(node: ASTNode): PsiElement {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deserialize(stream: StubInputStream, stub: StubElement<*>?): CwlTargetRequirementsBlockStub {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

interface CwlTargetRequirementsBlockStub : NamedStub<CwlTargetRequirementsBlock>

interface CwlTargetRequirementsBlock: PsiNamedElement, StubBasedPsiElement<CwlTargetRequirementsBlockStub>, CwlElement
{
    companion object {
        val EMPTY_ARRAY = arrayOfNulls<CwlTargetRequirementsBlock>(0)
    }
}

abstract class CwlStubElementType<StubT : StubElement<*>, PsiT: CwlElement>(debugName: String)
    : IStubElementType<StubT, PsiT>(debugName, CwlFileType.language) {

    override fun toString(): String = "CWL:${super.toString()}"

    abstract fun createElement(node: ASTNode) : PsiElement

    override fun indexStub(stub: StubT, sink: IndexSink): Unit {
    }

    override fun getExternalId(): String = "CWL.${super.toString()}"
}
