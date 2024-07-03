package com.santho.bripattern;

import com.santho.bripattern.brands.Car;
import com.santho.bripattern.brands.FerrariCar;
import com.santho.bripattern.brands.TataCar;
import com.santho.bripattern.type.SportsType;
import com.santho.bripattern.type.Suvtype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> myCarList = new ArrayList<Car>();
        myCarList.add(new FerrariCar(new SportsType()));
        myCarList.add(new TataCar(new Suvtype()));

        for(Car car:myCarList){
            car.preview();
        }
    }
}