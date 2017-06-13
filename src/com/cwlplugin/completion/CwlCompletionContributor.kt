package com.cwlplugin.completion

import com.cwlplugin.psi.CwlFile
import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.PsiComment
import com.intellij.util.ProcessingContext

//var CwlFile.doNotComplete: Boolean? by UserDataProperty(Key.create("DO_NOT_COMPLETE"))

/**
 * Created by aleksandrsl on 08.05.17.
 */
class CwlCompletionContributor: CompletionContributor() {

    init {

        val provider = object : CompletionProvider<CompletionParameters>() {
            override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext, result: CompletionResultSet) {
                performCompletion(parameters, result)
            }
        }
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(), provider)
    }

    private fun performCompletion(parameters: CompletionParameters, result: CompletionResultSet) {
        val position = parameters.position
        if (position.containingFile !is CwlFile) return
//        if ((parameters.originalFile as CwlFile).doNotComplete ?: false) return

        val toFromOriginalFileMapper = ToFromOriginalFileMapper.create(parameters)

        doComplete(parameters, toFromOriginalFileMapper, result)
    }

    private fun doComplete(
            parameters: CompletionParameters,
            toFromOriginalFileMapper: ToFromOriginalFileMapper,
            result: CompletionResultSet,
            lookupElementPostProcessor: ((LookupElement) -> LookupElement)? = null
    ) {
        val position = parameters.position
        if (position.getNonStrictParentOfType<PsiComment>() != null) {
            // don't stop here, allow other contributors to run
            return
        }

        if (shouldSuppressCompletion(parameters, result.prefixMatcher)) {
            result.stopHere()
            return
        }

        if (PackageDirectiveCompletion.perform(parameters, result)) {
            result.stopHere()
            return
        }

        if (PropertyKeyCompletion.perform(parameters, result)) return

        fun addPostProcessor(session: CompletionSession) {
            if (lookupElementPostProcessor != null) {
                session.addLookupElementPostProcessor(lookupElementPostProcessor)
            }
        }

        result.restartCompletionWhenNothingMatches()

        val configuration = CompletionSessionConfiguration(parameters)
        if (parameters.completionType == CompletionType.BASIC) {
            val session = BasicCompletionSession(configuration, parameters, toFromOriginalFileMapper, result)

            addPostProcessor(session)

            if (parameters.isAutoPopup && session.shouldDisableAutoPopup()) {
                result.stopHere()
                return
            }

            val somethingAdded = session.complete()
            if (!somethingAdded && parameters.invocationCount < 2) {
                // Rerun completion if nothing was found
                val newConfiguration = CompletionSessionConfiguration(
                        useBetterPrefixMatcherForNonImportedClasses = false,
                        nonAccessibleDeclarations = false,
                        javaGettersAndSetters = true,
                        javaClassesNotToBeUsed = false,
                        staticMembers = parameters.invocationCount > 0,
                        dataClassComponentFunctions = true
                )

                val newSession = BasicCompletionSession(newConfiguration, parameters, toFromOriginalFileMapper, result)
                addPostProcessor(newSession)
                newSession.complete()
            }
        }
        else {
            val session = SmartCompletionSession(configuration, parameters, toFromOriginalFileMapper, result)
            addPostProcessor(session)
            session.complete()
        }
    }

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

