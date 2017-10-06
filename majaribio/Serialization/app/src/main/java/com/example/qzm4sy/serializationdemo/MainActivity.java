package com.example.qzm4sy.serializationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


import com.activeandroid.ActiveAndroid;


import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "libuTAG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActiveAndroid.initialize(getApplication());

         MyPojo myPojo = new MyPojo("Mason", 9193084425l);

        CustomSerializer customSerializer = new CustomSerializer();

        MyPojo deserialize = (MyPojo)customSerializer.deserialize(myPojo);

        Log.d(TAG, "onCreate: " + deserialize);

        myPojo.save();

        List<MyPojo> mydata = MyPojo.getAllData();

        Log.d(TAG, "onCreate: ");

    }
}
