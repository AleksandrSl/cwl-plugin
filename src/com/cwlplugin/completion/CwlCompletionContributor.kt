package com.cwlplugin.completion


import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.codeInsight.completion.CompletionType


/**
 * Created by aleksandrsl on 08.05.17.
 */
class CwlCompletionContributor : CompletionContributor() {

    init {

        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.generalContext(),
                CwlKeywordCompletionProvider(Keywords.general))

        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.requirements(),
                CwlKeywordCompletionProvider(Keywords.requirements))

        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.inputBinding(),
                CwlKeywordCompletionProvider(Keywords.inputBinding))

        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.inputParameters(),
                CwlKeywordCompletionProvider(Keywords.inputParameters))

        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.dockerRequirement(),
                CwlKeywordCompletionProvider(Keywords.dockerRequirement))

        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.outputBinding(),
                CwlKeywordCompletionProvider(Keywords.outputBinding))

        extend(CompletionType.BASIC, CwlKeywordCompletionProvider.outputParameters(),
                CwlKeywordCompletionProvider(Keywords.outputParameters))


    }
}

