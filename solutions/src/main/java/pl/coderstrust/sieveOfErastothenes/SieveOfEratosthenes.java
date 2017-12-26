package pl.coderstrust.sieveOfErastothenes;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static int[] searchPrimary(int n) {

        if (n >= 2) {
            int ncounter = 0;
            boolean[] arrayRange = new boolean[n];
            Arrays.fill(arrayRange, true);

            arrayRange[0] = false;
            arrayRange[1] = false;

            for (int p = 2; p < n; p++) {
                if (arrayRange[p]) {
                    for (int j = p * 2; j < n; j += p)
                        arrayRange[j] = false;
                }
            }
            int[] arrPrimes = new int[n];
            for (int i = 1; i < n; i++) {
                if (arrayRange[i]) {

                    arrPrimes[ncounter] = i;
                    ncounter++;
                }
            }

            int[] arePrimes = new int[ncounter];
            for (int i = 0; arrPrimes[i] > 0; i++) {
                arePrimes[i] = arrPrimes[i];
            }
            return arePrimes;
        } else {
            return new int[0];
        }
    }
}


