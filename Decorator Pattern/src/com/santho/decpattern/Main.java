package com.santho.decpattern;

import com.santho.decpattern.base.BaseCar;
import com.santho.decpattern.base.Car;
import com.santho.decpattern.decorators.DoorDecorator;
import com.santho.decpattern.decorators.NitroDecorator;

public class Main {
    public static void main(String[] args) {
        Car myCar = new BaseCar();
        System.out.println(myCar.drive());
        myCar = new NitroDecorator(myCar);
        System.out.println(myCar.drive());
        myCar = new DoorDecorator(myCar);
        System.out.println(myCar.drive());
    }
}