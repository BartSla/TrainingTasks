package pl.coderstrust.hoarePartation;

public class Hoare {

    public int[] partition(int[] array, int pivotIndex) {
        int pivot = array[pivotIndex];
        int temp;
        int last = array.length - 1;

        int switchPivot = pivot;
        pivot  = array[0];
        array[0] = switchPivot;
        array[pivotIndex] = pivot;
        pivot = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= pivot) {
                temp = array[i];
                array[i] = pivot;
                array[i - 1] = temp;
            } else if (array[i] > pivot && last > i) {
                temp = array[i];
                array[i] = array[last];
                array[last] = temp;
                last -= 1;
                i--;
            } else
                break;
        }
        return array;
    }
}