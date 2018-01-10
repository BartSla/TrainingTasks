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

    public void setBaseFirst(double baseFirst) {
        this.baseFirst = baseFirst;
    }

    public double getBaseSecond() {
        return baseSecond;
    }

    public void setBaseSecond(double baseSecond) {
        this.baseSecond = baseSecond;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return calculateArea();
    }

    @Override
    public double calculateArea() {
        return 0.5 * (baseFirst + baseSecond) * height;
    }
}