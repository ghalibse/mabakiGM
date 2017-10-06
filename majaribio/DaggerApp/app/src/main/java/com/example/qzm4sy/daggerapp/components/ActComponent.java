package com.example.qzm4sy.daggerapp.components;


import com.example.qzm4sy.daggerapp.views.ListItem;
import com.example.qzm4sy.daggerapp.views.MainActivity;
import com.example.qzm4sy.daggerapp.modules.MwanaModule;
import com.example.qzm4sy.daggerapp.scopes.ActScope;

import dagger.Component;


@ActScope
@Component(modules = {MwanaModule.class},
            dependencies = {AppComponent.class})
public interface ActComponent {

    void inject(ListItem aView);

}
