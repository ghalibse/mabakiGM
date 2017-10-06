package com.example.qzm4sy.nestedscrollingapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv1 = findViewById(R.id.rv_1);
        RecyclerView rv2 = findViewById(R.id.rv_2);
        RecyclerView rv3 = findViewById(R.id.rv_3);

        setUpRecyclerView(rv1);
        setUpRecyclerView(rv2);
        setUpRecyclerView(rv3);
    }


    void setUpRecyclerView(RecyclerView recyclerView) {
        int size = 50;
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) list.add(i);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(list));
    }

    static class Adapter extends RecyclerView.Adapter<MainActivity.ViewHolder> {

        private final List list;

        Adapter(List list) {
            this.list = list;
        }

        @Override
        public MainActivity.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Context context = parent.getContext();
            View itemView = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false);
            return new ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MainActivity.ViewHolder holder, int position) {
            holder.bind(list.get(position));
        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(android.R.id.text1);
        }

        void bind(Object object) {
            textView.setText(String.valueOf(object));
        }
    }
}
