package pl.coderstrust.hoarePartation;

import org.junit.Assert;
import org.junit.Test;

public class HoareTest {
    Hoare hoare = new Hoare();

    @Test
    public void shouldProceedGivenArray() {
        int[] arrayGiven = {55, 6, 45, 66, 88, 909, 999, 5, 3, 7, 11, 22, 33, 333};

        int[] expected = {6, 45, 33, 22, 11, 7, 5, 3, 55, 999, 909, 88, 333, 66};

        Assert.assertArrayEquals(expected, hoare.partition(arrayGiven, 0));
    }

    @Test
    public void numbersAreLowerThenPivot() {
        int[] givenArray = {55, 6, 45, 66, 88, 909, 999, 5, 3, 7, 11, 22, 33, 333};
        int pivotIndex = 4;
        int pivot = givenArray[pivotIndex];

        //when
        int[] ex = hoare.partition(givenArray, pivotIndex);
        int pivotLocation = 0;
        for (int i = 0; i < ex.length; i++) {
            if (ex[i] == pivot) {
                pivotLocation = i;
            }
        }
        //then
        for (int i = 0; i < pivotLocation; i++) {
            Assert.assertTrue(ex[i] < pivot);
        }
    }

    @Test
    public void numbersAreGreaterThenPivot() {
        int[] givenArray = {55, 6, 45, 66, 88, 909, 999, 5, 3, 7, 11, 22, 33, 333};
        int pivotIndex = 4;
        int pivot = givenArray[pivotIndex];

        //when
        int[] ex = hoare.partition(givenArray, pivotIndex);
        int pivotLocation = 0;
        for (int i = 0; i < ex.length; i++) {
            if (ex[i] == pivot) {
                pivotLocation = i;
            }
        }
        //then
        for (int i = pivotLocation + 1; i < ex.length; i++) {
            Assert.assertTrue(ex[i] > pivot);
        }
    }
}