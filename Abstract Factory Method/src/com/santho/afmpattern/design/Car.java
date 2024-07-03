package com.santho.afmpattern.design;

import com.santho.afmpattern.carfactory.CarFactory;
import com.santho.afmpattern.parts.Engine;
import com.santho.afmpattern.parts.Wheel;

public class Car {
    private Engine engine;
    private Wheel wheel;

    public Car(CarFactory factory){
        this.engine = factory.installEngine();
        this.wheel = factory.installWheel();
    }

    public void install(){
        engine.install();
        wheel.install();
    }
}
