package com.cwlplugin.psi.impl

import com.cwlplugin.psi.CwlGlob
import com.cwlplugin.psi.CwlOutputBinding
import com.cwlplugin.psi.CwlOutputEval
import com.intellij.lang.ASTNode

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlOutputBindingImpl(node: ASTNode) : CwlElementImpl(node), CwlOutputBinding

// InputBindingFields
class CwlOutputEvalImpl(node: ASTNode) : CwlElementImpl(node), CwlOutputEval

class CwlGlobImpl(node: ASTNode) : CwlElementImpl(node), CwlGlob