package com.example.qzm4sy.checktext;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> adapter;

    String[] string = new String[]{"Rahma", "Mason", "Tammy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.mylist);

        adapter = new ArrayAdapter<>(this, R.layout.list_item, string);

//        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, string);

        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listView.setDivider(ContextCompat.getDrawable(this, R.drawable.line_divider));
        listView.setAdapter(adapter);
    }
}
