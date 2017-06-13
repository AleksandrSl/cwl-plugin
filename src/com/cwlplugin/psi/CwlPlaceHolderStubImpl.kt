package com.cwlplugin.psi

import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.StubElement

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlPlaceHolderStubImpl<T : CwlElementImplStub<in StubElement<*>>>(parent: StubElement<*>?, elementType: IStubElementType<*, *>)
    : CwlStubBaseImpl<T>(parent, elementType), CwlPlaceHolderStub<T> {

}