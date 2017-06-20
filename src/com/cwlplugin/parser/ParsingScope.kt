package com.cwlplugin.parser

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class ParsingScope {

    private var myFunction = false
    private var myClass = false
    private var mySuite = false
    private var myAfterSemicolon = false
    private var myAsync = false


    fun withRequirements() : ParsingScope {
        return copy()
    }

    fun withFunction(async: Boolean): ParsingScope {
        val result = copy()
        result.myFunction = true
        result.myAsync = async
        return result
    }

    fun withClass(): ParsingScope {
        val result = copy()
        result.myClass = true
        return result
    }

    fun withSuite(): ParsingScope {
        val result = copy()
        result.mySuite = true
        result.myAsync = myAsync
        return result
    }

    fun isFunction(): Boolean {
        return myFunction
    }

    fun isClass(): Boolean {
        return myClass
    }

    fun isSuite(): Boolean {
        return mySuite
    }

    fun isAsync(): Boolean {
        return myAsync
    }

    fun isAfterSemicolon(): Boolean {
        return myAfterSemicolon
    }

    fun setAfterSemicolon(value: Boolean) {
        myAfterSemicolon = value
    }

    protected fun createInstance(): ParsingScope {
        return ParsingScope()
    }

    protected fun copy(): ParsingScope {
        val result = createInstance()
        result.myFunction = myFunction
        result.myClass = myClass
        result.mySuite = mySuite
        return result
    }
}