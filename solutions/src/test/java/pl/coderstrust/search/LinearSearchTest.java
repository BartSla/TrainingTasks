package pl.coderstrust.search;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class LinearSearchTest {

    LinearSearch linearSearch = new LinearSearch();

    @Test
    public void shouldReturnExecutionTimeForSevenMillionArray() {

        int[] array = new int[70000000];
        for (int i = 0; i < 7000000; i++) {
            array[i] = i + 1;
        }
        long start = System. nanoTime();
        linearSearch.linearSearch(array, 1356897);

        long stop = System. nanoTime();
        System.out.println("Execution time in nanosekund: " + (stop - start));
    }

    @Test
    public void shouldFindIndexOfNumber() {
        int[] array = new int[2000000];
        for (int i = 0; i < 2000000; i++) {
            array[i] = i + 1;
        }
        assertEquals(134568, linearSearch.linearSearch(array, 134569));
        assertEquals(7778, linearSearch.linearSearch(array, 7779));
    }
}