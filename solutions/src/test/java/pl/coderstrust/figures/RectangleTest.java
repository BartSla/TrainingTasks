package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void shouldCalculateArea() {
        // given
        Rectangle rectangle = new Rectangle(12.4, 10.1);
        double expectedArea = 125.24;
        //when
        double rectangleArea = rectangle.calculateArea();
        //then
        Assert.assertEquals(expectedArea, rectangleArea, 0.01);
    }

    @Test
    public void shouldCalculateArea0() {
        // given
        Rectangle rectangle = new Rectangle(0, 0);
        double expectedArea = 0;
        //when
        double rectangleArea = rectangle.calculateArea();
        //then
        Assert.assertEquals(expectedArea, rectangleArea, 0.01);
    }

}