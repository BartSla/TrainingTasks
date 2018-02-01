package pl.coderstrust.myLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    MyLinkedList list = new MyLinkedList();

    @Test
    public void add1() {

        list.add(1L);
        list.add(2L);
        long expected = 2L;
        Assert.assertTrue(list.contains(expected));
    }

    @Test
    public void contains() {

        list.add(222L);
        list.add(333L);
        long expected = 444L;
        Assert.assertFalse(list.contains(expected));
    }

    @Test
    public void remove1() {

        list.add("bartek");
        list.add("zuza");
        list.remove("zuza");
        String expected = "zuza";
        Assert.assertFalse(list.contains(expected));
    }
}