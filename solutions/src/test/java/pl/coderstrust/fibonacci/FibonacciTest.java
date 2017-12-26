package pl.coderstrust.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {


    public Fibonacci fibonacci = new Fibonacci();

    @Test
    public void fibRecursion() throws Exception {

        long tenthElementOfFibonacci = 55;
        long expectedElementOfFibonacci = fibonacci.fibRecursion(10);

        Assert.assertEquals(expectedElementOfFibonacci, tenthElementOfFibonacci);
    }

    @Test
    public void fibIteration() throws Exception {
        long tenthElementOfFibonacci = 55;
        long expectedElementOfFibonacci = fibonacci.fibRecursion(10);

        Assert.assertEquals(expectedElementOfFibonacci, tenthElementOfFibonacci);
    }

}