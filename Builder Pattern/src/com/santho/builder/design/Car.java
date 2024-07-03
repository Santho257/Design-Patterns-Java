package com.santho.builder.design;

import com.santho.builder.builder.CarBuilder;

public class Car {
    private boolean AC;
    private boolean roofTop;
    private int airBags;

    public Car(CarBuilder builder) {
        this.AC = builder.isAC();
        this.roofTop = builder.isRoofTop();
        this.airBags = builder.getAirBags();
    }

    @Override
    public String toString() {
        return "Car{" +
                "AC=" + AC +
                ", roofTop=" + roofTop +
                ", airBags=" + airBags +
                '}';
    }
}
