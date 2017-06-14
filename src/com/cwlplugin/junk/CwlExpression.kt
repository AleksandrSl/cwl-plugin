//package com.cwlplugin.junk
//
///**
// * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
// */
//public interface CwlExpression : CwlElement {
//    val EMPTY_ARRAY: Array<CwlExpression>
//        get() = emptyArray()
//
////    val ARRAY_FACTORY: Array<CwlExpression>
////            get() =  count -> if (count == 0) EMPTY_ARRAY else arrayOfNulls<CwlExpression>(count)
//
//    override fun <R, D> accept(visitor: com.cwlplugin.psi.CwlCustomVisitor<R, D>, data: D): R
//}