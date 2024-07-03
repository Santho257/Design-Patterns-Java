package com.santho.bripattern.brands;

import com.santho.bripattern.type.Type;

public class FerrariCar extends Car{
    public FerrariCar(Type type) {
        super(type);
    }

    @Override
    public void preview() {
        System.out.println("It is a Ferrari " + super.type.getType());
    }
}
