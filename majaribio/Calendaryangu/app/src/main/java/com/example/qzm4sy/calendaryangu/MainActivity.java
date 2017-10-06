package com.example.qzm4sy.calendaryangu;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CalenderViewTAG_";

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CalendarView calendarView = (CalendarView) findViewById(R.id.cview);

        calendarView.setMaxDate(System.currentTimeMillis());
        calendarView.setMinDate(1493611200000L);

        ViewGroup childAt = (ViewGroup)calendarView.getChildAt(0);

        ViewPager childAt1 = (ViewPager)childAt.getChildAt(0);

    }
}
