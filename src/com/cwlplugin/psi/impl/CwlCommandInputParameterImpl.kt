package com.cwlplugin.psi.impl

import com.cwlplugin.psi.CwlCommandInputParameter
import com.intellij.lang.ASTNode

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlCommandInputParameterImpl(node: ASTNode): CwlElementImpl(node), CwlCommandInputParameter