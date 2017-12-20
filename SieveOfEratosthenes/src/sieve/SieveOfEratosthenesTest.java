package sieve;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SieveOfEratosthenesTest {

    SieveOfEratosthenes sieve= new SieveOfEratosthenes();



    @Test
    public void shouldReturnPrimeNumberFornumber0() throws Exception {
        int[] arrayOfPrimesFor10MaxRange = {};
        int[] expectedPrimesForNumber10 = sieve.searchPrimary(0);
        Assert.assertArrayEquals(expectedPrimesForNumber10, arrayOfPrimesFor10MaxRange);
    }
    @Test
    public void shouldReturnPrimeNumberFornumber10() throws Exception {
        int [] arrayOfPrimesFor10MaxRange = {2,3,5,7} ;
        int [] expectedPrimesForNumber10 = sieve.searchPrimary(10);
        Assert.assertArrayEquals(expectedPrimesForNumber10, arrayOfPrimesFor10MaxRange);
    }

    @Test
    public void shouldReturnPrimeNumberFornumber20() throws Exception {
        int [] arrayOfPrimesFor20MaxRange = {2,3,5,7, 11, 13, 17, 19} ;
        int [] expectedPrimesFoNumber20 = sieve.searchPrimary(20);
        Assert.assertArrayEquals(expectedPrimesFoNumber20, arrayOfPrimesFor20MaxRange);
        }
}
