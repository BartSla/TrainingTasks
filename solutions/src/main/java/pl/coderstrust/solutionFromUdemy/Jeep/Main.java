package pl.coderstrust.solutionFromUdemy.Jeep;

public class Main {

    public static void main(String[] args) {

        Vehicle bike = new Vehicle("Bike", 10, 1, 2);

        bike.decresingSpeed(10);
        System.out.println(bike.getSpeed());

        Car sedan = new Car ("Lanos", 110, 1, 4, 5, 4);

        Jeep jeep = new Jeep ("Jeep", 200, 1, 4, 5, 5, "on" );

        jeep.getFourWd();
        System.out.println(jeep.getFourWd());


    }
}
