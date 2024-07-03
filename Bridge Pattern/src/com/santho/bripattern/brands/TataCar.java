package com.santho.bripattern.brands;

import com.santho.bripattern.type.Type;

public class TataCar extends Car{
    public TataCar(Type type) {
        super(type);
    }

    @Override
    public void preview() {
        System.out.println("It is a Tata" + super.type.getType());
    }
}
