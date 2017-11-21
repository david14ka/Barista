package com.schibsted.spain.barista.internal.matcher

import android.support.test.espresso.matcher.BoundedMatcher
import android.view.View
import android.widget.TextView
import org.hamcrest.Description

class ContainsTextMatcher(private val expected: String) : BoundedMatcher<View, TextView>(TextView::class.java) {
    override fun matchesSafely(textView: TextView): Boolean {
        return textView.text.toString().contains(expected)
    }

    override fun describeTo(description: Description) {
        description.appendText("with text: [$expected]")
    }

}