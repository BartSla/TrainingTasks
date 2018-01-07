package pl.coderstrust.sortingMethodes;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.Assert.assertArrayEquals;

public abstract class SortingTestBase {

    public abstract SortingMethod getSortingMethod();

    @Test
    public void shouldSotSimpleArray() {
        // given
        int[] given = new int[]{5, 4, 3, 2, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5};

        // when
        long startTime = System.currentTimeMillis();

        int[] result = getSortingMethod().sort(given);

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        // then
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldSort1000000RandomArray(){

        // given
        Random random = new Random();
        int[] given = new int[10000];
        for (int i = 0; i < given.length; i++) {
            given[i] = random.nextInt();
        }
        List<Integer> listToSort = Arrays.stream(given).boxed().collect(Collectors.toList());
        Collections.sort(listToSort);


        // when
        long startTime = System.currentTimeMillis();

        int[] result = getSortingMethod().sort(given);

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        // then
        assertArrayEquals(listToSort.stream().mapToInt(i -> i).toArray(), result);
    }
}


