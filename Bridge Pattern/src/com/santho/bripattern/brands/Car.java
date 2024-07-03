package com.santho.bripattern.brands;

import com.santho.bripattern.type.Type;

public abstract class Car {
    protected Type type;

    public Car(Type type) {
        this.type = type;
    }

    public abstract void preview();
}
