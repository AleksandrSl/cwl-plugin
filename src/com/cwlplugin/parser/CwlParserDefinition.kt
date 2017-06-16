package com.cwlplugin.parser

import com.cwlplugin.CwlLanguage
import com.cwlplugin.lexer.CwlLexerAdapter
import com.cwlplugin.lexer.CwlLexerTypes
import com.cwlplugin.parser.CwlTokenTypes.COMMENTS
import com.cwlplugin.parser.CwlTokenTypes.WHITE_SPACES
import com.cwlplugin.psi.CwlTypes
import com.cwlplugin.psi.CwlFile
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet


class CwlParserDefinition : ParserDefinition {

    override fun createLexer(project: Project): Lexer = CwlLexerAdapter()

    override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES

    override fun getCommentTokens(): TokenSet = COMMENTS

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY

    override fun createParser(project: Project): PsiParser = CwlParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return CwlFile(viewProvider)
    }

    override fun spaceExistanceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements =
            ParserDefinition.SpaceRequirements.MAY

    override fun createElement(node: ASTNode): PsiElement = CwlTypes.Factory.createElement(node)

    val FILE = IFileElementType(CwlLanguage)

}