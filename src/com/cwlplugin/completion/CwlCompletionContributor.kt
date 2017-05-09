package com.cwlplugin.completion

import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.codeInsight.lookup.LookupElementBuilder


/**
 * Created by aleksandrsl on 08.05.17.
 */
class CwlCompletionContributor: CompletionContributor() {

    override fun fillCompletionVariants(parameters: CompletionParameters, result: CompletionResultSet) {
        if (parameters.completionType == CompletionType.BASIC) {
            val psiElement = parameters.position
            val psiFile = parameters.originalPosition?.containingFile

//            for (value in KEYWORDS) {
//                result.addElement(LookupElementBuilder.create(value.toString()))
//            }
        }
    }
}
//            if (psiElement.parent is ModuleName) {
//                for (value in GhcMod.getModulesList()) {
//                    result.addElement(LookupElementBuilder.create(value)!!)
//                }
//            } else {
//                for (value in findCompletion(psiElement, psiFile)) {
//                    result.addElement(LookupElementBuilder.create(value.first)!!
//                            .withTypeText(value.second)!!)
//                }

//    private fun findCompletion(element: PsiElement,
//                               psiFile: PsiFile?): Set<Pair<String, String?>> {
//        val names = HashSet<Pair<String, String?>>()
//        val module = ModulefindModule(element)

//        if (module != null) {
//            val list = module.getImportList()
//            for (import in list) {
//                val moduleExports = import.getModuleExports()
//                if (moduleExports != null) {
//                    for (export in moduleExports.getSymbolExportList()) {
//                        names.add(Pair(export.getText()!!, null))
//                    }
//                } else {
//                    val moduleName = import.getModuleName()!!.getText()
//                    for (name in GhcMod.getModuleContent(moduleName!!)) {
//                        names.add(name)
//                    }
//                }
//            }
//        }
//        for (name in GhcMod.getModuleContent("Prelude")) {
//            names.add(name)
//        }
//        return names
//    }

