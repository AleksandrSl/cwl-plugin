package com.cwlplugin.psi.impl

import com.intellij.lang.ASTNode
import com.intellij.psi.stubs.StubElement
import psi.impl.CwlBaseElementImpl

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
open class CwlElementImpl(astNode: ASTNode): CwlBaseElementImpl<StubElement<*>>(astNode)
