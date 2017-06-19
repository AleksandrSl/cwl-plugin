package com.cwlplugin.parser

import com.intellij.lang.ASTNode
import com.intellij.psi.stubs.StubElement

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
open class CwlElementImpl(astNode: ASTNode): CwlBaseElementImpl<StubElement<*>>(astNode)
