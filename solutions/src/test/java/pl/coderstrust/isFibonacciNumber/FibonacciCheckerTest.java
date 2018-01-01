package pl.coderstrust.isFibonacciNumber;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciCheckerTest {
    FibonacciChecker isFibo = new FibonacciChecker ();

    @Test
    public void returnTrueIfNumberIsFibonacciNumber() {

        Assert.assertTrue(isFibo.isFibbonaciNumber(144L));
    }

    @Test
    public void returnFalseIfNumberIsFibonacciNumber() {
        Assert.assertFalse(isFibo.isFibbonaciNumber(1452845L));
    }
}