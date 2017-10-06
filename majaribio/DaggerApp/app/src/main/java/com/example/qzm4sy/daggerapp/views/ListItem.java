package com.example.qzm4sy.daggerapp.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.example.qzm4sy.daggerapp.R;
import com.example.qzm4sy.daggerapp.presenters.Presenter;

import javax.inject.Inject;

import static com.example.qzm4sy.daggerapp.views.MainActivity.actComponent;


public class ListItem extends FrameLayout implements Presenter.View{


    @Inject
    Presenter presenter;

    FontTextView mpenziTextView;
    FontTextView mwanaTextView;

    private Context context;

    public ListItem(Context context) {
        this(context, null);
    }

    public ListItem(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ListItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);

        this.context = context;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        LayoutInflater.from(context).inflate(R.layout.list_item, this);

         mpenziTextView = (FontTextView) findViewById(R.id.mpenzi);
        mwanaTextView = (FontTextView) findViewById(R.id.mwana);

        actComponent.inject(this);

        presenter.setView(this);

    }

    @Override
    public void setTextOnView(String str) {
         mpenziTextView.setText(str.substring(0, 10));

         mwanaTextView.setText(str.substring(10, 17));
    }

}
