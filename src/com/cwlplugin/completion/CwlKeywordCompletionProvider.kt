package com.cwlplugin.completion

import com.cwlplugin.psi.CwlCommandLineTool
import com.cwlplugin.psi.CwlDockerPull
import com.cwlplugin.psi.CwlDockerRequirement
import com.cwlplugin.psi.CwlFile
import com.cwlplugin.psi.CwlRequirement
import com.cwlplugin.psi.CwlRequirements
import com.cwlplugin.psi.CwlTypes
import com.cwlplugin.psi.impl.CwlRequirementsImpl
import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.completion.InsertHandler
import com.intellij.codeInsight.completion.InsertionContext
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.editor.EditorModificationUtil
import com.intellij.patterns.ElementPattern
import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.PsiElementPattern
import com.intellij.patterns.StandardPatterns
import com.intellij.psi.PsiElement
import com.intellij.util.ProcessingContext

/**
 * Created by aleksandrsl on 14.06.17.
 */
class CwlKeywordCompletionProvider(private vararg val keywords: String)
    : CompletionProvider<CompletionParameters>() {

    override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext?, result: CompletionResultSet) {
        keywords.forEach { keyword ->
            var builder = LookupElementBuilder.create(keyword)
//            PREFIXES.filter { keyword in it.second }
//                    .firstOrNull()
//                    ?.let { builder = builder.withInsertHandler(it.first) }
            result.addElement(builder)
        }
    }

    companion object {

        fun requirements(): PsiElementPattern.Capture<PsiElement> = PlatformPatterns.psiElement(CwlTypes.COLON_TK).inside(psiElement<CwlCommandLineTool>())

        fun commandLineTool1(): PsiElementPattern.Capture<PsiElement> =
                psiElement<PsiElement>().withAncestor(8, psiElement<CwlFile>())

        fun commandLineTool2(): PsiElementPattern.Capture<PsiElement> =
                PlatformPatterns.psiElement(CwlTypes.COLON_TK).inside(psiElement<CwlRequirements>())

//        fun commandLineTool3(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>().afterLeaf(PlatformPatterns.psiElement(CwlTypes.COLON_TK)).inside(psiElement<CwlRequirement>())

        fun commandLineTool3(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>().afterLeaf(PlatformPatterns.psiElement(CwlTypes.COLON_TK)).withTreeParent(psiElement<CwlDockerRequirement>())

        fun commandLineTool4(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>().afterLeaf(PlatformPatterns.psiElement(CwlTypes.COLON_TK)).inside(psiElement<CwlDockerPull>())

        fun commandLineTool5(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>().afterLeaf(PlatformPatterns.psiElement(CwlTypes.COLON_TK)).withParent(psiElement<CwlDockerPull>())

        fun commandLineTool6(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>().afterLeaf(PlatformPatterns.psiElement(CwlTypes.COLON_TK).withSuperParent(2, psiElement<CwlRequirements>()))

        fun commandLineTool7(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>().afterLeaf(PlatformPatterns.psiElement(CwlTypes.COLON_TK).withParent(psiElement<CwlDockerPull>()))

//                .and(PlatformPatterns.psiElement().withParent(psiElement<CwlFile>()))

        private val PREFIXES = listOf(
                AddPrefix("class: ") to listOf("DockerRequirement", "InlineJavascriptRequirement")
        )

        /**
         * From Rust plugin
         */
        inline fun <reified I : PsiElement> psiElement(): PsiElementPattern.Capture<I> {
            return PlatformPatterns.psiElement(I::class.java)
        }
    }

    private class AddSuffix(val suffix: String) : InsertHandler<LookupElement> {
        override fun handleInsert(context: InsertionContext, item: LookupElement) {
            context.document.insertString(context.selectionEndOffset, suffix)
            EditorModificationUtil.moveCaretRelatively(context.editor, suffix.length)
        }
    }

    private class AddPrefix(val prefix: String) : InsertHandler<LookupElement> {
        override fun handleInsert(context: InsertionContext, item: LookupElement) {
            context.document.insertString(context.startOffset, prefix)
        }
    }
}

