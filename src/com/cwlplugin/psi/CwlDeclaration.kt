package com.cwlplugin.psi

import com.intellij.util.ArrayFactory

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
public interface CwlDeclaration : CwlExpression {

    val EMPTY_ARRAY: Array<CwlDeclaration>
        get() = emptyArray()

//    val ARRAY_FACTORY: Array<CwlDeclaration>
//            get() =  count -> if (count == 0) EMPTY_ARRAY else arrayOfNulls<CwlDeclaration>(count)
}