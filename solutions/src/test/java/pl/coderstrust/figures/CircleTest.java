package pl.coderstrust.figures;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

        @Test
        public void shouldCalculateArea() {
            // given
            Circle circle = new Circle(11.8);
            double expectedArea = 437.4353;
            //when
            double circleArea = circle.calculateArea();
            //then
            Assert.assertEquals(expectedArea, circleArea, 0.001);
        }

        @Test
        public void shouldCalculateArea0() {
            // given
            Circle circle = new Circle(0);
            double expectedArea = 0;
            //when
            double circleArea = circle.calculateArea();
            //then
            Assert.assertEquals(expectedArea, circleArea, 0.01);
        }
    }