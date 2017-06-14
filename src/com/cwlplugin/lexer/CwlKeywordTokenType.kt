package com.cwlplugin.lexer


/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlKeywordTokenType protected constructor(debugName: String, value: String, val isSoft: Boolean)
    : CwlSingleValueTokenType(debugName, value){

    object factory {

        /**
         * Generate keyword (identifier that has a keyword meaning in all possible contexts)
         */
        fun keyword(value: String): CwlKeywordTokenType {
            return keyword(value, value)
        }

        public fun keyword(debugName: String, value: String): CwlKeywordTokenType {
            return CwlKeywordTokenType(debugName, value, false)
        }

        /**
         * Generate soft keyword (identifier that has a keyword meaning only in some contexts)
         */
        fun softKeyword(value: String): CwlKeywordTokenType {
            return CwlKeywordTokenType(value, value, true)
        }
    }
}