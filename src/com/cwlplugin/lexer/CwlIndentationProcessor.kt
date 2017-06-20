package com.cwlplugin.lexer

import com.cwlplugin.parser.CwlTokenTypes
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.FlexLexer
import com.intellij.lexer.MergingLexerAdapter
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import gnu.trove.TIntStack
import java.util.*


/**
 * Created by aleksandrsl on 17.06.17.
 */
open class CwlIndentationProcessor(lexer: FlexLexer, tokens: TokenSet) : MergingLexerAdapter(FlexAdapter(lexer), tokens) {

    protected val myIndentStack = TIntStack()
    protected var myBraceLevel: Int = 0
    protected var myLineHasSignificantTokens: Boolean = false
    protected var myLastNewLineIndent = -1
    private var myCurrentNewLineIndent = 0
    private var hasUnclosedColon = false
    private val RECOVERY_TOKENS = CwlTokenTypes.REQUIREMENTS_TOKENS
//    private val RECOVERY_TOKENS = PythonDialectsTokenSetProvider.INSTANCE.getUnbalancedBracesRecoveryTokens()

    protected open class PendingToken(var type: IElementType?, val start: Int, val end: Int) {

        override fun toString(): String =
                "${type.toString()}:$start-$end"
    }

    private class PendingCommentToken(type: IElementType?, start: Int, end: Int, val indent: Int) : PendingToken(type, start, end)

    protected var myTokenQueue: MutableList<PendingToken> = ArrayList()

    protected var myProcessSpecialTokensPending = false

    protected val baseTokenType: IElementType?
        get() = super.getTokenType()

    protected val baseTokenStart: Int
        get() = super.getTokenStart()

    protected val baseTokenEnd: Int
        get() = super.getTokenEnd()

    private fun isBaseAt(tokenType: IElementType): Boolean {
        return baseTokenType === tokenType
    }

    override fun getTokenType(): IElementType? {
        if (myTokenQueue.size > 0) {
//            println(myTokenQueue[0].type.toString())
            return myTokenQueue[0].type
        }
//        println(super.getTokenType().toString())
        return super.getTokenType()
    }

    override fun getTokenStart(): Int = if (myTokenQueue.size > 0) myTokenQueue[0].start else baseTokenStart


    override fun getTokenEnd(): Int = if (myTokenQueue.size > 0) myTokenQueue[0].end else baseTokenEnd

    override fun advance() {
        when(tokenType) {
            CwlTokenTypes.LINE_BREAK -> {
                val text = tokenText
                var spaces = 0
                for (i in text.length - 1 downTo 0) {
                    when {
                        text[i] == ' ' -> spaces++
                        text[i] == '\t' -> spaces += 8
                    }
                }
                myCurrentNewLineIndent = spaces
            }
            CwlTokenTypes.TAB ->  myCurrentNewLineIndent += 8
        }
        if (myTokenQueue.size > 0) {
            myTokenQueue.removeAt(0)
            if (myProcessSpecialTokensPending) {
                myProcessSpecialTokensPending = false
                processSpecialTokens()
            }
        } else {
            advanceBase()
            processSpecialTokens()
        }
        adjustBraceLevel()
        if (DUMP_TOKENS) {
            if (tokenType != null) {
                print("$tokenStart-$tokenEnd:$tokenType")
                if (tokenType === CwlTokenTypes.LINE_BREAK) println("{$myBraceLevel}") else print(" ")
            }
        }
    }

    protected fun advanceBase() : Unit {
        super.advance()
        hasUnclosedColon()
        checkSignificantTokens()
    }

    protected fun pushToken(type: IElementType, start: Int, end: Int): Unit {
        myTokenQueue.add(PendingToken(type, start, end))
    }

    override fun start(buffer: CharSequence, startOffset: Int, endOffset: Int, initialState: Int): Unit {
        checkStartState(startOffset, initialState)
        super.start(buffer, startOffset, endOffset, initialState)
        setStartState()
    }

    protected fun checkStartState(startOffset: Int, initialState: Int): Unit {
        if (DUMP_TOKENS) println("\n--- LEXER START---")
    }

    private fun setStartState(): Unit {
        myIndentStack.clear()
        myIndentStack.push(0)
        myBraceLevel = 0
        adjustBraceLevel()
        myLineHasSignificantTokens = false
        hasUnclosedColon()
        checkSignificantTokens()
        if (isBaseAt(CwlTokenTypes.SPACE)) {
            processIndent(0, CwlTokenTypes.SPACE)
        }
    }

