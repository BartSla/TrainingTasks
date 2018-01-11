package pl.coderstrust.figures;

public class Rectangle implements Calculable {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(double sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getArea() {
        return calculateArea();
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }
}