package bartek;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void sortingTest() {

        int[] givenArray = {2, 1, 3, 4, 5, 7, 6};
        int[] bubbleExpectedArray = BubbleSort.bubbleSorting(givenArray);
        Assert.assertEquals(bubbleExpectedArray.length, givenArray.length);
    }
}