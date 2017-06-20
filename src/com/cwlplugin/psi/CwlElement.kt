package com.cwlplugin.psi

import com.intellij.psi.NavigatablePsiElement

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
interface CwlElement: NavigatablePsiElement {

    companion object {
        /**
         * An empty array to return cheaply without allocating it anew.
         */
        val EMPTY_ARRAY = arrayOfNulls<CwlElement>(0)
    }
}