package com.example.qzm4sy.daggerapp.modules;


import com.example.qzm4sy.daggerapp.data.Mpenzi;
import com.example.qzm4sy.daggerapp.scopes.AppScope;

import dagger.Module;
import dagger.Provides;


@Module
public class MpenziModule {

    private String jina;

    public MpenziModule(String jina) {
        this.jina = jina;
    }

    @AppScope
    @Provides
    Mpenzi getMpenzi() {

        return new Mpenzi(jina);
    }

}
