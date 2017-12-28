package pl.coderstrust.solutionFromUdemy.Switch;

public class Main {

    public static void main(String[] args) {

        char letter = 'K';

        switch (letter) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            case 'D':
            case 'E':
                System.out.println(letter + " was found");
                break;
            default:
                System.out.println("Could not found A, B, C, D or E.");
                break;
        }

        System.out.println("***************");

        String mounth = "May";

        switch (mounth.toUpperCase()) {

            case "June":
                break;
            case "May":
                break;
            default:
                System.out.println("Could not found");
                break;
        }

        System.out.println("***************");


        for (double i = 2; i <= 8; i++) {
            System.out.println(" 10000 at " + i + "% = " + calculateInterest(10000.0, i));
        }

        System.out.println("***************");

        for (int i = 8; i >= 2; i--) {
            System.out.println(" 10000 at " + i + "% = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("***************");

        int count = 0;

        for (int i=2; i<50; i++) {
            if ( isPrime(i)) {
                count++;
                System.out.println("It is " + isPrime(i) + " that " + i + " in prime number.");

                if (count == 3) {
                    System.out.println("Exit");
                    break;
                }
            }
        }


        System.out.println("****************");

        int number = 44;
        int lastNumber = 111;
        count = 0;
        while (number <= lastNumber){

             if (!isEvenNumber(number)) {
                number++;
                continue;

                }
                System.out.println( number + " is even number.");
                number++;
                count++;

                if (count == 5) {
                    System.out.println("I found " + count + " even numbers.");
                    break;
            }

        }
    }





    public static double calculateInterest(double amount, double interest) {
        return (amount * (interest / 100));
    }

    public static boolean isPrime (int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEvenNumber (int n){
        int modulo = n % 2;
        if (modulo == 0){
            return true;
        }
        else {
            return false;
        }




    }

}




