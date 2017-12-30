package pl.coderstrust.search;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTest {

    BinarySearch binarySearch = new BinarySearch();

    @Test
    public void shouldReturnExecutionTimeForSevenMillionArray() {

        int[] array = new int[70000000];
        for (int i = 0; i < 7000000; i++) {
            array[i] = i + 1;
        }
        long start = System.nanoTime();
        binarySearch.binarySearch(array, 1356897);

        long stop = System.nanoTime();
        System.out.println("Execution time in nanosekund: " + (stop - start));
    }

    @Test
    public void shouldFindIndexOfNumber() {
        int[] array = new int[2000000];
        for (int i = 0; i < 2000000; i++) {
            array[i] = i + 1;
        }
        assertEquals(134568, binarySearch.binarySearch(array, 134569));
        assertEquals(7778, binarySearch.binarySearch(array, 7779));
        assertEquals(1789547, Arrays.binarySearch(array, 1789548));
        assertEquals(17556, Arrays.binarySearch(array, 17557));
    }
}