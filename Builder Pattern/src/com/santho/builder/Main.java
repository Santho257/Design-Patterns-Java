package com.santho.builder;

import com.santho.builder.builder.CarBuilder;
import com.santho.builder.design.Car;

public class Main {
    public static void main(String[] args) {
        Car myCar = new CarBuilder()
                .setAC(true)
                .setAirBags(4)
                .build();
        System.out.println(myCar);
    }
}