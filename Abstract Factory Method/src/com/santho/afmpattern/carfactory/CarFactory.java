package com.santho.afmpattern.carfactory;

import com.santho.afmpattern.parts.Engine;
import com.santho.afmpattern.parts.Wheel;

public interface CarFactory {
    Engine installEngine();
    Wheel installWheel();
}
