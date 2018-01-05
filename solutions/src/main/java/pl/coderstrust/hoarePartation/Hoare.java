package pl.coderstrust.hoarePartation;

public class Hoare {

       public static int partition(int[] items, int startIndex, int endIndex) {
        int left = startIndex;
        int right = endIndex - 1;
        int pivot = items[startIndex];

        while (left <= right) {
            while (left <= right && items[left] <= pivot) {
                ++left;
            }
            while (left <= right && items[right] >= pivot) {
                --right;
            }
            if (left < right) {
                int temp_item = items[left];
                items[left] = items[right];
                items[right] = temp_item;
            }
        }
        int temp_item = items[left];
        items[left] = pivot;
        items[endIndex] = temp_item;

        return left;
    }



    public static void main(String[] args) {
        Hoare hoare = new Hoare();

        int[] array = {1, 4, 9, 33, 4, 66, 88, 9};
        System.out.println(
        hoare.partition(array, 0,7));
    }
}