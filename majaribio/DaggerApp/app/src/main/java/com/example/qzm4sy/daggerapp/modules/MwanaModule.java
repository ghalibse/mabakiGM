package com.example.qzm4sy.daggerapp.modules;

import com.example.qzm4sy.daggerapp.data.Mwana;
import com.example.qzm4sy.daggerapp.scopes.ActScope;

import dagger.Module;
import dagger.Provides;


@Module
public class MwanaModule {

    private String jina;

    public MwanaModule(String jina) {
        this.jina = jina;
    }

    @ActScope
    @Provides
    Mwana getMwana(){

        return new Mwana(jina);
    }
/*
    private MainActivity mainActivity;

    public MwanaModule(MainActivity mainActivity) {

        this.mainActivity = mainActivity;
    }

    @ActScope
    @Provides
    public MainActivity getMainActivity(){

        return mainActivity;
    }*/
}
