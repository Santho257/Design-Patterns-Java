package com.santho.designpatterns.designs;

public class MultiThreadedSingleton {
    private MultiThreadedSingleton(){
        System.out.println("Object is Created!");
    }

    private static MultiThreadedSingleton instance = null;

    public static MultiThreadedSingleton getInstance(){
        if(instance == null) {
            synchronized (MultiThreadedSingleton.class) {
                if(instance == null)
                    instance = new MultiThreadedSingleton();
            }
        }
        return instance;
    }
}
