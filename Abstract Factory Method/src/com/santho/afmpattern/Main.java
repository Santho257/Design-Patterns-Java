package com.santho.afmpattern;

import com.santho.afmpattern.carfactory.SportsFactory;
import com.santho.afmpattern.carfactory.SuvFactory;
import com.santho.afmpattern.design.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car;
        System.out.print("Enter the type of Car(suv / sports): ");
        String type = new Scanner(System.in).nextLine();
        switch(type.toLowerCase()){
            case "suv":
                car = new Car(new SuvFactory());
                break;
            case "sports":
                car = new Car(new SportsFactory());
                break;
            default:
                throw new UnsupportedOperationException("No such type! TYPE: "+ type);
        }
        car.install();
    }
}