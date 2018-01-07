package pl.coderstrust.sortingMethodes;

public class BubbleSortingTest extends SortingTestBase{

    @Override
    public SortingMethod getSortingMethod() {
        System.out.println("Bubble Sort");
        return new BubbleSorting();
    }
}