package com.avebart;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int [] myIntArray = getInt(5);

        printArray(myIntArray);

        Arrays.sort(myIntArray);
        System.out.println(Arrays.toString(myIntArray));

    }

    public static int[] getInt(int number) {
        System.out.println("Enter " + number + " value: \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {

            values[i] = sc.nextInt();
        }

        return values;
    }

    public static void printArray(int[] values) {


        for (int i = 0; i < values.length; i++) {
            System.out.println("Element " + i + ", typed value is " + values[i]);
        }

    }


//    public static int[] sortedValues (int number){
//
//
//
//
//
//    }

}