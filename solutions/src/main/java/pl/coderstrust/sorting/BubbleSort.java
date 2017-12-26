
package pl.coderstrust.sorting;

public class BubbleSort {

    public static int[] bubbleSorting(int[] arrayToSort) {

        int temp;
        for (int i = arrayToSort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {

                    temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }
        return arrayToSort;
    }
}
// 0 1 2 3 4 5 6
// 8 2 5 6 9 1 3
