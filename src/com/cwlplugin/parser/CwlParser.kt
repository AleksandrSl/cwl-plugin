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
        println("START PARSING")
        val start = System.currentTimeMillis()
        val rootMarker = builder.mark()
        val context = createParsingContext(builder, ToolType.COMMAND_LINE_TOOL)
        val requirementsParser = context.requirementsParser
        val commandLineToolparser = context.commandLineToolParser
//        builder.setTokenTypeRemapper(requirementsParser) // must be done before touching the caching lexer with eof() call.
//        var lastAfterSemicolon = false
        builder.setDebugMode(true)
        commandLineToolparser.parseCommandLineTool()
//        requirementsParser.parsePrimaryRequirements()
        while (!builder.eof()) {
            builder.advanceLexer()
//            context.pushScope(context.emptyParsingScope())
//            if (lastAfterSemicolon) {
//                statementParser.parseSimpleStatement()
//            } else {
//                statementParser.parseStatement()
//            }
//            lastAfterSemicolon = context.getScope().isAfterSemicolon()
//            context.popScope()
        }
        rootMarker.done(root)
        val ast = builder.treeBuilt
        val diff = System.currentTimeMillis() - start
        val kb = builder.currentOffset / 1000.0
        LOGGER.debug("Parsed " + String.format("%.1f", kb) + "K file in " + diff + "ms")
        return ast
    }

    protected fun createParsingContext(builder: PsiBuilder, toolType: ToolType): ParsingContext {
        return ParsingContext(builder, toolType)
    }


}