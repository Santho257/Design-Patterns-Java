package com.santho.fmpattern.designs;

public class AutomaticCar extends Car{
    public AutomaticCar(String type, int seats, int maxSpeed) {
        super(type, seats, maxSpeed);
    }

    @Override
    public void drive(){
        System.out.println("Car changes its gears Automatically!!");
    }


}
