package pl.coderstrust.figures;

public class Triangle implements Calculable {

    private double base;
    private double height;

    public Triangle(double base, double heigh) {
        this.base = base;
        this.height = heigh;
    }

    public double getArea() {
        return calculateArea();
    }

    public double getBase() {
        return base;
    }

    public double getHeigh() {
        return height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}