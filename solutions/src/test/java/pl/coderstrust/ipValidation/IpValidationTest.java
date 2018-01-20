package pl.coderstrust.ipValidation;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class IpValidationTest {

    IpValidation ip = new IpValidation();

    @Test
    public void shouldReturnTrueIfItIsValidIp() {

        for (int m = 0; m <= 255; m++) {

            for (int k = 0; k <= 255; k++) {

                for (int j = 0; j <= 255; j++) {

                    for (int i = 0; i <= 255; i++) {

                        String test = (m + "." + k + "." + j + "." + i);
                        Assert.assertTrue(ip.isIpAddress(test));
                    }
                }
            }
        }
    }

    @Test
    @Parameters({
            "222.000.2.I",
            "-10.200.1.1",
            "ooo.0.0.1",
            "OOO.000.0.1",
            "256.256.256.256",
            "i.0.0.0",
            "0.p.0.0",
            "222.0.x.1"})
    public void shouldReturnFalseBecauseOfNotValidInput(String input) {

        Assert.assertFalse(ip.isIpAddress(input));
    }
}