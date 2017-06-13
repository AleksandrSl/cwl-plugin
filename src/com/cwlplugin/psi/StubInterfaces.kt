package com.cwlplugin.psi

import com.intellij.psi.PsiNamedElement
import com.intellij.psi.stubs.NamedStub
import com.intellij.psi.stubs.StubElement

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
interface CwlPlaceHolderStub<T : CwlElement> : StubElement<T>

interface CwlCommandLineToolStub<T : CwlCommandLineTool> : KotlinStubWithFqName<T> {
    fun isLocal(): Boolean
    fun getSuperNames(): List<String>
    fun isTopLevel(): Boolean
}

interface KotlinStubWithFqName<T : PsiNamedElement> : NamedStub<T> {
    fun getFqName(): FqName?
}