//package com.cwlplugin.psi
//
//import com.cwlplugin.junk.CwlElement
//import com.intellij.psi.PsiElement
//
//
//
///**
// * From Kotlin plugin
// * A minimal interface that {@link CwlElement} implements for the purpose of code-generation that does not need the full power of PSI.
// * This interface can be easily implemented by synthetic elements to generate code for them.
// * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
// */
//public interface CwlPureElement {
//
//    /**
//     * Returns this or parent source element (for synthetic element declarations).
//     * Use it only for the purposes of source attribution.
//     */
//    fun getPsiOrParent(): CwlElement
//
//    /**
//     * Returns parent source element.
//     */
//    fun getParent(): PsiElement
//
//    fun getContainingCwlFile(): CwlFile
//}
