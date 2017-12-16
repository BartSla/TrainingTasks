package bartek;

public class Fibonacci {

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
