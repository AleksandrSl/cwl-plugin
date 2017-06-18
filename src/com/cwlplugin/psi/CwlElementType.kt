package com.cwlplugin.psi

/**
 * Created by aleksandrsl on 06.05.17.
 */

import com.cwlplugin.CwlLanguage
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IElementType
import java.lang.reflect.Constructor

class CwlElementType(debugName: String) : IElementType(debugName, CwlLanguage) {

    private var myPsiElementClass: Class<out PsiElement>? = null
//    private val PARAMETER_TYPES = arrayOf<Class<*>>(ASTNode::class.java)
    private val myConstructor: Constructor<out PsiElement>? by lazy {
        myPsiElementClass?.getConstructor(ASTNode::class.java)
}


    constructor(debugName: String, psiElementClass: Class<out PsiElement>) : this(debugName) {
        myPsiElementClass = psiElementClass
    }

    fun createElement(node: ASTNode): PsiElement {
        if (myPsiElementClass == null) {
            throw IllegalStateException("Cannot create an element for ${node.elementType} without element class")
        }
        try {
            return myConstructor!!.newInstance(node)
        } catch (e: Exception) {
            throw IllegalStateException("No necessary constructor for ${node.elementType}", e)
        }

    }

    override fun toString(): String = "Cwl." + super.toString()
}