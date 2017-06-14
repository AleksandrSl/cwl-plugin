package com.cwlplugin.completion


import com.cwlplugin.psi.CwlFile
import com.cwlplugin.psi.CwlTypes
import com.cwlplugin.psi.impl.CwlRequirementsImpl
import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.util.Conditions.or
import com.intellij.openapi.wm.KeyEventProcessor
import com.intellij.patterns.ElementPattern
import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.PlatformPatterns.psiElement
import com.intellij.patterns.PsiElementPattern
import com.intellij.psi.PsiElement
import com.intellij.util.ProcessingContext


//var CwlFile.doNotComplete: Boolean? by UserDataProperty(Key.create("DO_NOT_COMPLETE"))

/**
 * Created by aleksandrsl on 08.05.17.
 */
class CwlCompletionContributor : CompletionContributor() {

    init {

        extend(
                CompletionType.BASIC,
                requirements(),
                SimpleProvider(listOf("requirement"))
        )

        extend(CompletionType.BASIC, baseDeclarationPattern(),
                CwlKeywordCompletionProvider("const", "enum", "extern", "fn", "impl", "mod", "pub", "static", "struct", "trait", "type", "unsafe", "use"))

//        extend(CompletionType.BASIC,
//                PlatformPatterns.psiElement(CwlTypes.INPUTS_TK),
//                object : CompletionProvider<CompletionParameters>() {
//                    public override fun addCompletions(parameters: CompletionParameters,
//                                                       context: ProcessingContext,
//                                                       resultSet: CompletionResultSet) {
//                        resultSet.addElement(LookupElementBuilder.create("inputs"))
//                    }
//                }
//        )

//        extend(CompletionType.BASIC,
//                PlatformPatterns.psiElement(CwlTypes.IDENTIFIER),
//                object : CompletionProvider<CompletionParameters>() {
//                    public override fun addCompletions(parameters: CompletionParameters,
//                                                       context: ProcessingContext,
//                                                       resultSet: CompletionResultSet) {
//                        resultSet.addElement(LookupElementBuilder.create("Hel"))
//                        resultSet.addElement(LookupElementBuilder.create("Hel1"))
//                        resultSet.addElement(LookupElementBuilder.create("Hel2"))
//                        resultSet.addElement(LookupElementBuilder.create("Hel3"))
//                        resultSet.addElement(LookupElementBuilder.create("classification"))
//
//                    }
//                }
//        )

//        extend(CompletionType.BASIC,
//                PlatformPatterns.psiElement(CwlTypes.STRING),
//                object : CompletionProvider<CompletionParameters>() {
//                    public override fun addCompletions(parameters: CompletionParameters,
//                                                       context: ProcessingContext,
//                                                       resultSet: CompletionResultSet) {
//                        resultSet.addElement(LookupElementBuilder.create("WTF"))
//                    }
//                }
//        )
//
//        extend(CompletionType.BASIC,
//                PlatformPatterns.psiElement(CwlTypes.REQUIREMENTS),
//                object : CompletionProvider<CompletionParameters>() {
//                    public override fun addCompletions(parameters: CompletionParameters,
//                                                       context: ProcessingContext,
//                                                       resultSet: CompletionResultSet) {
//                        resultSet.addElement(LookupElementBuilder.create("requirement"))
//                        resultSet.addElement(LookupElementBuilder.create("Hel1"))
//                        resultSet.addElement(LookupElementBuilder.create("Hel2"))
//                        resultSet.addElement(LookupElementBuilder.create("Hel3"))
//                        resultSet.addElement(LookupElementBuilder.create("classification"))
//                    }
//                }
//        )
//
//        extend(CompletionType.BASIC,
//                PlatformPatterns.psiElement(CwlTypes.REQUIREMENT),
//                object : CompletionProvider<CompletionParameters>() {
//                    public override fun addCompletions(parameters: CompletionParameters,
//                                                       context: ProcessingContext,
//                                                       resultSet: CompletionResultSet) {
//                        resultSet.addElement(LookupElementBuilder.create("requirement"))
//                        resultSet.addElement(LookupElementBuilder.create("Hel1"))
//                        resultSet.addElement(LookupElementBuilder.create("Hel2"))
//                        resultSet.addElement(LookupElementBuilder.create("Hel3"))
//                        resultSet.addElement(LookupElementBuilder.create("classification"))
//                    }
//                }
//        )

//        val provider = object : CompletionProvider<CompletionParameters>() {
//            override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext, result: CompletionResultSet) {
//                performCompletion(parameters, result)
//            }
//        }
//        extend(CompletionType.BASIC, PlatformPatterns.psiElement(), provider)
    }

//    private fun declarationPattern(): PsiElementPattern.Capture<PsiElement> =
//            baseDeclarationPattern().and(statementBeginningPattern())

    private fun baseDeclarationPattern(): PsiElementPattern.Capture<PsiElement> =
            psiElement().andOr(
                    //                    psiElement().withParent(CwlPath::class.java),
                    psiElement().withParent(psiElement<CwlFile>()))



    private fun requirements(): ElementPattern<PsiElement> {
        println("Requirements function used ${psiElement(CwlTypes.REQUIREMENTS_TK)}")
        return PlatformPatterns.psiElement(CwlTypes.REQUIREMENTS)
//        return psiElement(CwlTypes.REQUIREMENTS_TK)
    }

    /**
     * From Rust plugin
     */
    inline fun <reified I : PsiElement> psiElement(): PsiElementPattern.Capture<I> {
        return psiElement(I::class.java)
    }
}

