package sorting;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void sortingTest() {

        int[] givenArray = {1, 2, 3, 4, 5, 6, 7};
        int[] bubbleExpectedArray = BubbleSort.bubbleSorting(givenArray);
        Assert.assertArrayEquals(bubbleExpectedArray, givenArray);
    }
}