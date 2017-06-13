package com.cwlplugin.parser

import com.cwlplugin.CwlLanguage
import com.cwlplugin.lexer.CwlLexerAdapter
import com.cwlplugin.lexer.CwlLexerTypes
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

    companion object {

        val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS = TokenSet.create(CwlLexerTypes.COMMENT)
        val FILE = IFileElementType(CwlLanguage)

        val KEYWORDS: TokenSet = TokenSet.create(
                CwlTypes.ANY,
                CwlTypes.ARRAY_TYPE,
                CwlTypes.BASECOMMAND,
                CwlTypes.BASENAME,
                CwlTypes.BOOLEAN_TYPE,
                CwlTypes.CHECKSUM,
                CwlTypes.CLASS,
                CwlTypes.COLON,
                CwlTypes.COMMAND_LINE_TOOL,
                CwlTypes.CONTENTS,
                CwlTypes.CORES_MAX,
                CwlTypes.CORES_MIN,
                CwlTypes.CWL_VERSION,
                CwlTypes.DEFAULT,
                CwlTypes.DIRECTORY_TYPE,
                CwlTypes.DIRNAME,
                CwlTypes.DOC,
                CwlTypes.DOCKER_FILE,
                CwlTypes.DOCKER_IMAGE_ID,
                CwlTypes.DOCKER_IMPORT,
                CwlTypes.DOCKER_LOAD,
                CwlTypes.DOCKER_OUTPUT_DIRECTORY,
                CwlTypes.DOCKER_PULL,
                CwlTypes.DOCKER_REQUIREMENT,
                CwlTypes.DOUBLE_TYPE,
                CwlTypes.ENTRY,
                CwlTypes.ENTRYNAME,
                CwlTypes.ENUM_TYPE,
                CwlTypes.ENV_DEF,
                CwlTypes.ENV_NAME,
                CwlTypes.ENV_VALUE,
                CwlTypes.ENV_VAR_REQUIREMENT,
                CwlTypes.EXPRESSION_TOOL,
                CwlTypes.FILE_TYPE,
                CwlTypes.FLOAT_TYPE,
                CwlTypes.FORMAT,
                CwlTypes.GLOB,
                CwlTypes.HINTS,
                CwlTypes.ID,
                CwlTypes.INITIAL_WORKDIR_REQUIREMENT,
                CwlTypes.INLINE_JAVASCRIPT_REQUIREMENT,
                CwlTypes.INPUTS,
                CwlTypes.INPUT_BINDING,
                CwlTypes.INT_TYPE,
                CwlTypes.ITEM_SEPARATOR,
                CwlTypes.LABEL,
                CwlTypes.LISTING,
                CwlTypes.LOAD_CONTENTS,
                CwlTypes.LOCATION,
                CwlTypes.LONG_TYPE,
                CwlTypes.NAME,
                CwlTypes.NAMEEXT,
                CwlTypes.NAMEROOT,
                CwlTypes.NULL_TYPE,
                CwlTypes.OUTDIR_MAX,
                CwlTypes.OUTDIR_MIN,
                CwlTypes.OUTPUTS,
                CwlTypes.OUTPUT_EVAL,
                CwlTypes.PACKAGE,
                CwlTypes.PATH,
                CwlTypes.PERMANENT_FAIL_CODES,
                CwlTypes.POSITION,
                CwlTypes.PREFIX,
                CwlTypes.RAM_MAX,
                CwlTypes.RAM_MIN,
                CwlTypes.RECORD,
                CwlTypes.REQUIREMENTS,
                CwlTypes.RESOURCE_REQUIREMENT,
                CwlTypes.SCHEMA_DEF_REQUIREMENT,
                CwlTypes.SECONDARY_FILES,
                CwlTypes.SEPARATE,
                CwlTypes.SHELL_COMMAND_REQUIREMENT,
                CwlTypes.SHELL_QUOTE,
                CwlTypes.SIZE,
                CwlTypes.SOFTWARE_REQUIREMENT,
                CwlTypes.SPECS,
                CwlTypes.STREAMABLE,
                CwlTypes.STRING,
                CwlTypes.STRING_TYPE,
                CwlTypes.SUCCESS_CODES,
                CwlTypes.TEMPORARY_FAIL_CODES,
                CwlTypes.TMPDIR_MAX,
                CwlTypes.TMPDIR_MIN,
                CwlTypes.TYPE,
                CwlTypes.VALUE_FROM,
                CwlTypes.VERSION,
                CwlTypes.WORKFLOW,
                CwlTypes.WRITABLE)
    }
}