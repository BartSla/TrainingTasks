package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CalculableTest {

    @Test
    public void calculateArea() {
        //given
        Calculable square = new Square(12.4);
        Calculable rectangle = new Rectangle(12.1, 10);
        Calculable trapezoid = new Trapezoid(5.1, 11.41, 21);
        Calculable triangle = new Triangle(12.4, 10.1);
        Calculable circle = new Circle(11.8);

        List <Double> expectedArea = new ArrayList<>();
        expectedArea.add(153.76);
        expectedArea.add(121.00);
        expectedArea.add(173.355);
        expectedArea.add(62.62);
        expectedArea.add(437.4353);
        //when
        List <Double> figures = new ArrayList<>();
        figures.add(square.calculateArea());
        figures.add(rectangle.calculateArea());
        figures.add(trapezoid.calculateArea());
        figures.add(triangle.calculateArea());
        figures.add(circle.calculateArea());
        //then
        for(int i = 0; i < figures.size(); i++){
            Assert.assertEquals(expectedArea.get(i), figures.get(i), 0.001);
            System.out.println(expectedArea.get(i) +" equals "+ figures.get(i));
        }
    }
}