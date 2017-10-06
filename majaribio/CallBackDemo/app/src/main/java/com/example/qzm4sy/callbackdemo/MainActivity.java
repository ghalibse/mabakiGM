package com.example.qzm4sy.callbackdemo;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

import static com.example.qzm4sy.callbackdemo.Implemantaion.MESSAGE_STRING;

public class MainActivity extends AppCompatActivity {

    TextView viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewById = (TextView)findViewById(R.id.my_text);

//        funcImplementation();

//        objectImplementation();

/*

        Compute compute = new Compute() {

            @Override
            public void add() {
                viewById.setText(String.format(Locale.US, MESSAGE_STRING, "SUM", (30 + 20), Thread.currentThread()));
            }

            @Override
            public void substract() {

            }

            @Override
            public void multiply() {

                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        viewById.setText(String.format(Locale.US, MESSAGE_STRING, "PRODUCT", (30 * 20), Thread.currentThread()));
                    }
                });

                thread.start();

            }

            @Override
            public void devide() {

            }
        };
*/

//        compute.multiply();
/*

        ComputeObj computeObj = new ComputeObj() {
            @Override
            public void compute(TextView textView) {
                textView.setText(String.format(Locale.US, MESSAGE_STRING, "PRODthgtfhUCT", (30 * 20), Thread.currentThread()));
            }
        };

        computeObj.compute(viewById);*/


        funcImplementation(new Implemantaion(viewById));

    }

    public void funcImplementation(final Compute compute){

        final Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {

                viewById.setText(String.format(Locale.US, MESSAGE_STRING, "PRODUCT", msg.arg1, Thread.currentThread()));            }
        };



        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                final Message message = handler.obtainMessage();

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        message.arg1 = compute.multiply();
                    }
                });

            }
        });

        thread.start();

    }

    public void objectImplementation(){

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                ComputeObj computeObj = new Division();

                computeObj.compute(viewById);
            }
        });

        thread.start();
    }

}
