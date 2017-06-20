package com.cwlplugin

import com.intellij.CommonBundle
import com.intellij.reference.SoftReference
import org.jetbrains.annotations.PropertyKey
import java.lang.ref.Reference
import java.util.*

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
object CwlBundle {


    fun message(@PropertyKey(resourceBundle = BUNDLE) key: String, vararg params: Any): String {
        return CommonBundle.message(getBundle(), key, *params)
    }

    private const val BUNDLE = "com.cwlplugin.CwlBundle"
    private var thisBundle: Reference<ResourceBundle> ?=null


    private fun getBundle(): ResourceBundle {
        var bundle = SoftReference.dereference<ResourceBundle>(thisBundle)
        if (bundle == null) {
            bundle = ResourceBundle.getBundle(BUNDLE)
            thisBundle = SoftReference<ResourceBundle>(bundle)
        }
        return bundle!!
    }

}