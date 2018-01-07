package pl.coderstrust.sortingMethodes;

public class MergeSortingTest extends SortingTestBase{

    @Override
    public SortingMethod getSortingMethod() {
        System.out.println("Merge Sort");
        return new MergeSorting();
    }
}