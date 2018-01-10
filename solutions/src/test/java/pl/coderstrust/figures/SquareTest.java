package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void shouldCalculateArea() {
        // given
        Rectangle square = new Square(12.4);
        double expectedArea = 153.76;
        //when
        double squareArea = square.calculateArea();
        //then
        Assert.assertEquals(expectedArea, squareArea, 0.01);
    }

    @Test
    public void shouldCalculateArea0() {
        // given
        Rectangle square = new Square(0);
        double expectedArea = 0;
        //when
        double squareArea = square.calculateArea();
        //then
        Assert.assertEquals(expectedArea, squareArea, 0.01);
    }
}