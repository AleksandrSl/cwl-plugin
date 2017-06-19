package com.cwlplugin.psi

import com.intellij.lang.ASTNode
import com.intellij.openapi.diagnostic.Logger


/**
 * @author max, Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
object CwlPsiUtils {

    private val LOG = Logger.getInstance(CwlPsiUtils::class.java.name)

    fun <T : CwlElement> nodesToPsi(nodes: Array<ASTNode>, array: Array<T>): Array<T> {
        val psiElements = java.lang.reflect.Array.newInstance(array.javaClass.componentType, nodes.size) as Array<T>
        for (i in nodes.indices) {
            //noinspection unchecked
            psiElements[i] = nodes[i].psi as T
        }
        return psiElements
    }
}