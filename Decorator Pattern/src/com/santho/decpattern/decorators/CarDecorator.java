package com.santho.decpattern.decorators;

import com.santho.decpattern.base.Car;

public abstract class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String drive(){
        return car.drive();
    }
}
