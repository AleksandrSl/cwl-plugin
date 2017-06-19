package com.cwlplugin.completion


import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType


//var CwlFile.doNotComplete: Boolean? by UserDataProperty(Key.create("DO_NOT_COMPLETE"))

/**
 * Created by aleksandrsl on 08.05.17.
 */
class CwlCompletionContributor : CompletionContributor() {

    init {

        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.general_context(),
                CwlKeywordCompletionProvider("requirements", "cwlVersion", "inputs", "outputs", "class", "baseCommand",
                        "id", "label", "doc", "hints", "arguments", "stderr", "stdout", "successCodes",
                        "temporaryFailCodes", "permanentFailCodes"))

        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.requirements(),
                CwlKeywordCompletionProvider("1","DockerRequirement", "InlineJavascriptRequirement",
                        "SchemaDefRequirement", "SoftwareRequirement", "InitialWorkDirRequirement",
                        "EnvVarRequirement", "ShellCommandRequirement", "ResourceRequirement"))

//        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.commandLineTool1(),
//                CwlKeywordCompletionProvider("2"))
//
//        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.commandLineTool2(),
//                CwlKeywordCompletionProvider("3", "DockerRequirement", "InlineJavascriptRequirement"))
//
//        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.commandLineTool3(),
//                CwlKeywordCompletionProvider("4", "DockerRequirement", "InlineJavascriptRequirement"))
//
//        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.commandLineTool4(),
//                CwlKeywordCompletionProvider("5", "DockerRequirement", "InlineJavascriptRequirement"))
//        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.commandLineTool5(),
//                CwlKeywordCompletionProvider("6", "DockerRequirement", "InlineJavascriptRequirement"))
//
//        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.commandLineTool6(),
//                CwlKeywordCompletionProvider("7", "DockerRequirement", "InlineJavascriptRequirement"))
//        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.commandLineTool7(),
//                CwlKeywordCompletionProvider("8", "DockerRequirement", "InlineJavascriptRequirement"))

//
//
// extend(CompletionType.BASIC,
//                PlatformPatterns.psiElement(CwlTypes.INPUTS_TK),
//                object : CompletionProvider<CompletionParameters>() {
//                    public override fun addCompletions(parameters: CompletionParameters,
//                                                       context: ProcessingContext,
//                                                       resultSet: CompletionResultSet) {
//                        resultSet.addElement(LookupElementBuilder.create("inputs"))
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
}

