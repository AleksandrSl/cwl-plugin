package com.cwlplugin.completion

import com.cwlplugin.lexer.CwlToken
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.psi.PsiElement

/**
 * @author Aleksandr Slepchenkov [aslepchenkov@parseq.pro](mailto:aslepchenkov@parseq.pro)
 */
object KeywordCompletion {

    fun complete(position: PsiElement, prefix: String, isJvmModule: Boolean, consumer: (LookupElement) -> Unit) {
        if (!GENERAL_FILTER.isAcceptable(position, position)) return

        val parserFilter = buildFilter(position)
        for (keywordToken in ALL_KEYWORDS) {
            var keyword = keywordToken.value

            val nextKeyword = COMPOUND_KEYWORDS[keywordToken]
            var applicableAsCompound = false
            if (nextKeyword != null) {
                fun PsiElement.isSpace() = this is PsiWhiteSpace && '\n' !in getText()

                var next = position.nextLeaf { !(it.isSpace() || it.text == "$") }?.text
                if (next != null && next.startsWith("$")) {
                    next = next.substring(1)
                }
                if (next != nextKeyword.value)
                    keyword += " " + nextKeyword.value
                else
                    applicableAsCompound = true
            }

            if (keywordToken == DYNAMIC_KEYWORD && isJvmModule) continue // not supported for JVM

            // we use simple matching by prefix, not prefix matcher from completion
            if (!keyword.startsWith(prefix) && keywordToken !in KEYWORDS_TO_IGNORE_PREFIX) continue

            if (!parserFilter(keywordToken)) continue

            val constructText = KEYWORD_CONSTRUCTS[keywordToken]
            if (constructText != null && !applicableAsCompound) {
                val element = createKeywordConstructLookupElement(position.project, keyword, constructText)
                consumer(element)
            }
            else {
                var element = LookupElementBuilder.create(KeywordLookupObject(), keyword).bold()

                val isUseSiteAnnotationTarget = position.prevLeaf()?.node?.elementType == KtTokens.AT

                val insertHandler = when {
                    isUseSiteAnnotationTarget -> UseSiteAnnotationTargetInsertHandler

                    keyword in NO_SPACE_AFTER -> null

                    else -> SpaceAfterInsertHandler
                }

                element = element.withInsertHandler(insertHandler)

                if (isUseSiteAnnotationTarget) {
                    element = element.withPresentableText(keyword + ":")
                }

                consumer(element)
            }
        }
    }

    private fun buildFilter(position: PsiElement): (CwlToken) -> Boolean {
        var parent = position.parent
        var prevParent = position
        while (parent != null) {
            when (parent) {
                is KtBlockExpression -> {
                    var prefixText = "fun foo() { "
                    if (prevParent is KtExpression) {
                        // check that we are right after a try-expression without finally-block
                        val prevLeaf = prevParent.prevLeaf { it !is PsiWhiteSpace && it !is PsiComment && it !is PsiErrorElement }
                        if (prevLeaf?.node?.elementType == KtTokens.RBRACE) {
                            val blockParent = (prevLeaf?.parent as? KtBlockExpression)?.parent
                            when (blockParent) {
                                is KtTryExpression -> prefixText += "try {}\n"
                                is KtCatchClause -> prefixText += "try {} catch (e: E) {}\n"
                            }
                        }

                        if (prevLeaf?.getParentOfType<KtIfExpression>(strict = false) != null) {
                            prefixText += "if(true){}\n"
                        }

                        return buildFilterWithContext(prefixText, prevParent, position)
                    }
                    else {
                        val lastExpression = prevParent
                                .siblings(forward = false, withItself = false)
                                .firstIsInstanceOrNull<KtExpression>()
                        if (lastExpression != null) {
                            val contextAfterExpression = lastExpression
                                    .siblings(forward = true, withItself = false)
                                    .takeWhile { it != prevParent }
                                    .joinToString { it.text }
                            return buildFilterWithContext(prefixText + "x" + contextAfterExpression, prevParent, position)
                        }
                    }
                }

                is KtDeclarationWithInitializer -> {
                    val initializer = parent.initializer
                    if (prevParent == initializer) {
                        return buildFilterWithContext("val v = ", initializer!!, position)
                    }
                }

                is KtParameter -> {
                    val default = parent.defaultValue
                    if (prevParent == default) {
                        return buildFilterWithContext("val v = ", default!!, position)
                    }
                }

                is KtDeclaration -> {
                    val scope = parent.parent
                    when (scope) {
                        is KtClassOrObject -> {
                            if (parent is KtPrimaryConstructor) {
                                return buildFilterWithReducedContext("class X ", parent, position)
                            }
                            else {
                                return buildFilterWithReducedContext("class X { ", parent, position)
                            }
                        }

                        is KtFile -> return buildFilterWithReducedContext("", parent, position)
                    }
                }
            }


            prevParent = parent
            parent = parent.parent
        }

        return buildFilterWithReducedContext("", null, position)
    }
}