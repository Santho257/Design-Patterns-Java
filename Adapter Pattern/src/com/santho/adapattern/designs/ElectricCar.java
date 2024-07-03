package com.santho.adapattern.designs;

public class ElectricCar {
    int speed;
    int batteryPercentage;

    public ElectricCar(int speed, int batteryPercentage) {
        this.speed = speed;
        this.batteryPercentage = batteryPercentage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "speed=" + speed +
                ", batteryPercentage=" + batteryPercentage +
                '}';
    }
}
