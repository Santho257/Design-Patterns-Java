package com.santho.designpatterns.designs;

public class LazySingleton {
    private LazySingleton(){
        System.out.println("Object is Created!");
    }

    private static LazySingleton instance = null;

    public static LazySingleton getInstance(){
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
