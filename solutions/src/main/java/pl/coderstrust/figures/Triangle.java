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

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeigh() {
        return height;
    }

    public void setHeigh(double heigh) {
        this.height = heigh;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}