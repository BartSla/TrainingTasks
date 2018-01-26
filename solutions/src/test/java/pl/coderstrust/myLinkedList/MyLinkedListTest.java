package pl.coderstrust.myLinkedList;

import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void shouldReturn() {

        MyLinkedList list = new MyLinkedList();

        list.add(15);
        list.add(12);
        list.add(13);
        list.add(1);

        list.remove(15);

        System.out.println(list.contains(15));
//        System.out.println(list.iterator().hasNext());
    }
}