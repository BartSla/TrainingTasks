package com.avebart;

public class Car extends Vehicle {

    private int gears;
    private int doors;


    public Car(String name, int speed, int steering, int wheels, int gears, int doors) {
        super(name, speed, steering, wheels);
        this.gears = gears;
        this.doors = doors;
    }

    public void changingGears (int gears){

        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }

    public int getDoors() {
        return doors;
    }
}
