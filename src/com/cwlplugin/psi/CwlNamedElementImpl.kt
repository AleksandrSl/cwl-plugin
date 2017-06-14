package com.cwlplugin.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
abstract class CwlNamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), CwlNamedElement