//package com.cwlplugin.reference
//
//import com.intellij.openapi.util.TextRange
//import com.intellij.patterns.PlatformPatterns
//import com.intellij.psi.PsiElement
//import com.intellij.psi.PsiLiteralExpression
//import com.intellij.psi.PsiReference
//import com.intellij.psi.PsiReferenceContributor
//import com.intellij.psi.PsiReferenceProvider
//import com.intellij.psi.PsiReferenceRegistrar
//import com.intellij.util.ProcessingContext
//
///**
// * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
// */
//class CwlReferenceContributor : PsiReferenceContributor() {
//
//    override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
//        registrar.registerReferenceProvider(PlatformPatterns.psiElement(PsiLiteralExpression::class.java),
//                object: PsiReferenceProvider() {
//                    override fun getReferencesByElement(element: PsiElement, context: ProcessingContext): Array<PsiReference> {
//                        val literalExpression: PsiLiteralExpression = element as PsiLiteralExpression
//                        val value: String? =
//                                if (literalExpression.value is String) literalExpression.value as String
//                                else null
//                        return if (value != null && value.startsWith("cwl:")) {
//                            arrayOf(CwlReference(element, TextRange(8, value.length + 1)))
//                        } else PsiReference.EMPTY_ARRAY
//                    }
//                })
//    }
//}