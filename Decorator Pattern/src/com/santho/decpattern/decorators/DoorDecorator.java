package com.santho.decpattern.decorators;

import com.santho.decpattern.base.Car;

public class DoorDecorator extends CarDecorator{
    public DoorDecorator(Car car) {
        super(car);
    }

    @Override
    public String drive() {
        return super.drive()+"Modified Door ";
    }

}
