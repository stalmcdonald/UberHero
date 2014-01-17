package com.cm.uberhero;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class UHTextView extends TextView {

    public UHTextView(Context context) {
            super(context);
            setFont();
    }

    public UHTextView(Context context, AttributeSet attrs) {
            super(context, attrs);
            setFont();
    }

    public UHTextView(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            setFont();
    }

    private void setFont() {
            Typeface font = Typeface.createFromAsset(getContext().getAssets(),
                            "fonts/Neou-Bold.ttf");
            setTypeface(font, Typeface.NORMAL);
    }
}