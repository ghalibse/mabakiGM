package com.example.qzm4sy.daggerapp.components;


import com.example.qzm4sy.daggerapp.modules.MpenziModule;
import com.example.qzm4sy.daggerapp.data.Mpenzi;
import com.example.qzm4sy.daggerapp.scopes.AppScope;

import dagger.Component;

@AppScope
@Component(modules = {MpenziModule.class})
public interface AppComponent {

    Mpenzi getMpenzi();

}