    private fun adjustBraceLevel() {
        val tokenType: IElementType? = tokenType
        when {
            CwlTokenTypes.OPEN_BRACES.contains(tokenType) -> {
                myBraceLevel++
            }
            CwlTokenTypes.CLOSE_BRACES.contains(tokenType) -> {
                myBraceLevel--
            }
            (myBraceLevel != 0 && RECOVERY_TOKENS.contains(tokenType)) -> {
                myBraceLevel = 0
                val pos = tokenStart
                pushToken(CwlTokenTypes.STATEMENT_BREAK, pos, pos)
                val indents = myIndentStack.size()
                for (i in 0..indents - 1 - 1) {
                    val indent = myIndentStack.peek()
                    if (myCurrentNewLineIndent >= indent) {
                        break
                    }
                    if (myIndentStack.size() > 1) {
                        myIndentStack.pop()
                        pushToken(CwlTokenTypes.DEDENT, pos, pos)
                    }
                }
                pushToken(CwlTokenTypes.LINE_BREAK, pos, pos)
            }
        }
    }

    protected fun checkSignificantTokens() {
        myLineHasSignificantTokens = (!CwlTokenTypes.WHITESPACE_OR_LINEBREAK.contains(baseTokenType) && (baseTokenType != commentTokenType))
//        println(baseTokenType)
//        println("SIGNIFICANCE CHECKED, RESULT:$myLineHasSignificantTokens")
    }

    protected open fun processSpecialTokens() {
        val tokenStart = baseTokenStart
        when {
            isBaseAt(CwlTokenTypes.LINE_BREAK) -> {
                processLineBreak(tokenStart)
                while (isBaseAt(commentTokenType)) {
                    // comment at start of line; maybe we need to generate dedent before the comments
                    myTokenQueue.add(PendingCommentToken(baseTokenType, baseTokenStart, baseTokenEnd, myLastNewLineIndent))
                    advanceBase()
                    if (!isBaseAt(CwlTokenTypes.LINE_BREAK)) break
                    processLineBreak(baseTokenStart)
                }
            }
//            isBaseAt(CwlTokenTypes.BACKSLASH) -> {
//                processBackslash(tokenStart)
//            }
            isBaseAt(CwlTokenTypes.SPACE) -> {
                processSpace()
            }
        }
    }

    private fun processSpace() {
        val start = baseTokenStart
        var end = baseTokenEnd
        while (baseTokenType === CwlTokenTypes.SPACE) {
            end = baseTokenEnd
            advanceBase()
        }
        when(baseTokenType){
            CwlTokenTypes.LINE_BREAK -> processLineBreak(start)

//            CwlTokenTypes.BACKSLASH) -> processBackslash(start)
            else -> myTokenQueue.add(PendingToken(CwlTokenTypes.SPACE, start, end))
        }
    }

//    private fun processBackslash(tokenStart: Int) {
//        val backslashToken = PendingToken(baseTokenType, tokenStart, baseTokenEnd)
//        myTokenQueue.add(backslashToken)
//        advanceBase()
//        while (CwlTokenTypes.WHITESPACE.contains(baseTokenType)) {
//            pushCurrentToken()
//            advanceBase()
//        }
//        if (baseTokenType === CwlTokenTypes.LINE_BREAK) {
//            backslashToken.type = CwlTokenTypes.SPACE
//            processInsignificantLineBreak(baseTokenStart, true)
//        }
//        myProcessSpecialTokensPending = true
//    }
    protected fun hasUnclosedColon(){
        if (!hasUnclosedColon) {
            hasUnclosedColon = baseTokenType == CwlTokenTypes.COLON
        } else {
            if (!CwlTokenTypes.WHITESPACE_OR_LINEBREAK.contains(baseTokenType) && (baseTokenType != commentTokenType))
            {
                hasUnclosedColon = false
            }
        }
}

    protected fun processLineBreak(startPos: Int): Unit {
        if (myBraceLevel == 0) {
            if (hasUnclosedColon) {
                println("BREAK ME 1")
                pushToken(CwlTokenTypes.STATEMENT_BREAK, startPos, startPos)
            }
            myLineHasSignificantTokens = false
            hasUnclosedColon = false
            advanceBase()
            processIndent(startPos, CwlTokenTypes.LINE_BREAK)
        } else {
            println("BREAK ME 3")
            processInsignificantLineBreak(startPos, false)
        }
    }

