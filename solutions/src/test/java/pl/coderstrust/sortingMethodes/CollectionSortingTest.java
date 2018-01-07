package pl.coderstrust.sortingMethodes;

public class CollectionSortingTest extends SortingTestBase{

    @Override
    public SortingMethod getSortingMethod() {
        System.out.println("Collection Sort");
        return new CollectionSorting();
    }
}