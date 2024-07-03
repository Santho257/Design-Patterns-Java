package com.santho.decpattern.decorators;

import com.santho.decpattern.base.Car;

public class NitroDecorator extends CarDecorator{
    public NitroDecorator(Car car) {
        super(car);
    }

    @Override
    public String drive() {
        return super.drive()+"Added Boost ";
    }

}
