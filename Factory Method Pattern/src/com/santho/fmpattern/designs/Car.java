package com.santho.fmpattern.designs;

public abstract class Car {
    String type;
    int seats;
    int maxSpeed;

    public Car(String type, int seats, int maxSpeed) {
        this.type = type;
        this.seats = seats;
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void drive();
}
