package com.santho.designpatterns.designs;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    private SerializedSingleton(){
        System.out.println("Object is Created!");
    }

    private static SerializedSingleton instance = null;

    public static SerializedSingleton getInstance(){
        if(instance == null)
            instance = new SerializedSingleton();
        return instance;
    }

    protected Object readResolve(){
        return instance;
    }
}
