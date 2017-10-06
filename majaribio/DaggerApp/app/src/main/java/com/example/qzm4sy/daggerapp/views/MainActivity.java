package com.example.qzm4sy.daggerapp.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.qzm4sy.daggerapp.LibuApp;
import com.example.qzm4sy.daggerapp.R;
import com.example.qzm4sy.daggerapp.components.ActComponent;
import com.example.qzm4sy.daggerapp.components.AppComponent;
import com.example.qzm4sy.daggerapp.components.DaggerActComponent;
import com.example.qzm4sy.daggerapp.data.Mwana;
import com.example.qzm4sy.daggerapp.modules.MwanaModule;
import com.example.qzm4sy.daggerapp.presenters.Presenter;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {




//https://github.com/TwistedEquations/dagger2-tutorial

    AppComponent appComponent;
    public static ActComponent actComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       appComponent = LibuApp.get(this).getAppComponent();
/*
        Kabla ya kuchanganya
        actComponent = DaggerActComponent.builder()
                .mwanaModule(new MwanaModule("MASON"))
                .build();
*/
         actComponent = DaggerActComponent.builder()
                .mwanaModule(new MwanaModule("MASON"))
                .appComponent(appComponent)
                .build();

    }

}
