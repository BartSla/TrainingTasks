package pl.coderstrust.MyArrayList;

import java.util.List;

public class MyArrayListTest extends AbstractListTest {

    @Override
    public List getList() {

        return new MyArrayList<>();
    }
}