package com.santho.adapattern.adapters;

import com.santho.adapattern.designs.Car;
import com.santho.adapattern.designs.ElectricCar;

public class ElectricCarAdapter implements Car {
    private ElectricCar car;

    public ElectricCarAdapter(ElectricCar car) {
        this.car = car;
    }

    @Override
    public int getSpeed() {
        return this.car.getSpeed();
    }

    @Override
    public int getFuelLevel() {
        return this.car.getBatteryPercentage();
    }

    @Override
    public String toString() {
        return "" + car;
    }
}
