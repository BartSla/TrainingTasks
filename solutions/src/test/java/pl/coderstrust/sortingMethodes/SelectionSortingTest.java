package pl.coderstrust.sortingMethodes;

public class SelectionSortingTest extends SortingTestBase{

    @Override
    public SortingMethod getSortingMethod() {
        System.out.println("Selection Sort");
        return new SelectionSorting();
    }
}