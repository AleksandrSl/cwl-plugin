//package com.cwlplugin.psi.stubs.impl
//
//import com.cwlplugin.psi.CwlElementType
//import com.cwlplugin.psi.CwlElementTypes
//import com.cwlplugin.psi.CwlRequirement
//import com.cwlplugin.psi.CwlRequirements
//import com.cwlplugin.psi.CwlTypes
//import com.cwlplugin.psi.stubs.CwlRequirementsStub
//import com.intellij.psi.stubs.StubBase
//import com.intellij.psi.stubs.StubElement
//
///**
// * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
// */
//class CwlRequirementsStubImpl(val parent: StubElement<*>, val requirements: List<CwlRequirements>)
//    : StubBase<CwlRequirements>(parent, CwlElementTypes.REQUIREMENTS), CwlRequirementsStub {
//
//    override fun getRequierements(): List<CwlRequirement> {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//}