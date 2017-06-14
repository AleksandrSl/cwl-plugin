//package com.cwlplugin.junk
//
//import com.intellij.psi.stubs.StubElement
//
///**
// * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
// */
//
//class CwlPlaceHolderStubElementType<T : com.cwlplugin.psi.CwlElementImplStub<in StubElement<*>>> :
//        com.cwlplugin.psi.CwlStubElementType<CwlPlaceHolderStub<T>, T> {
//
//    constructor(debugName: String, psiClass : Class<T>) : super(debugName, psiClass, com.cwlplugin.psi.CwlPlaceHolderStub::class.java)
//
//    override fun createStub(psi: T, parentStub: com.intellij.psi.stubs.StubElement<*>?): com.cwlplugin.psi.CwlPlaceHolderStub<T> {
//        return com.cwlplugin.psi.CwlPlaceHolderStubImpl(parentStub, this)
//    }
//
//    override fun serialize(stub: com.cwlplugin.psi.CwlPlaceHolderStub<T>, dataStream: com.intellij.psi.stubs.StubOutputStream) : Unit {
//        return Unit
//    }
//
//    override fun deserialize(dataStream: com.intellij.psi.stubs.StubInputStream, parentStub: com.intellij.psi.stubs.StubElement<*>?): com.cwlplugin.psi.CwlPlaceHolderStub<T> {
//        return com.cwlplugin.psi.CwlPlaceHolderStubImpl(parentStub, this)
//    }
//}