package com.cwlplugin.psi.impl

import com.cwlplugin.psi.CwlCommandOutputParameter
import com.intellij.lang.ASTNode

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlCommandOutputParameterImpl(node: ASTNode) : CwlElementImpl(node), CwlCommandOutputParameter