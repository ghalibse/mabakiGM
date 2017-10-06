package com.example.qzm4sy.futa;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
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

        calendarView.getChildAt(0).getAccessibilityClassName();

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {

                int i = calendarView.indexOfChild(view);

                String format = String.format("#:%d   month:%d   date: %d    year: %d", i, month, dayOfMonth, year);

                Log.d(TAG, "onSelectedDayChange: " + format );
            }

        });


    }
}
