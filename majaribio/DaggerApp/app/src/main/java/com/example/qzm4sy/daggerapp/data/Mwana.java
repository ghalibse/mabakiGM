package com.example.qzm4sy.daggerapp.data;


import javax.inject.Inject;

public class Mwana {
    private String jina;

    public Mwana(String jina) {

        this.jina = jina;
    }

    public String getJina() {
        return jina;
    }


 /*   private String jina;

    @Inject
    public Mwana() {

        this.jina = "MASON";
    }

    public String getJina() {
        return jina;
    }*/
}
