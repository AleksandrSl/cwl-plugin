package com.cwlplugin.reference

//import com.cwlplugin.CwlUtil
import com.cwlplugin.icons.CwlIcons
import com.cwlplugin.psi.CwlCommandInputParameter
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiPolyVariantReference
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.ResolveResult

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
//class CwlReference(element: PsiElement, textRange: TextRange)
//    : PsiReferenceBase<PsiElement>(element, textRange), PsiPolyVariantReference {
//
//    private val identifier: String = element.text.substring(textRange.startOffset, textRange.endOffset)
//
//    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
//        val project: Project = myElement.project
//        return CwlUtil.findCommandInputParameters(project, identifier)
//                .map { PsiElementResolveResult(it) }
//                .toTypedArray()
//    }
//
//    override fun resolve(): PsiElement? {
//        val resolveResults = multiResolve(false)
//        return if (resolveResults.size == 1) resolveResults[0].element else null
//    }
//
//    override fun getVariants(): Array<Any> {
//        val project: Project = myElement.project
//        return CwlUtil.findCommandInputParameters(project, identifier)
//                .filter { it.identifier != null && (it.identifier as String).isNotEmpty() }
//                .map {
//                    LookupElementBuilder.create(it).withIcon(CwlIcons.FILE).withTypeText(it.containingFile.name)
//                }.toTypedArray()
//    }
//}