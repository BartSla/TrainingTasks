package bartek;

import java.util.Scanner;

public class Main {


    public static class Fibonacci  {

        public static long fibRecursion(long n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else
                return fibRecursion(n - 1) + fibRecursion(n - 2);
            // 0 1 1 2 3 5
            // n== 3; (3-1)+(3-2) => ((2-1) + (2-2))+1 => 2
        }

        public static long fibIteration(long n){
            long elementA = 0;
            long elementB = 1;
            long sum = 0;

            for(int i = 2; i <= n; i++){

                sum = elementA + elementB;
                elementA = elementB;
                elementB = sum;
            }
            return sum;
            // 1 1 2 3 5 8
            // A B s
            //   A B s
            //     A B s
        }
    }

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter witch element of Fibonacci sequence you want to know: ");
        long n = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Recursion method: " + n + " Fibonacci's number is equal to :  " + fibonacci.fibRecursion(n));

        System.out.println();

        System.out.println("Iteration method: " + n + " Fibonacci's number is equal to :  " + fibonacci.fibIteration(n));

    }
}
