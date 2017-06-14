package com.cwlplugin.psi.stubs

import com.cwlplugin.psi.CwlRequirement
import com.cwlplugin.psi.CwlRequirements
import com.intellij.psi.stubs.StubElement

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
interface CwlRequirementsStub : StubElement<CwlRequirements> {

    fun getRequierements(): List<CwlRequirement>
}