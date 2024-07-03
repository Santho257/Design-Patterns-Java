package com.santho.fmpattern.designs;

public class ManualCar extends Car{
    public ManualCar(String type, int seats, int maxSpeed) {
        super(type, seats, maxSpeed);
    }

    @Override
    public void drive(){
        System.out.println("Car is driving by changing Gears..!");
    }
}
