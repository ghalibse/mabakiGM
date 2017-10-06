package com.example.qzm4sy.callbackdemo;

import android.widget.TextView;

import java.util.Locale;


public class Division implements ComputeObj {
    @Override
    public void compute(TextView textView) {
        textView.setText(String.format(Locale.US, MESSAGE_STRING, "QUOTIENT", (30 / 20), Thread.currentThread()));
    }
}
