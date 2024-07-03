package com.santho.adapattern.designs;

public class DieselCar implements Car{
    int speed;
    int fuelLevel;

    public DieselCar(int speed, int fuelLevel) {
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                "speed=" + speed +
                ", fuelLevel=" + fuelLevel +
                '}';
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getFuelLevel() {
        return this.fuelLevel;
    }
}
