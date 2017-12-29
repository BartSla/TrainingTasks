package pl.coderstrust.sorting;;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void sortingTest() {

        int[] givenArray = {7, 2, 6, 4, 5, 3, 1};
        int[] expectedArray= {1, 2, 3, 4, 5, 6, 7};
        int[] bubbleExpectedArray = BubbleSort.bubbleSorting(givenArray);
        Assert.assertArrayEquals(bubbleExpectedArray, expectedArray);
    }
}