package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;

public class TrapezoidTest {

    @Test
    public void shouldCalculateArea() {
        // given
        Trapezoid trapezoid = new Trapezoid(5.1, 11.41,  21  );
        double expectedArea = 173.355;
        //when
        double trapezoidArea = trapezoid.calculateArea();
        //then
        Assert.assertEquals(expectedArea, trapezoidArea, 0.001);
    }
    @Test
    public void shouldCalculateArea0() {
        // given
        Trapezoid trapezoid = new Trapezoid(0, 0, 22);
        double expectedArea = 0;
        //when
        double trapezoidArea = trapezoid.calculateArea();
        //then
        Assert.assertEquals(expectedArea, trapezoidArea, 0.01);
    }
}