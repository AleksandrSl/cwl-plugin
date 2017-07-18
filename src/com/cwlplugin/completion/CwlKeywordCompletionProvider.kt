package com.cwlplugin.completion

import com.cwlplugin.psi.CwlCommandInputParameter
import com.cwlplugin.psi.CwlCommandOutputParameter
import com.cwlplugin.psi.CwlDockerRequirement
import com.cwlplugin.psi.CwlInputBinding
import com.cwlplugin.psi.CwlOutputBinding
import com.cwlplugin.psi.CwlRequirementList
import com.cwlplugin.psi.CwlRequirementsBlock
import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.completion.InsertHandler
import com.intellij.codeInsight.completion.InsertionContext
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.editor.EditorModificationUtil
import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.PsiElementPattern
import com.intellij.psi.PsiElement
import com.intellij.util.ProcessingContext

/**
 * Created by aleksandrsl on 14.06.17.
 */
class CwlKeywordCompletionProvider(private val keywords: List<String>)
    : CompletionProvider<CompletionParameters>() {

    override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext?, result: CompletionResultSet) {
        keywords.forEach { keyword ->
            var builder = LookupElementBuilder.create(keyword)
            PREFIXES.plus(SUFFIXES).filter { keyword in it.second }
                    .firstOrNull()
                    ?.let { builder = builder.withInsertHandler(it.first) }
            result.addElement(builder)
        }
    }

    companion object {

        fun generalContext(): PsiElementPattern.Capture<PsiElement> =
                psiElement<PsiElement>()
                        .andNot(psiElement<PsiElement>().andOr(
                                psiElement<PsiElement>()
                                        .inside(false, psiElement<CwlRequirementsBlock>()),
                                psiElement<PsiElement>()
                                        .inside(false, psiElement<CwlRequirementList>())))


        fun requirements(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>()
                .andOr(psiElement<PsiElement>()
                        .inside(psiElement<CwlRequirementsBlock>()),
                        psiElement<PsiElement>()
                                .afterSibling(psiElement<CwlRequirementsBlock>()))

        fun dockerRequirement(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>()
                .andOr(psiElement<PsiElement>()
                        .inside(psiElement<CwlDockerRequirement>()),
                        psiElement<PsiElement>()
                                .afterSibling(psiElement<CwlDockerRequirement>()))

        fun inputBinding(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>()
                .andOr(psiElement<PsiElement>()
                        .inside(psiElement<CwlInputBinding>()))

        fun inputParameters(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>()
                .inside(true, psiElement<CwlCommandInputParameter>())

        fun outputParameters(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>()
                .inside(true, psiElement<CwlCommandOutputParameter>())

        fun outputBinding(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>()
                .andOr(psiElement<PsiElement>()
                        .inside(psiElement<CwlOutputBinding>()))


        private val PREFIXES = listOf(
                AddPrefix("- class: ") to Keywords.requirements
        )

        private val SUFFIXES = listOf(
                AddSuffix(": ") to Keywords.general
                        .plus(Keywords.inputBinding)
                        .plus(Keywords.inputParameters)
                        .plus(Keywords.outputParameters)
                        .plus(Keywords.dockerRequirement)
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

