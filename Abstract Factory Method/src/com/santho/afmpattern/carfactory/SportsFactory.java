package com.santho.afmpattern.carfactory;

import com.santho.afmpattern.parts.Engine;
import com.santho.afmpattern.parts.Wheel;
import com.santho.afmpattern.types.sports.SportsEngine;
import com.santho.afmpattern.types.sports.SportsWheels;

public class SportsFactory implements CarFactory{

//    @Override
    public Engine installEngine() {
        return new SportsEngine();
    }

    @Override
    public Wheel installWheel() {
        return new SportsWheels();
    }
}
