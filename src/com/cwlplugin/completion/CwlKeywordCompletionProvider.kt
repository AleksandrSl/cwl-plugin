package com.cwlplugin.completion

import com.cwlplugin.psi.CwlTypes
import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.editor.EditorModificationUtil
import com.intellij.util.ProcessingContext

/**
 * Created by aleksandrsl on 14.06.17.
 */
class CwlKeywordCompletionProvider (private vararg val keywords: String)
    : CompletionProvider<CompletionParameters>() {

    override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext?, result: CompletionResultSet) {
        for (keyword in keywords) {
            val builder = LookupElementBuilder.create(keyword)
//            SUFFIXES
//                    .filter { keyword in it.second }
//                    .firstOrNull()
//                    ?.let { builder = builder.withInsertHandler(it.first) }
            result.addElement(builder)
        }
    }

    private companion object {

//        val tokenn = CwlTypes.LABEL.

        val SUFFIXES = listOf(
                AddSuffix(" ") to listOf("crate", "const", "enum", "extern", "fn", "impl", "let", "mod", "mut", "pub",
                        "static", "struct", "trait", "type", "unsafe", "use"),
                AddSuffix("::") to listOf("self", "super")
        )
    }

    private class AddSuffix(val suffix: String) : InsertHandler<LookupElement> {
        override fun handleInsert(context: InsertionContext, item: LookupElement) {
            context.document.insertString(context.selectionEndOffset, suffix)
            EditorModificationUtil.moveCaretRelatively(context.editor, suffix.length)
        }
    }
}

