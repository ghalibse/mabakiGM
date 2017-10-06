package com.example.qzm4sy.circletest.main;


import io.reactivex.Observable;

public class Demo {

    public static void main(String args[]){
        Observable.just("Hello, world!")
                .map(new Func1<String, String>() {
                    @Override
                    public String call(String s) {
                        return s + " -Dan";
                    }
                })
                .subscribe(s -> System.out. (s));
    }
}
