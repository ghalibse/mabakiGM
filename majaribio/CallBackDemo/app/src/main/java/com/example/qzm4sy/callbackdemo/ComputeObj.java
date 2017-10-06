package com.example.qzm4sy.callbackdemo;


import android.widget.TextView;

public interface ComputeObj {

    String MESSAGE_STRING = "%s : %d    Thread : %s";

    void compute(TextView textView);
}
