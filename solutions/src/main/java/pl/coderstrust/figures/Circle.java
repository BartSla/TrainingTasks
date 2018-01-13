package pl.coderstrust.figures;

public class Circle implements Calculable {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return calculateArea();
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {

        Circle circle = new Circle(22);
        System.out.println(circle.getArea());
    }
}