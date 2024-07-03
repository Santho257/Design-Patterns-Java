package com.santho.fmpattern;

import com.santho.fmpattern.designs.Car;
import com.santho.fmpattern.factory.CarFactory;

public class Main {
    public static void main(String[] args) {
        try {
            Car myCar = CarFactory.getCar("automatic", 5, 150);
            myCar.drive();
        }
        catch(UnsupportedOperationException ex){
            System.out.println(ex.getMessage());
        }
    }
}