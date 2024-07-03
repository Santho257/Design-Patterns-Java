package com.santho.fmpattern.factory;

import com.santho.fmpattern.designs.AutomaticCar;
import com.santho.fmpattern.designs.Car;
import com.santho.fmpattern.designs.ManualCar;

public class CarFactory {
    private CarFactory(){
        //
    }

    public static Car getCar(String type, int seats, int maxSpeed) throws UnsupportedOperationException {
        switch(type.toLowerCase()){
            case "manual":
                return new ManualCar(type, seats, maxSpeed);
            case "automatic":
                return new AutomaticCar(type, seats, maxSpeed);
            default:
                throw new UnsupportedOperationException("There is no such type. TYPE: "+type);
        }
    }
}
