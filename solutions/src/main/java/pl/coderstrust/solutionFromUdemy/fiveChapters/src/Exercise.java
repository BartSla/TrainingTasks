package pl.coderstrust.solutionFromUdemy.fiveChapters.src;

public class Exercise {


    public static void main(String args[]) {

        double myPounds = 300;
        double pounds = 0.453593237d;
        double kilogram = myPounds * pounds;

        System.out.println(myPounds + " pounds is equal to " + kilogram + " Kilograms");


        System.out.println();

        char reg = '\u00AE';
        System.out.println(reg);

        System.out.println();

        double var1 = 20;
        double var2 = 80;
        double sumVars = (var1 + var2) * 25;
        double remainderVar = sumVars % 40;

        if (remainderVar <= 20)
            System.out.println("Total was over the limit.");

        System.out.println();

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your score is: " + finalScore);
        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your score is: " + finalScore);
        }


        System.out.println();


        int highPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Bartek", highPosition);

        highPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Zuzanna", highPosition);

        highPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Piotr", highPosition);

        highPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Dorota", highPosition);

        System.out.println();




        calcInchAndFeetToCentimeters1(12, 5);
        double myInches = calcInchAndFeetToCentimeters1(211);
        double leftInches = myInches % 12;
        double myFeet = (myInches - leftInches) / 12;
        calcInchAndFeetToCentimeters1(myFeet, leftInches);

        System.out.println();

        calcFeetAndInchesToCentimeters(11, 2);
        calcFeetAndInchesToCentimeters(113);




    }


    public static void displayHighScorePosition(String playerName, int highPosition) {

        System.out.println(playerName + " managed to get into position " + highPosition + " on the high score table.");

    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }


    public static double calcInchAndFeetToCentimeters1(double feet, double inch) {
        if (feet > 0 && inch > 0 && inch < 12)
        {
            double cent = (inch * 2.54) + (feet * 30.48);
            System.out.println(feet + " feet and " + inch + " inches equal to " + cent + " centimeters.");
            return cent;
        } else{
            System.out.println("Invalid numbers" );
            return -1;
        }
    }

    public static double calcInchAndFeetToCentimeters1(double inch) {
        if (inch > 0) {
            double cent = (inch * 2.54);
            System.out.println(inch + " inches equal to " + cent +  " centimeters.");
            return inch;
        } else{
            System.out.println("Invalid numbers");
                return -1;
            }
        }


    public static double calcFeetAndInchesToCentimeters ( double feet, double inch){

        if (feet <0 || inch < 0 || inch >12){
            return -1;
        }
            double centemeters = (inch * 2.54) + (feet * 30.48);
            System.out.println(feet + " feet and " + inch + " inches equal to " + centemeters + " centimeters.");
            return centemeters;
    }

    public static double calcFeetAndInchesToCentimeters ( double inch) {
        if (inch < 0) {
            return -1;
        }
        double feet = (int) inch / 12;
        double remainginch = inch % 12;
        System.out.println(inch + " inches are equal to " + feet + " feet and " + remainginch + " inches. ");
        return calcFeetAndInchesToCentimeters(feet, remainginch);
    }





    }


