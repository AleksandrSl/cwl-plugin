package com.cwlplugin.completion


import com.cwlplugin.psi.CwlTypes
import com.cwlplugin.psi.impl.CwlRequirementsImpl
import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.completion.CompletionType
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.wm.KeyEventProcessor
import com.intellij.patterns.ElementPattern
import com.intellij.patterns.PlatformPatterns
import com.intellij.patterns.PlatformPatterns.psiElement
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

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(CwlTypes.INPUTS_TK),
                object : CompletionProvider<CompletionParameters>() {
                    public override fun addCompletions(parameters: CompletionParameters,
                                                       context: ProcessingContext,
                                                       resultSet: CompletionResultSet) {
                        resultSet.addElement(LookupElementBuilder.create("inputs"))
                    }
                }
        )

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

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(CwlTypes.STRING),
                object : CompletionProvider<CompletionParameters>() {
                    public override fun addCompletions(parameters: CompletionParameters,
                                                       context: ProcessingContext,
                                                       resultSet: CompletionResultSet) {
                        resultSet.addElement(LookupElementBuilder.create("WTF"))
                    }
                }
        )

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(CwlTypes.REQUIREMENTS),
                object : CompletionProvider<CompletionParameters>() {
                    public override fun addCompletions(parameters: CompletionParameters,
                                                       context: ProcessingContext,
                                                       resultSet: CompletionResultSet) {
                        resultSet.addElement(LookupElementBuilder.create("requirement"))
                        resultSet.addElement(LookupElementBuilder.create("Hel1"))
                        resultSet.addElement(LookupElementBuilder.create("Hel2"))
                        resultSet.addElement(LookupElementBuilder.create("Hel3"))
                        resultSet.addElement(LookupElementBuilder.create("classification"))
                    }
                }
        )

        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(CwlTypes.REQUIREMENT),
                object : CompletionProvider<CompletionParameters>() {
                    public override fun addCompletions(parameters: CompletionParameters,
                                                       context: ProcessingContext,
                                                       resultSet: CompletionResultSet) {
                        resultSet.addElement(LookupElementBuilder.create("requirement"))
                        resultSet.addElement(LookupElementBuilder.create("Hel1"))
                        resultSet.addElement(LookupElementBuilder.create("Hel2"))
                        resultSet.addElement(LookupElementBuilder.create("Hel3"))
                        resultSet.addElement(LookupElementBuilder.create("classification"))
                    }
                }
        )

//        val provider = object : CompletionProvider<CompletionParameters>() {
//            override fun addCompletions(parameters: CompletionParameters, context: ProcessingContext, result: CompletionResultSet) {
//                performCompletion(parameters, result)
//            }
//        }
//        extend(CompletionType.BASIC, PlatformPatterns.psiElement(), provider)
    }

    private fun requirements(): ElementPattern<PsiElement> {
        println("Requirements function used ${psiElement(CwlTypes.REQUIREMENTS_TK)}")
        return PlatformPatterns.psiElement(CwlTypes.REQUIREMENTS)
//        return psiElement(CwlTypes.REQUIREMENTS_TK)
    }

//    private fun performCompletion(parameters: CompletionParameters, result: CompletionResultSet) {
//        val position = parameters.position
//        if (position.containingFile !is CwlFile) return
//        if ((parameters.originalFile as CwlFile).doNotComplete ?: false) return
//
//        val toFromOriginalFileMapper = ToFromOriginalFileMapper.create(parameters)
//
//        doComplete(parameters, toFromOriginalFileMapper, result)
//    }

//    private fun doComplete(
//            parameters: CompletionParameters,
//            toFromOriginalFileMapper: ToFromOriginalFileMapper,
//            result: CompletionResultSet,
//            lookupElementPostProcessor: ((LookupElement) -> LookupElement)? = null
//    ) {
//        val position = parameters.position
//        if (position.getNonStrictParentOfType<PsiComment>() != null) {
//            // don't stop here, allow other contributors to run
//            return
//        }
//
//        if (shouldSuppressCompletion(parameters, result.prefixMatcher)) {
//            result.stopHere()
//            return
//        }
//
//        if (PackageDirectiveCompletion.perform(parameters, result)) {
//            result.stopHere()
//            return
//        }
//
//        if (PropertyKeyCompletion.perform(parameters, result)) return
//
//        fun addPostProcessor(session: CompletionSession) {
//            if (lookupElementPostProcessor != null) {
//                session.addLookupElementPostProcessor(lookupElementPostProcessor)
//            }
//        }
//
//        result.restartCompletionWhenNothingMatches()
//
//        val configuration = CompletionSessionConfiguration(parameters)
//        if (parameters.completionType == CompletionType.BASIC) {
//            val session = BasicCompletionSession(configuration, parameters, toFromOriginalFileMapper, result)
//
//            addPostProcessor(session)
//
//            if (parameters.isAutoPopup && session.shouldDisableAutoPopup()) {
//                result.stopHere()
//                return
//            }
//
//            val somethingAdded = session.complete()
//            if (!somethingAdded && parameters.invocationCount < 2) {
//                // Rerun completion if nothing was found
//                val newConfiguration = CompletionSessionConfiguration(
//                        useBetterPrefixMatcherForNonImportedClasses = false,
//                        nonAccessibleDeclarations = false,
//                        javaGettersAndSetters = true,
//                        javaClassesNotToBeUsed = false,
//                        staticMembers = parameters.invocationCount > 0,
//                        dataClassComponentFunctions = true
//                )
//
//                val newSession = BasicCompletionSession(newConfiguration, parameters, toFromOriginalFileMapper, result)
//                addPostProcessor(newSession)
//                newSession.complete()
//            }
//        }
//        else {
//            val session = SmartCompletionSession(configuration, parameters, toFromOriginalFileMapper, result)
//            addPostProcessor(session)
//            session.complete()
//        }
//    }
//
//    override fun fillCompletionVariants(parameters: CompletionParameters, result: CompletionResultSet) {
//        if (parameters.completionType == CompletionType.BASIC) {
//            val psiElement = parameters.position
//            val psiFile = parameters.originalPosition?.containingFile
//
////            for (value in KEYWORDS) {
////                result.addElement(LookupElementBuilder.create(value.toString()))
////            }
//        }
//    }
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

