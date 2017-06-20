package com.cwlplugin.parser

import com.cwlplugin.CwlLanguage
import com.cwlplugin.lexer.CwlIndentationLexer
import com.cwlplugin.psi.CwlElementType
import com.cwlplugin.psi.CwlFile
import com.cwlplugin.psi.CwlStubElementType
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet


class CwlParserDefinition : ParserDefinition {

//    override fun createLexer(project: Project): Lexer = CwlLexerAdapter()
    override fun createLexer(project: Project): Lexer = CwlIndentationLexer()

    override fun getWhitespaceTokens(): TokenSet = myWhitespaceTokens

    override fun getCommentTokens(): TokenSet = myCommentTokens

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createParser(project: Project): PsiParser = CwlParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun createFile(viewProvider: FileViewProvider): PsiFile = CwlFile(viewProvider)

    override fun spaceExistanceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements =
            ParserDefinition.SpaceRequirements.MAY

    override fun createElement(node: ASTNode): PsiElement {
        val type = node.elementType
        if (type is CwlElementType) {
            val pyElType = type
            return pyElType.createElement(node)
        } else if (type is CwlStubElementType<*, *>) {
            return type.createElement(node)
        }
        return ASTWrapperPsiElement(node)
    }

    val FILE = IFileElementType(CwlLanguage)

    val myWhitespaceTokens = TokenSet.create(CwlTokenTypes.SPACE, CwlTokenTypes.TAB, CwlTokenTypes.FORMFEED)
    val myCommentTokens = TokenSet.create(CwlTokenTypes.END_OF_LINE_COMMENT)
//    val myStringLiteralTokens = TokenSet.orSet(PyTokenTypes.STRING_NODES, TokenSet.create(PyElementTypes.STRING_LITERAL_EXPRESSION))
}