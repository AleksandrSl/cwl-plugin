package com.cwlplugin.parser

import com.intellij.lang.PsiBuilder
import com.intellij.vcs.log.VcsLogProvider
import java.util.*

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class ParsingContext(val builder: PsiBuilder, val toolType: ToolType) {

//    val inputsParser = InputsParser(this)
    val requirementsParser = RequirementsParser(this)
//    val outputsParser = OutputsParser(this)
    val myScopes: Deque<ParsingScope> = ArrayDeque()
    val currentScope: ParsingScope
        get() = myScopes.peek()

    init {
        myScopes.push(emptyParsingScope())
    }

    fun popScope(): ParsingScope {
        return myScopes.pop()
    }

    fun pushScope(scope: ParsingScope) {
        myScopes.push(scope)
    }

    fun emptyParsingScope(): ParsingScope = ParsingScope()
}