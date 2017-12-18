package sorting;

public class SelectionSort {


    public static int[] selectionSort(int numbersArray[]) {

        int i, j;
        int minNum = 0;
        int temp;

        for (i = numbersArray.length - 1; i < 0; i++) {

            for (j = 0; j <= i; j++) {
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




