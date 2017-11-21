package com.schibsted.spain.barista.internal.matcher

object TextMatchers {

    @JvmStatic
    fun withContainsText(text: String) = ContainsTextMatcher(text)
}