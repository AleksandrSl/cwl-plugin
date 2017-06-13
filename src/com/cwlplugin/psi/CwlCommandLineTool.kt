package com.cwlplugin.psi

import com.intellij.psi.PsiElement

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlCommandLineTool : CwlPureCommandLineTool {
    override fun getDeclarations(): List<CwlDeclaration> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getName(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getRequirements(): List<CwlRequirement> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Returns this or parent source element (for synthetic element declarations).
     * Use it only for the purposes of source attribution.
     */
    override fun getPsiOrParent(): CwlElement {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Returns parent source element.
     */
    override fun getParent(): PsiElement {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getContainingCwlFile(): CwlFile {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
//        KtTypeParameterListOwnerStub<KotlinClassOrObjectStub<out KtClassOrObject>>, KtDeclarationContainer, KtNamedDeclaration, KtPureClassOrObject {{
