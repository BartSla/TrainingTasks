package pl.coderstrust.solutionFromUdemy.Polymorhism;

class Car {
    private int numOfCylinders;
    private String name;
    private int wheels;
    private boolean engine;

    public Car(int numOfCylinders, String name) {

        this(numOfCylinders, name, 4, true);
        this.numOfCylinders = numOfCylinders;
        this.name = name;
    }

    public Car(int numOfCylinders, String name, int wheels, boolean engine) {
        this.numOfCylinders = numOfCylinders;
        this.name = name;
        this.wheels = wheels = 4;
        this.engine = engine = true;
    }

    public String startEngine() {
        return "Car starts engine";
    }

    public String accelerate() {
        return "Car movies";
    }

    public String brake() {

        return "Car stops";
    }

    public int getNumOfCylinders() {
        return numOfCylinders;
    }

    public String getName() {
        return name;
    }


}
    class Seat extends Car{
        public Seat(int numOfCylinders, String name) {
            super(numOfCylinders, name);
        }
        public String startEngine() {
            return "Seat starts engine";
        }

        public String accelerate() {
            return "Seat movies";
        }

        public String brake() {

            return "Seat stops";
        }

    }
class Skoda extends Car {
    public Skoda(int numOfCylinders, String name) {
        super(numOfCylinders, name);
    }

    public String startEngine() {
        return "Skoda starts engine";
    }

    public String accelerate() {
        return "Skoda movies";
    }

    public String brake() {

        return "Skoda stops";
    }
}

class Mercedes extends Car{
    public Mercedes(int numOfCylinders, String name) {
        super(numOfCylinders, name);
    }
    public String startEngine() {
        return "Mercedes starts engine";
    }

    public String accelerate() {
        return "Mercedes movies";
    }

    public String brake() {

        return "Mercedes stops";
    }
}



public class Main {

    public static void main(String[] args) {

        Seat seat = new Seat(12, "Ibiza");
        Skoda skoda = new Skoda(10, "Fabia");
        Mercedes mercedes = new Mercedes(18, "A100");

        System.out.println(seat.startEngine());
        System.out.println(seat.accelerate());
        System.out.println(seat.brake());


        System.out.println(skoda.startEngine());
        System.out.println(skoda.accelerate());
        System.out.println(skoda.brake());

        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());

    }
}
