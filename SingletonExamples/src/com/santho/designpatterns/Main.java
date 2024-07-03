package com.santho.designpatterns;

import com.santho.designpatterns.designs.EagerSingleton;
import com.santho.designpatterns.designs.LazySingleton;
import com.santho.designpatterns.designs.MultiThreadedSingleton;
import com.santho.designpatterns.designs.SerializedSingleton;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Lazy Singleton
        LazySingleton lzy = LazySingleton.getInstance();
        LazySingleton lzy2 = LazySingleton.getInstance();
        System.out.println(lzy.hashCode() == lzy2.hashCode());

        //Eager Singleton
        EagerSingleton egr = EagerSingleton.getInstance();
        EagerSingleton egr2 = EagerSingleton.getInstance();
        System.out.println(egr.hashCode() == egr2.hashCode());

        //Multithreaded Singleton
        MultiThreadedSingleton mul = MultiThreadedSingleton.getInstance();
        MultiThreadedSingleton mul2 = MultiThreadedSingleton.getInstance();
        System.out.println(mul == mul2);

        //Serialized Singleton
        SerializedSingleton ses = SerializedSingleton.getInstance();
        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("xyz.obj"));
        oout.writeObject(ses);
        oout.close();
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("xyz.obj"));
        SerializedSingleton ses2 = (SerializedSingleton) oin.readObject();
        oin.close();

        System.out.println(ses == ses2);

    }
}