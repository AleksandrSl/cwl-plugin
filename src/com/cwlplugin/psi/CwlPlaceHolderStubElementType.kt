package com.cwlplugin.psi

import com.intellij.psi.stubs.StubElement
import com.intellij.psi.stubs.StubInputStream
import com.intellij.psi.stubs.StubOutputStream

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */

class CwlPlaceHolderStubElementType<T : CwlElementImplStub<in StubElement<*>>> :
CwlStubElementType<CwlPlaceHolderStub<T>, T>{

    constructor(debugName: String, psiClass : Class<T>) : super(debugName, psiClass, CwlPlaceHolderStub::class.java)

    override fun createStub(psi: T, parentStub: StubElement<*>?): CwlPlaceHolderStub<T> {
        return CwlPlaceHolderStubImpl(parentStub, this)
    }

    override fun serialize(stub: CwlPlaceHolderStub<T>, dataStream: StubOutputStream) : Unit {
        return Unit
    }

    override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): CwlPlaceHolderStub<T> {
        return CwlPlaceHolderStubImpl(parentStub, this)
    }
}