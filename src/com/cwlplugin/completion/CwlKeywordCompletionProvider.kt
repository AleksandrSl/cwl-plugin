package com.cwlplugin.completion

import com.cwlplugin.psi.CwlRequirementList
import com.cwlplugin.psi.CwlRequirementsBlock
import com.cwlplugin.parser.CwlTokenTypes
import com.cwlplugin.psi.CwlFile
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
import com.intellij.psi.TokenType
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

        fun general_context(): PsiElementPattern.Capture<PsiElement> =
                psiElement<PsiElement>().withParent(PlatformPatterns.psiFile())

        fun requirements(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>().afterLeaf(PlatformPatterns.psiElement(CwlTokenTypes.COLON).withParent(psiElement<CwlRequirementList>()))

//        fun commandLineTool1(): PsiElementPattern.Capture<PsiElement> =
//                psiElement<PsiElement>().afterLeaf(psiElement<CwlRequirementsBlock>())
//
//        fun commandLineTool2(): PsiElementPattern.Capture<PsiElement> =
//                psiElement<PsiElement>().withAncestor(2, psiElement<CwlRequirementsBlock>())
//
//        fun commandLineTool3(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>().withFirstNonWhitespaceChild(psiElement<CwlRequirementList>())
//
//        fun commandLineTool4(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>().withSuperParent(1, psiElement<CwlRequirementList>())
//
//        fun commandLineTool5(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>().withParent(psiElement<CwlRequirementsBlock>())
//
//        fun commandLineTool6(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>().afterLeaf(PlatformPatterns.psiElement(CwlTokenTypes.COLON).withSuperParent(1, psiElement<CwlRequirementList>()))

//        fun commandLineTool7(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>().afterLeaf(PlatformPatterns.psiElement(CwlTokenTypes.COLON).withParent(psiElement<CwlRequirementList>()))


        // These works
//        fun commandLineTool6(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>().afterLeaf(PlatformPatterns.psiElement(CwlTokenTypes.COLON).withSuperParent(1, psiElement<CwlRequirementList>()))
//
//        fun commandLineTool7(): PsiElementPattern.Capture<PsiElement> = psiElement<PsiElement>().afterLeaf(PlatformPatterns.psiElement(CwlTokenTypes.COLON).withParent(psiElement<CwlRequirementList>()))

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

