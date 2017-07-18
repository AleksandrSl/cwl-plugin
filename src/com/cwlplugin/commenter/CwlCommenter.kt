package com.cwlplugin.commenter

import com.cwlplugin.parser.CwlTokenTypes
import com.intellij.codeInsight.generation.IndentedCommenter
import com.intellij.lang.CodeDocumentationAwareCommenter
import com.intellij.psi.PsiComment
import com.intellij.psi.tree.IElementType

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlCommenter : CodeDocumentationAwareCommenter, IndentedCommenter {

    override fun getLineCommentPrefix(): String? = "# "

    override fun getDocumentationCommentTokenType(): IElementType? = null

    override fun getCommentedBlockCommentPrefix(): String? = null

    override fun getCommentedBlockCommentSuffix(): String? = null

    override fun getLineCommentTokenType(): IElementType? = CwlTokenTypes.END_OF_LINE_COMMENT

    override fun getBlockCommentTokenType(): IElementType? = null

    override fun getBlockCommentPrefix(): String? = null

    override fun getBlockCommentSuffix(): String? = null

    override fun getDocumentationCommentLinePrefix(): String? = null

    override fun getDocumentationCommentPrefix(): String? = null

    override fun getDocumentationCommentSuffix(): String? = null

    override fun forceIndentedLineComment(): Boolean? = true

    override fun isDocumentationComment(p0: PsiComment?): Boolean = false
}