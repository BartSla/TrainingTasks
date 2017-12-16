package bartek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter which element of Fibonacci sequence you want to know: ");
        long n = scanner.nextLong();
        scanner.close();
        System.out.println("Recursion method: " + n + " Fibonacci's number is equal to :  " + fibonacci.fibRecursion(n));
        System.out.println();
        System.out.println("Iteration method: " + n + " Fibonacci's number is equal to :  " + fibonacci.fibIteration(n));

    }
}
