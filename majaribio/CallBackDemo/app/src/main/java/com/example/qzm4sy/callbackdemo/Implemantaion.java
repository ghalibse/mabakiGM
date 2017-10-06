package com.example.qzm4sy.callbackdemo;

import android.widget.TextView;

import java.util.Locale;

public class Implemantaion implements Compute {


    public static String MESSAGE_STRING = "%s : %d    Thread : %s";

    TextView textView;

    public Implemantaion(TextView textView) {

        this.textView = textView;
    }

    @Override
    public void add() {

        textView.post(new Runnable() {
            @Override
            public void run() {
                textView.setText(String.format(Locale.US, MESSAGE_STRING, "SUM", (30 + 20), Thread.currentThread()));
            }
        });

    }

    @Override
    public void substract() {

        textView.setText(String.format(Locale.US, MESSAGE_STRING, "DIFFERENCE", (30 - 20), Thread.currentThread()));

    }

    @Override
    public int multiply() {

//        textView.setText(String.format(Locale.US, MESSAGE_STRING, "PRODUCT", (30 * 20), Thread.currentThread()));

        return (30 * 20);
    }

    @Override
    public void devide() {

        textView.setText(String.format(Locale.US, MESSAGE_STRING, "QUOTIENT", (30 / 20), Thread.currentThread()));

    }
}
