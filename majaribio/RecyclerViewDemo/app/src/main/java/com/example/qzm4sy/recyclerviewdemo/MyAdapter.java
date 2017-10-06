package com.example.qzm4sy.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.TextView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    String[][] data = new String[][]{{"Mason", "Dines"},
            {"Rahma", "Said"},
            {"Tammy", "Dines"}};

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item, parent, false);

        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.checkedTextView.setText(String.format("  %s  %s  ", data[position][0], data[position][1]));

    }

    @Override
    public int getItemCount() {

        return data.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        CheckedTextView checkedTextView;

        public MyViewHolder(View itemView) {
            super(itemView);

            checkedTextView = (CheckedTextView) itemView.findViewById(R.id.text1);

        }
    }
}
