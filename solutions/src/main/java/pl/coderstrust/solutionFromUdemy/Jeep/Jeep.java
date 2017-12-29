package pl.coderstrust.solutionFromUdemy.Jeep;

import java.awt.datatransfer.StringSelection;

public class Jeep extends Car {

    private String fourWd;


    public Jeep(String name, int speed, int steering, int wheels, int gears, int doors, String fourWd) {
        super(name, speed, steering, wheels, gears, doors);
        this.fourWd = fourWd;
    }

    public void onFourWd(String fourWd){
        this.fourWd = fourWd;

    }

    public String getFourWd() {
        return fourWd;
    }
}
