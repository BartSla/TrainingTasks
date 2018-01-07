package pl.coderstrust.sortingMethodes;

public class QuickSortingTest extends SortingTestBase{

    @Override
    public SortingMethod getSortingMethod() {
        System.out.println("Quick Sort");
        return new QuickSorting();
    }
}