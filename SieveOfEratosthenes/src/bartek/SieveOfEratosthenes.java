package bartek;

public class SieveOfEratosthenes {

    public boolean[] searchPrimary(int n) {

        boolean[] arrayRange = new boolean[n];
        arrayRange[0] = false;
        arrayRange[1] = false;

        for (int i = 2; i < n; i++) {
            arrayRange[i] = true;
        }

        for (int p = 2; p * p < n; p++) {

            if (arrayRange[p]) {

                for (int i = p * 2; i < n; i += p)
                    arrayRange[i] = false;
            }
        }
        return arrayRange;
    }

    public void printPrimeNumbers(boolean[] foundPrimes) {
        for (int i = 2; i <= foundPrimes.length - 1; i++) {
            if (foundPrimes[i])
                System.out.print(i + " ");
        }
    }
}

