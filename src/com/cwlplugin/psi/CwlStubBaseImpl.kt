package com.cwlplugin.psi

import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.StubBase
import com.intellij.psi.stubs.StubElement
import java.lang.reflect.Method
import com.intellij.openapi.diagnostic.Logger


val STUB_TO_STRING_PREFIX = "CwlStub$"
/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
open class CwlStubBaseImpl<T : CwlElementImplStub<*>>(parent: StubElement<*>?, elementType: IStubElementType<*, *>) : StubBase<T>(parent, elementType) {

    override fun toString(): String {
        val stubInterface = this::class.java.interfaces.filter { it.name.contains("Stub") }.single()
        val propertiesValues = renderPropertyValues(stubInterface)
        if (propertiesValues.isEmpty()) {
            return "$STUB_TO_STRING_PREFIX$stubType"
        }
        val properties = propertiesValues.joinToString(separator = ", ", prefix = "[", postfix = "]")
        return "$STUB_TO_STRING_PREFIX$stubType$properties"
    }

    private fun renderPropertyValues(stubInterface: Class<out Any?>): List<String> {
        return collectProperties(stubInterface).mapNotNull { property -> renderProperty(property) }.sorted()
    }

    private fun collectProperties(stubInterface: Class<*>): Collection<Method> {
        val result = ArrayList<Method>()
        result.addAll(stubInterface.declaredMethods.filter { it.parameterTypes!!.isEmpty() })
        stubInterface.interfaces.filter { it in BASE_STUB_INTERFACES }.forEach{
            result.addAll(collectProperties(it))
        }
        return result
    }

    private fun renderProperty(property: Method): String? {
        return try {
            val value = property.invoke(this)
            val name = getPropertyName(property)
            "$name=$value"
        }
        catch (e: Exception) {
            LOGGER.error(e)
            null
        }
    }

    private fun getPropertyName(method: Method): String {
        val methodName = method.name!!
        if (methodName.startsWith("get")) {
            return methodName.substring(3).decapitalize()
        }
        return methodName
    }

    companion object {
        private val LOGGER: Logger = Logger.getInstance(CwlStubBaseImpl::class.java)

        private val BASE_STUB_INTERFACES = listOf(CwlCommandLineToolStub::class.java)
    }
}