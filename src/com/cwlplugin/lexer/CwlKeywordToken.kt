package com.cwlplugin.lexer


/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
class CwlKeywordToken protected constructor(debugName: String, value: String, val isSoft: Boolean)
    : CwlSingleValueToken(debugName, value){

    object factory {

        /**
         * Generate keyword (identifier that has a keyword meaning in all possible contexts)
         */
        fun keyword(value: String): CwlKeywordToken {
            return keyword(value, value)
        }

        public fun keyword(debugName: String, value: String): CwlKeywordToken {
            return CwlKeywordToken(debugName, value, false)
        }

        /**
         * Generate soft keyword (identifier that has a keyword meaning only in some contexts)
         */
        fun softKeyword(value: String): CwlKeywordToken {
            return CwlKeywordToken(value, value, true)
        }
    }
}