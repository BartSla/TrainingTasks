package pl.coderstrust.sorting;

public class SelectionSort {

    public static int[] selectionSort(int [] numbersArray) {

        int i;
        int j;
        int temp;

        for (i = 0; i < numbersArray.length; i++) {
            int minNum = i;
            for (j = i + 1; j < numbersArray.length; j++) {
                if (numbersArray[j] < numbersArray[minNum])
                    minNum = j;
            }
            temp = numbersArray[minNum];
            numbersArray[minNum] = numbersArray[i];
            numbersArray[i] = temp;
        }
        return numbersArray;
    }
}




