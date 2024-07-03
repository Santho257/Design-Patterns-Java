package com.santho.designpatterns.designs;

public class EagerSingleton {
    private EagerSingleton(){
        System.out.println("Object is Created!");
    }

    private static EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance(){
        return instance;
    }
}
