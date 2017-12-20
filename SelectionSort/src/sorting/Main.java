package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SelectionSort selectSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("How long array you want to sort?");
        System.out.println("Enter array length");

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " array number:");
            arr[i] = scanner.nextInt();
        }

        int[] sortedArray = selectSort.selectionSort(arr);
        int[] sortedArray2 = bubbleSort.bubbleSorting(arr);
        System.out.println("Selection sorted elements : " + Arrays.toString(sortedArray));
        System.out.println("Bubble sorted elements : " + Arrays.toString(sortedArray2));
    }
}


