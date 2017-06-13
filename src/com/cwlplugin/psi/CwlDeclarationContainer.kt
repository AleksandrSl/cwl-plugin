package com.cwlplugin.psi

/**
 * From Kotlin plugin
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
interface CwlDeclarationContainer {

    fun  getDeclarations(): List<CwlDeclaration>
}