package pl.coderstrust.figures;

public class Trapezoid implements Calculable {

    private double baseFirst;
    private double baseSecond;
    private double height;

    public Trapezoid(double baseFirst, double baseSecond, double height) {
        this.baseFirst = baseFirst;
        this.baseSecond = baseSecond;
        this.height = height;
    }

    public double getBaseFirst() {
        return baseFirst;
    }


    public double getBaseSecond() {
        return baseSecond;
    }


    public double getHeight() {
        return height;
    }


    public double getArea() {
        return calculateArea();
    }

    @Override
    public double calculateArea() {
        return 0.5 * (baseFirst + baseSecond) * height;
    }
}