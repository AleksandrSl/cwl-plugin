package com.cwlplugin.psi

import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe
import kotlin.reflect.jvm.internal.impl.utils.StringsKt



/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class FqName {

    
    private val fqName: FqNameUnsafe

    // cache
    @Transient private var parent: FqName? = null

    constructor(fqName: String) {
        this.fqName = FqNameUnsafe(fqName, this)
    }

    constructor(fqName: FqNameUnsafe) {
        this.fqName = fqName
    }

    private constructor(fqName: FqNameUnsafe, parent: FqName) {
        this.fqName = fqName
        this.parent = parent
    }

    
    fun asString(): String {
        return fqName.asString()
    }

    
    fun toUnsafe(): FqNameUnsafe {
        return fqName
    }

    val isRoot: Boolean
        get() = fqName.isRoot

    
    fun parent(): FqName {
        if (parent != null) {
            return parent
        }

        if (isRoot) {
            throw IllegalStateException("root")
        }

        parent = FqName(fqName.parent())

        return parent
    }

    
    fun child(name: Name): FqName {
        return FqName(fqName.child(name), this)
    }

    
    fun shortName(): Name {
        return fqName.shortName()
    }

    
    fun shortNameOrSpecial(): Name {
        return fqName.shortNameOrSpecial()
    }

    
    fun pathSegments(): List<Name> {
        return fqName.pathSegments()
    }

    override fun toString(): String {
        return fqName.toString()
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o !is FqName) return false

        if (fqName != o.fqName) return false

        return true
    }

    override fun hashCode(): Int {
        return fqName.hashCode()
    }

    companion object {

        
        fun fromSegments(names: List<String>): FqName {
            return FqName(StringsKt.join(names, "."))
        }

        val ROOT = FqName("")

        
        fun topLevel(shortName: Name): FqName {
            return FqName(FqNameUnsafe.topLevel(shortName))
        }
    }
}