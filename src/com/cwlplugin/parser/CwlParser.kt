package com.cwlplugin.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.PsiBuilder
import com.intellij.lang.PsiParser
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.tree.IElementType

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlParser : PsiParser{

    private val LOGGER = Logger.getInstance(CwlParser::class.java.name)

    override fun parse(root: IElementType, builder: PsiBuilder): ASTNode {
        val start = System.currentTimeMillis()
        val rootMarker = builder.mark()
        val context = createParsingContext(builder, toolType)
        val statementParser = context.getStatementParser()
        builder.setTokenTypeRemapper(statementParser) // must be done before touching the caching lexer with eof() call.
        var lastAfterSemicolon = false
        while (!builder.eof()) {
            context.pushScope(context.emptyParsingScope())
            if (lastAfterSemicolon) {
                statementParser.parseSimpleStatement()
            } else {
                statementParser.parseStatement()
            }
            lastAfterSemicolon = context.getScope().isAfterSemicolon()
            context.popScope()
        }
        rootMarker.done(root)
        val ast = builder.treeBuilt
        val diff = System.currentTimeMillis() - start
        val kb = builder.currentOffset / 1000.0
        LOGGER.debug("Parsed " + String.format("%.1f", kb) + "K file in " + diff + "ms")
        return ast

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    protected fun createParsingContext(builder: PsiBuilder, toolType: ToolType): ParsingContext {
        return ParsingContext(builder, toolType)
    }
}