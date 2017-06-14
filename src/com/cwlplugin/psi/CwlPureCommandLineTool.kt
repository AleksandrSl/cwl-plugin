//package com.cwlplugin.psi
//
//import com.cwlplugin.junk.CwlDeclarationContainer
//
//
///**
// * A minimal interface that {@link CwlCommandLineTool} implements for the purpose of code-generation that does not need the full power of PSI.
// * This interface can be easily implemented by synthetic elements to generate code for them.
// * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
// */
//public interface CwlPureCommandLineTool :  CwlPureElement, CwlDeclarationContainer {
//
//    fun getName(): String
//
//    fun getRequirements(): List<CwlRequirement>
//
////    fun getInputs(): List<CwlInput>
//
////    fun getOutputs(): List<CwlOutput>
//
////    fun getSuperTypeListEntries(): List<CwlSuperTypeListEntry>
////
////    fun getCompanionObjects(): List<CwlObjectDeclaration>
////
////    fun hasExplicitPrimaryConstructor(): Boolean
////
////    fun hasPrimaryConstructor(): Boolean
////
////    fun getPrimaryConstructor(): CwlPrimaryConstructor
////
////    fun getPrimaryConstructorModifierList(): CwlModifierList
////
////    fun getPrimaryConstructorParameters(): List<CwlParameter>
////
////    fun getSecondaryConstructors(): List<CwlSecondaryConstructor>
//}