package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void shouldCalculateArea() {
        // given
        Triangle triangle = new Triangle(12.4, 10.1);
        double expectedArea = 62.62;
        //when
        double triangleArea = triangle.calculateArea();
        //then
        Assert.assertEquals(expectedArea, triangleArea, 0.01);
    }

    @Test
    public void shouldCalculateArea0() {
        // given
        Triangle triangle = new Triangle(0, 10.1);
        double expectedArea = 0;
        //when
        double triangleArea = triangle.calculateArea();
        //then
        Assert.assertEquals(expectedArea, triangleArea, 0.01);
    }
}