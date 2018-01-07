package pl.coderstrust.sortingMethodes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSorting implements SortingMethod {

    @Override
    public int[] sort(int[] array) {

        List<Integer> listToSort = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.sort(listToSort);
        return listToSort.stream().mapToInt(i -> i).toArray();
    }
}
