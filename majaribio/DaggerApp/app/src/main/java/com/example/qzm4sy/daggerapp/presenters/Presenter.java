package com.example.qzm4sy.daggerapp.presenters;

import com.example.qzm4sy.daggerapp.data.Deserialiser;
import com.example.qzm4sy.daggerapp.data.Mpenzi;
import com.example.qzm4sy.daggerapp.data.Mwana;
import com.example.qzm4sy.daggerapp.data.Response;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Inject;

public class Presenter {

    private Mpenzi mpenzi;

    private Mwana mwana;

    private View view;


    public interface View {

        void setTextOnView(String str);
    }

    @Inject
    public Presenter(Mpenzi mpenzi,
                     Mwana mwana) {


        this.mpenzi = mpenzi;
        this.mwana = mwana;
    }


    public void setView(View view){

        this.view = view;
        setString();

    }

    public void setString(){

        view.setTextOnView(String.format("Mpenzi wangu ni : %s \nMwanangu ni : %s\nPresenter Wangu : %s",
                mpenzi.getJina(),
                mwana.getJina(),
                "I am a PRESENTER"));
    }
}
