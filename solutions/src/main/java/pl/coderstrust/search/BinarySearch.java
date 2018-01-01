package pl.coderstrust.search;

public class BinarySearch {

    public int binarySearch(int[] array, int searchingNumber) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int midValue = start + (end - start) / 2;
            if (array[midValue] == searchingNumber) {
                return midValue;
            }
            if (searchingNumber < array[midValue]) {
                end = midValue - 1;

            } else {
                start = midValue + 1;
            }
        }
        return -1;
    }
}