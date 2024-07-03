package com.santho.builder.builder;

import com.santho.builder.design.Car;

public class CarBuilder {
    private boolean AC;
    private boolean roofTop;
    private int airBags;

    public CarBuilder(){

    }

    public boolean isAC() {
        return AC;
    }

    public boolean isRoofTop() {
        return roofTop;
    }

    public int getAirBags() {
        return airBags;
    }

    public CarBuilder setAC(boolean AC) {
        this.AC = AC;
        return this;
    }

    public CarBuilder setRoofTop(boolean roofTop) {
        this.roofTop = roofTop;
        return this;
    }

    public CarBuilder setAirBags(int airBags) {
        this.airBags = airBags;
        return this;
    }

    public Car build(){
        return new Car(this);
    }
}
