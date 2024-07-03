package com.santho.adapattern;

import com.santho.adapattern.adapters.ElectricCarAdapter;
import com.santho.adapattern.designs.Car;
import com.santho.adapattern.designs.DieselCar;
import com.santho.adapattern.designs.ElectricCar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new DieselCar(25,3));
        cars.add(new ElectricCarAdapter(new ElectricCar(19, 25)));

        System.out.println(cars);

    }
}