    protected fun processInsignificantLineBreak(startPos: Int,
                                                breakStatementOnLineBreak: Boolean): Unit {
        // merge whitespace following the line break character into the
        // line break token
        var end = baseTokenEnd
        advanceBase()
        with(CwlTokenTypes) {
            while (baseTokenType === SPACE || baseTokenType === TAB ||
                    !breakStatementOnLineBreak && baseTokenType === LINE_BREAK) {
                end = baseTokenEnd
                advanceBase()
            }
            myTokenQueue.add(PendingToken(LINE_BREAK, startPos, end))
            myProcessSpecialTokensPending = true
        }
    }

    protected fun processIndent(whiteSpaceStart: Int, whitespaceTokenType: IElementType) {
        var lastIndent = myIndentStack.peek()
        var indent = nextLineIndent
        myLastNewLineIndent = indent
        // don't generate indent/dedent tokens if a line contains only end-of-line comment and whitespace
        if (baseTokenType === commentTokenType) {
            indent = lastIndent
        }
        val whiteSpaceEnd = if (baseTokenType == null) super.getBufferEnd() else baseTokenStart
        when {
            indent > lastIndent -> {
                myIndentStack.push(indent)
                myTokenQueue.add(PendingToken(whitespaceTokenType, whiteSpaceStart, whiteSpaceEnd))
                val insertIndex = skipPrecedingCommentsWithIndent(indent, myTokenQueue.size - 1)
                val indentOffset = if (insertIndex == myTokenQueue.size) whiteSpaceEnd else myTokenQueue[insertIndex].start
                myTokenQueue.add(insertIndex, PendingToken(CwlTokenTypes.INDENT, indentOffset, indentOffset))
            }
            indent < lastIndent -> {
                while (indent < lastIndent) {
                    myIndentStack.pop()
                    lastIndent = myIndentStack.peek()
                    var insertIndex = myTokenQueue.size
                    var dedentOffset = whiteSpaceStart
                    if (indent > lastIndent) {
                        myTokenQueue.add(PendingToken(CwlTokenTypes.INCONSISTENT_DEDENT, whiteSpaceStart, whiteSpaceStart))
                        insertIndex++
                    } else {
                        insertIndex = skipPrecedingCommentsWithIndent(indent, insertIndex)
                    }
                    if (insertIndex != myTokenQueue.size) {
                        dedentOffset = myTokenQueue[insertIndex].start
                    }
                    myTokenQueue.add(insertIndex, PendingToken(CwlTokenTypes.DEDENT, dedentOffset, dedentOffset))
                }
                myTokenQueue.add(PendingToken(whitespaceTokenType, whiteSpaceStart, whiteSpaceEnd))
            }
            else -> {
                myTokenQueue.add(PendingToken(whitespaceTokenType, whiteSpaceStart, whiteSpaceEnd))
            }
        }
    }

    protected fun skipPrecedingCommentsWithIndent(indent: Int, index: Int): Int {
        var index_copy = index
        // insert the DEDENT before previous comments that have the same indent as the current token indent
        var foundComment = false
        while (index_copy > 0 && myTokenQueue[index_copy - 1] is PendingCommentToken) {
            val commentToken = myTokenQueue[index_copy - 1] as PendingCommentToken
            if (commentToken.indent != indent) break
            foundComment = true
            index_copy--
            if (index_copy > 1 &&
                    myTokenQueue[index_copy - 1].type === CwlTokenTypes.LINE_BREAK &&
                    myTokenQueue[index_copy - 2] is PendingCommentToken) {
                index_copy--
            }
        }
        return if (foundComment) index_copy else myTokenQueue.size
    }

    protected val nextLineIndent: Int
        get() {
            var indent = 0
            while (baseTokenType != null && CwlTokenTypes.WHITESPACE_OR_LINEBREAK.contains(baseTokenType)) {

                with(CwlTokenTypes) {
                    when (baseTokenType) {
                        TAB -> indent = (indent / 8 + 1) * 8
                        SPACE -> indent++
                        LINE_BREAK -> indent = 0
                    }
                    advanceBase()
                }
            }
            return if (baseTokenType == null) 0 else indent
        }

    private fun pushCurrentToken(): Unit {
        myTokenQueue.add(PendingToken(baseTokenType, baseTokenStart, baseTokenEnd))
    }

    protected val commentTokenType: IElementType
        get() = CwlTokenTypes.END_OF_LINE_COMMENT


    companion object {

        private const val DUMP_TOKENS = false
    }
}
