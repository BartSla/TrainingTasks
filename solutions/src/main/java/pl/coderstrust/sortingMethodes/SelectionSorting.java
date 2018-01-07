package pl.coderstrust.sortingMethodes;

public class SelectionSorting implements SortingMethod {

    @Override
    public int[] sort(int[] array) {
        int i;
        int j;
        int temp;

        for (i = 0; i < array.length; i++) {
            int minNum = i;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[minNum])
                    minNum = j;
            }
            temp = array[minNum];
            array[minNum] = array[i];
            array[i] = temp;
        }
        return array;
    }
}