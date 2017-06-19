package psi.impl

import com.cwlplugin.CwlFileType
import com.cwlplugin.CwlLanguage
import com.cwlplugin.parser.CwlElementVisitor
import com.cwlplugin.psi.CwlElement
import com.cwlplugin.psi.CwlPsiUtils
import com.intellij.extapi.psi.StubBasedPsiElementBase
import com.intellij.openapi.util.text.StringUtil.trimEnd
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementVisitor
import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.StubElement
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

/**
 * @author max, Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
open class CwlBaseElementImpl<T: StubElement<*>>(
        private val stub: T?,
        nodeType: IStubElementType<*, *>?,
        node: com.intellij.lang.ASTNode? = null
) : StubBasedPsiElementBase<T>(stub, nodeType, node), CwlElement {

    constructor(node: com.intellij.lang.ASTNode): this(null, null, node)

    override fun getStub(): T? = stub

    override fun getLanguage(): CwlLanguage = CwlFileType.language as CwlLanguage

    override fun toString(): String {
        var className = javaClass.name
        val pos = className.lastIndexOf('.')
        if (pos >= 0) {
            className = className.substring(pos + 1)
        }
        className = trimEnd(className, "Impl")
        return className
    }

    override fun getNavigationElement(): PsiElement = super.getNavigationElement()

    override fun accept(visitor: PsiElementVisitor) {
        if (visitor is CwlElementVisitor) {
            acceptCwlVisitor(visitor)
        } else {
            super.accept(visitor)
        }
    }

    protected open fun acceptCwlVisitor(cwlVisitor: CwlElementVisitor) {
        cwlVisitor.visitCwlElement(this)
    }

    protected fun <T : CwlElement> childrenToPsi(filterSet: TokenSet, array: Array<T>): Array<T> {
        val nodes = node.getChildren(filterSet)
        return CwlPsiUtils.nodesToPsi(nodes, array)
    }

    protected fun <T : CwlElement> childToPsi(filterSet: TokenSet, index: Int): T? {
        val nodes = node.getChildren(filterSet)
        if (nodes.size <= index) {
            return null
        }
        return nodes[index].psi as T?
    }

    protected fun <T : CwlElement> childToPsi(elType: IElementType): T? {
        val node = node.findChildByType(elType) ?: return null
        return node.psi as T?
    }

    protected fun <T : CwlElement> childToPsi(elTypes: TokenSet): T? {
        val node = node.findChildByType(elTypes)
        return if (node != null) node.psi as T else null
    }

    protected fun <T : CwlElement> childToPsiNotNull(filterSet: TokenSet, index: Int): T =
            childToPsi<CwlElement>(filterSet, index) as T?
                    ?: throw RuntimeException("child must not be null: expression text $text")

    protected fun <T : CwlElement> childToPsiNotNull(elType: IElementType): T? =
            (childToPsi<CwlElement>(elType) as T?) ?: throw RuntimeException("child must not be null; expression text " + text)
//
//
//    /**
//     * Overrides the findReferenceAt() logic in order to provide a resolve context with origin file for returned references.
//     * The findReferenceAt() is usually invoked from UI operations, and it helps to be able to do deeper analysis in the
//     * current file for such operations.
//
//     * @param offset the offset to find the reference at
//     * *
//     * @return the reference or null.
//     */
//    override fun findReferenceAt(offset: Int): PsiReference? {
//        var offset = offset
//        // copy/paste from SharedPsiElementImplUtil
//        var element = findElementAt(offset)
//        if (element == null || element is OuterLanguageElement) return null
//        offset = getTextRange().getStartOffset() + offset - element!!.getTextRange().getStartOffset()
//
//        val referencesList = ArrayList<PsiReference>()
//        val file = element!!.getContainingFile()
//        val resolveContext = if (file != null)
//            CwlResolveContext.defaultContext().withTypeEvalContext(TypeEvalContext.codeAnalysis(file!!.getProject(), file))
//        else
//            CwlResolveContext.defaultContext()
//        while (element != null) {
//            addReferences(offset, element, referencesList, resolveContext)
//            offset = element!!.getStartOffsetInParent() + offset
//            if (element is PsiFile) break
//            element = element!!.getParent()
//        }
//
//        if (referencesList.isEmpty()) return null
//        if (referencesList.size == 1) return referencesList[0]
//        return PsiMultiReference(referencesList.toTypedArray(),
//                referencesList[referencesList.size - 1].element)
//    }
//
//    private fun addReferences(offset: Int, element: PsiElement, outReferences: MutableCollection<PsiReference>,
//                              resolveContext: CwlResolveContext) {
//        val references: Array<PsiReference>
//        if (element is CwlReferenceOwner) {
//            val reference = (element as CwlReferenceOwner).getReference(resolveContext)
//            references = if (reference == null) PsiReference.EMPTY_ARRAY else arrayOf<PsiReference>(reference)
//        } else {
//            references = element.references
//        }
//        for (reference in references) {
//            for (range in ReferenceRange.getRanges(reference)) {
//                assert(range != null) { reference }
//                if (range!!.containsOffset(offset)) {
//                    outReferences.add(reference)
//                }
//            }
//        }
//    }
}