package sorting;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void selectionSortingTest() {

        int[] givenArray = {1, 2, 3, 4, 5, 6, 7};
        int[] selectionExpectedArray = SelectionSort.selectionSort(givenArray);
        Assert.assertArrayEquals(selectionExpectedArray, givenArray);
    }
}