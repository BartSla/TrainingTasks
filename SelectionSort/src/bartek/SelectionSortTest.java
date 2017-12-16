package bartek;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

    @Test
    public void selectionSortingTest() {

        int[] givenArray = {2, 1, 3, 4, 5, 7, 6};
        int[] selectionExpectedArray = SelectionSort.selectionSort(givenArray);
        Assert.assertEquals(selectionExpectedArray.length, givenArray.length);
    }
}