package com.example.qzm4sy.daggerapp.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.example.qzm4sy.daggerapp.R;

public class FontTextView extends android.support.v7.widget.AppCompatTextView {

    public FontTextView(final Context context){
        this(context, null);
    }

    public FontTextView(final Context context, final AttributeSet attrs){
        this(context, attrs, 0);
    }

    public FontTextView(final Context context, final AttributeSet attrs, final int defStyleAttr){
        super(context, attrs, defStyleAttr);

        TypedArray properties = context.getTheme().obtainStyledAttributes(attrs, R.styleable.FontTextView, 0, 0);
//        final int typefaceValue = properties.getInteger(R.styleable.FontTextView_typeface, 0);
        properties.recycle();

        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "Roboto-Bold.ttf");
        setTypeface(typeface);
    }
}