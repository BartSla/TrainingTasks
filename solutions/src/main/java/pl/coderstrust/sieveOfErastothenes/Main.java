package pl.coderstrust.sieveOfErastothenes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SieveOfEratosthenes sieve= new SieveOfEratosthenes();

        System.out.println("Enter maximum numerical range to find prime numbers: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(Arrays.toString(sieve.searchPrimary(n)));
    }
}
