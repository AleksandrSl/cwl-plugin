package com.cwlplugin.psi

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementVisitor
import org.apache.batik.ext.awt.image.ARGBChannel.R



/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlCustomVisitor<R, D> : PsiElementVisitor() {

    fun visitCwlElement(element: CwlElement, data: D?): R? {
        visitElement(element as PsiElement)
        return null
    }

    fun visitCwlRequirements(requirements: CwlRequirements, data: D?): R? = visitCwlElement(requirements, data)

}