package com.santho.afmpattern.carfactory;

import com.santho.afmpattern.parts.Engine;
import com.santho.afmpattern.parts.Wheel;
import com.santho.afmpattern.types.suv.SuvEngine;
import com.santho.afmpattern.types.suv.SuvWheels;

public class SuvFactory implements CarFactory{

    @Override
    public Engine installEngine() {
        return new SuvEngine();
    }

    @Override
    public Wheel installWheel() {
        return new SuvWheels();
    }
}
