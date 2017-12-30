package pl.coderstrust.search;

public class LinearSearch {

    public int linearSearch(int array[], int searchingNumber) {
        int maxArrayNumber = array.length;
        for (int i = 0; i < maxArrayNumber; i++) {
            if (array[i] == searchingNumber)
                return i;
        }
        return -1;
    }
}