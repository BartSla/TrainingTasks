package pl.coderstrust.isFibonacciNumber;

import java.util.HashSet;

public class FibonacciChecker {

    boolean isFibbonaciNumber(long number) {

        long elementA = 0;
        long elementB = 1;
        long sum = 0;
        HashSet<Long> fibonacciSequence = new HashSet<>();

        while (number > sum) {
            for (int i = 2; i <= number; i++) {
                sum = elementA + elementB;
                elementA = elementB;
                elementB = sum;
                fibonacciSequence.add(sum);
                if (fibonacciSequence.contains(number)) {
                    return true;
                }
            }
        }
        return false;
    }
}