package com.rent.renters.mylibrary.widgets


import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet

import androidx.appcompat.widget.AppCompatButton


class CustomButtonRegular : AppCompatButton {
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context) : super(context) {
        init()
    }

    private fun init() {
        if (!isInEditMode) {
            val tf = Typeface.createFromAsset(context.assets, "fonts/Sofia Pro Regular.otf")
            typeface = tf
        }
    }
}
