package com.cwlplugin.parser

import com.cwlplugin.CwlBundle
import com.cwlplugin.psi.CwlElementType
import com.cwlplugin.psi.CwlElementTypes
import com.intellij.lang.PsiBuilder

/**
 * Parse elements at CWL header
 * Created by aleksandrsl on 05.07.17.
 */
class HeaderParser(val context: ParsingContext) : Parsing(context) {

    // TODO: think about other way to organize different tools parsing, without constraining first two lines
    // to cwlVersion and class
    fun parseHeaderElements(): Boolean {

        val token = myBuilder.tokenType ?: return false
        with(CwlTokenTypes) {

            if (token != CWL_VERSION
                    || !parseSimpleStatement(CwlTokenTypes.CWL_VERSION_VALUE, CwlElementTypes.VERSION)) {
                myBuilder.error(CwlBundle.message("PARSE.expected.cwl_version"))
                return false
            }

            if (token != CLASS_KEYWORD) {
                myBuilder.error(CwlBundle.message("PARSE.expected.class"))
            }
            if (!parseTool()) {
                myBuilder.error(CwlBundle.message("PARSE.expected.class"))
                return false
            }
        }
        return true
    }

    fun parseTool(): Boolean {

        val tool: PsiBuilder.Marker = myBuilder.mark()
        var toolType: CwlElementType? = null
        nextToken()
        if (!checkMatches(CwlTokenTypes.COLON, CwlBundle.message("PARSE.expected.colon"))) {
            tool.drop(); return false
        }
        with(CwlTokenTypes) {
            when (myBuilder.tokenType) {
                COMMAND_LINE_TOOL_KEYWORD -> {
                    toolType = CwlElementTypes.COMMAND_LINE_TOOL_CLASS
                    val commandLineToolParser = context.commandLineToolParser
                    nextToken()
                    if (!checkMatches(CwlTokenTypes.LINE_BREAK, CwlBundle.message("PARSE.expected.line_break"))) {
                        tool.drop(); return false
                    }
                    if (!commandLineToolParser.parseCommandLineTool()) {
                        tool.drop()
                        return false
                    }
                }
                WORKFLOW_KEYWORD -> {
                    myBuilder.error(CwlBundle.message("PARSE.info.tool_type_not_implemented"))
                    tool.drop()
                    return false
                }
                EXPRESSION_TOOL_KEYWORD -> {
                    myBuilder.error(CwlBundle.message("PARSE.info.tool_type_not_implemented"))
                    tool.drop()
                    return false
                }
                else -> {
                    myBuilder.error(CwlBundle.message("PARSE.expected.tool"))
                    tool.drop()
                    return false
                }
            }
        }
        tool.done(toolType!!)
        return true
    }

}