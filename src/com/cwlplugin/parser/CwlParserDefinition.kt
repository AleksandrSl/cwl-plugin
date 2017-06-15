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
                CwlTypes.ANY_TYPE_TK,
                CwlTypes.ARRAY_TYPE_TK,
                CwlTypes.BASECOMMAND_TK,
                CwlTypes.BASENAME_TK,
                CwlTypes.BOOLEAN_TYPE_TK,
                CwlTypes.CHECKSUM_TK,
                CwlTypes.CLASS_TK,
                CwlTypes.COMMAND_LINE_TOOL_TK,
                CwlTypes.CONTENTS_TK,
                CwlTypes.CORES_MAX_TK,
                CwlTypes.CORES_MIN_TK,
                CwlTypes.CWL_VERSION_TK,
                CwlTypes.DEFAULT_TK,
                CwlTypes.DIRECTORY_TYPE_TK,
                CwlTypes.DIRNAME_TK,
                CwlTypes.DOC_TK,
                CwlTypes.DOCKER_FILE_TK,
                CwlTypes.DOCKER_IMAGE_ID_TK,
                CwlTypes.DOCKER_IMPORT_TK,
                CwlTypes.DOCKER_LOAD_TK,
                CwlTypes.DOCKER_OUTPUT_DIRECTORY_TK,
                CwlTypes.DOCKER_PULL_TK,
                CwlTypes.DOCKER_REQUIREMENT_TK,
                CwlTypes.DOUBLE_TYPE_TK,
                CwlTypes.ENTRY_TK,
                CwlTypes.ENTRYNAME_TK,
                CwlTypes.ENUM_TYPE_TK,
                CwlTypes.ENV_DEF_TK,
                CwlTypes.ENV_NAME_TK,
                CwlTypes.ENV_VALUE_TK,
                CwlTypes.ENV_VAR_REQUIREMENT_TK,
                CwlTypes.EXPRESSION_TOOL_TK,
                CwlTypes.FILE_TYPE_TK,
                CwlTypes.FLOAT_TYPE_TK,
                CwlTypes.FORMAT_TK,
                CwlTypes.GLOB_TK,
                CwlTypes.HINTS_TK,
                CwlTypes.ID_TK,
                CwlTypes.INITIAL_WORKDIR_REQUIREMENT_TK,
                CwlTypes.INLINE_JAVASCRIPT_REQUIREMENT_TK,
                CwlTypes.INPUTS_TK,
                CwlTypes.INPUT_BINDING_TK,
                CwlTypes.INT_TYPE_TK,
                CwlTypes.ITEM_SEPARATOR_TK,
                CwlTypes.LABEL_TK,
                CwlTypes.LISTING_TK,
                CwlTypes.LOAD_CONTENTS_TK,
                CwlTypes.LOCATION_TK,
                CwlTypes.LONG_TYPE_TK,
                CwlTypes.NAME_TK,
                CwlTypes.NAMEEXT_TK,
                CwlTypes.NAMEROOT_TK,
                CwlTypes.NULL_TYPE_TK,
                CwlTypes.OUTDIR_MAX_TK,
                CwlTypes.OUTDIR_MIN_TK,
                CwlTypes.OUTPUTS_TK,
                CwlTypes.OUTPUT_EVAL_TK,
                CwlTypes.PACKAGE_TK,
                CwlTypes.PATH_TK,
                CwlTypes.PERMANENT_FAIL_CODES_TK,
                CwlTypes.POSITION_TK,
                CwlTypes.PREFIX_TK,
                CwlTypes.RAM_MAX_TK,
                CwlTypes.RAM_MIN_TK,
                CwlTypes.RECORD_TK,
                CwlTypes.REQUIREMENTS_TK,
                CwlTypes.RESOURCE_REQUIREMENT_TK,
                CwlTypes.SCHEMA_DEF_REQUIREMENT_TK,
                CwlTypes.SECONDARY_FILES_TK,
                CwlTypes.SEPARATE_TK,
                CwlTypes.SHELL_COMMAND_REQUIREMENT_TK,
                CwlTypes.SHELL_QUOTE_TK,
                CwlTypes.SIZE_TK,
                CwlTypes.SOFTWARE_REQUIREMENT_TK,
                CwlTypes.SPECS_TK,
                CwlTypes.STREAMABLE_TK,
                CwlTypes.STRING_TK,
                CwlTypes.STRING_TYPE_TK,
                CwlTypes.SUCCESS_CODES_TK,
                CwlTypes.TEMPORARY_FAIL_CODES_TK,
                CwlTypes.TMPDIR_MAX_TK,
                CwlTypes.TMPDIR_MIN_TK,
                CwlTypes.TYPE_TK,
                CwlTypes.VALUE_FROM_TK,
                CwlTypes.VERSION_TK,
                CwlTypes.WORKFLOW_TK,
                CwlTypes.WRITABLE_TK)
    }
}