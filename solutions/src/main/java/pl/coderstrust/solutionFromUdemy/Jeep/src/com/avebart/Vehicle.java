package pl.coderstrust.solutionFromUdemy.Jeep.src.com.avebart;

public class Vehicle {


    private String name;
    private int speed;
    private int steering;
    private int wheels;

    public Vehicle(String name, int speed, int steering, int wheels) {
        this.name = name;
        this.speed = speed;
        this.steering = steering;
        this.wheels = wheels;
    }

    public void icresingSpeed (int speed) {
        this.speed= speed + 10;

    }

    public void decresingSpeed (int speed){
        this.speed = speed - 10;

    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSteering() {
        return steering;
    }

    public int getWheels() {
        return wheels;
    }
}
