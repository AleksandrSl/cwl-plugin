//package com.cwlplugin.psi
//
//import com.cwlplugin.CwlLanguage
//import com.intellij.lang.ASTNode
//import com.intellij.util.ArrayFactory
//import com.intellij.psi.stubs.IndexSink
//import com.intellij.psi.tree.IStubFileElementType
//import com.intellij.psi.stubs.IStubElementType
//import com.intellij.psi.tree.IElementType
//import com.intellij.psi.PsiElement
//import org.jetbrains.annotations.NonNls
//import com.intellij.psi.stubs.StubElement
//import com.intellij.util.ReflectionUtil
//import java.lang.reflect.Constructor
//import java.lang.reflect.Array
//
///**
// * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
// */
//abstract class CwlStubElementType<StubT : StubElement<*>, PsiT : CwlElementImplStub<*>>
//(debugName: String, psiClass: Class<PsiT>, stubClass: Class<*>) : IStubElementType<StubT, PsiT>(debugName, CwlLanguage) {
//
//
//    private val byNodeConstructor: Constructor<PsiT>
//
//    private val byStubConstructor: Constructor<PsiT>
//
//    private val emptyArray: kotlin.Array<PsiT>
//
//    val arrayFactory: ArrayFactory<PsiT>
//
//    init {
//
//        try {
//            byNodeConstructor = psiClass.getConstructor(ASTNode::class.java)
//            byStubConstructor = psiClass.getConstructor(stubClass)
//        } catch (e: NoSuchMethodException) {
//            throw RuntimeException("Stub element type declaration for ${psiClass.simpleName} is missing required constructors", e)
//        }
//
//        @SuppressWarnings("unchecked cast")
//        emptyArray = Array.newInstance(psiClass, 0) as kotlin.Array<PsiT>
//        arrayFactory = ArrayFactory { count ->
//            if (count == 0) {
//                return@ArrayFactory emptyArray
//            }
//            return@ArrayFactory Array.newInstance(psiClass, count) as kotlin.Array<PsiT>
//        }
//    }
//
//
//    fun createPsiFromAst(node: ASTNode): PsiT = ReflectionUtil.createInstance(byNodeConstructor, node)
//
//    override fun createPsi(stub: StubT): PsiT = ReflectionUtil.createInstance(byStubConstructor, stub)
//
//    override fun getExternalId(): String = "CWL.${toString()}"
//
//    override fun shouldCreateStub(node: ASTNode): Boolean {
//        val psi: PsiElement = node.psi
////        if (psi is CwlCommandLineTool) {
////            return true
////        }
////        if (psi is KtFunction) {
////            return !(psi as KtFunction).isLocal()
////        }
////        if (psi is KtProperty) {
////            return !(psi as KtProperty).isLocal()
////        }
//        return createStubDependingOnParent(node)
//    }
//
//    private fun createStubDependingOnParent(node: ASTNode): Boolean {
//        val parent = node.treeParent
//        val parentType = parent.elementType
//        if (parentType is IStubElementType<*, *>) {
//            return parentType.shouldCreateStub(parent)
//        }
//        if (parentType is IStubFileElementType<*>) {
//            return true
//        }
//        return false
//    }
//
//    override fun indexStub(stub: StubT,  sink: IndexSink) {
//        // do not force inheritors to implement this method
//    }
//}