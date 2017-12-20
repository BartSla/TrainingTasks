package bartek;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SieveOfEratosthenesTest {

    @Test
    public void searchPrimary() throws Exception {

        SieveOfEratosthenes sieve= new SieveOfEratosthenes();

        boolean [] arrayLengthToTest = new boolean [10];
        boolean [] expectedLength= sieve.searchPrimary(10);
        Assert.assertEquals(expectedLength.length, arrayLengthToTest.length);
    }
}
