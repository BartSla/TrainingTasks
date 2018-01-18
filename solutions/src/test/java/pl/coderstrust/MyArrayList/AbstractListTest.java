package pl.coderstrust.MyArrayList;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public abstract class AbstractListTest {

    public abstract List getList();

    public List testArray = getList();
    public List testArray2 = getList();
    public List testArray3 = getList();


    @Test
    public void size() {

        assertTrue(testArray.isEmpty());

        testArray.add(222L);
        int expected = 1;

        Assert.assertEquals(expected, testArray.size());
    }

    @Test
    public void isEmpty() {

        Assert.assertTrue(testArray.isEmpty());
    }

    @Test
    public void contains() {
        assertTrue(testArray.isEmpty());
        testArray.add(222L);
        testArray.add(333L);
        long expected = 444L;
        Assert.assertFalse(testArray.contains(expected));
    }

    @Test
    public void iterator() {
        assertTrue(testArray.isEmpty());

        testArray.add("bartek");
        testArray.add("zuza");
        testArray.add("filip");
        testArray.add("kuba");
        int i = 0;
        Iterator<String> myTestIterator = testArray.iterator();

        while (myTestIterator.hasNext()) {
            assertEquals(testArray.get(i), myTestIterator.next());
            i++;
        }
    }

    @Test
    public void toArray() {

        assertTrue(testArray.isEmpty());
        Long[] expected = {1L, 2L};
        testArray.add(1L);
        testArray.add(2L);

        Assert.assertArrayEquals(expected, testArray.toArray());
    }

    @Test
    public void toArray1() {
        assertTrue(testArray.isEmpty());
        testArray.add(1L);
        testArray.add(2L);

        testArray.toArray();

        Long[] expected = {1L, 2L};
        Assert.assertArrayEquals(expected, testArray.toArray());
    }

    @Test
    public void remove() {
        testArray.add(1L);
        testArray.add(2L);
        testArray.remove(0);
        Assert.assertEquals(1, testArray.size());

    }

    @Test
    public void containsAll() {

        assertTrue(testArray.isEmpty());
        testArray.add(111111L);
        testArray.add(222222L);
        testArray.add(444444L);
        assertTrue(testArray.containsAll(Arrays.asList(111111L, 222222L, 444444L)));
        assertFalse(testArray.containsAll(Arrays.asList(777777L, 222222L)));
    }

    @Test
    public void removeAll() {
        assertTrue(testArray.isEmpty());
        testArray.add(1L);
        testArray.add(2L);
        testArray2.add(22L);
        testArray2.add(222L);
        testArray.add(11L);

        testArray.addAll(testArray2);

        testArray3.add(22L);
        testArray3.add(222L);

        testArray.removeAll(testArray3);

        Assert.assertEquals(3, testArray.size());
    }

    @Test
    public void retainAll() {
        assertTrue(testArray.isEmpty());
        assertTrue(testArray2.isEmpty());
        testArray.add("one");
        testArray.add("two");
        testArray.add("four");
        testArray2.add("one");
        testArray2.add("two");

        testArray.retainAll(testArray2);

        Assert.assertArrayEquals(testArray2.toArray(), testArray.toArray());
    }

    @Test
    public void clear() {
        assertTrue(testArray.isEmpty());
        testArray.add(1L);
        testArray.add(2L);
        testArray.clear();
        testArray2.add("two");
        testArray2.clear();

        Assert.assertArrayEquals(testArray2.toArray(), testArray.toArray());
    }

    @Test
    public void get() {
        assertTrue(testArray.isEmpty());
        testArray.add(1L);
        testArray.add(2L);
        Assert.assertEquals(1L, testArray.get(0));
    }

    @Test
    public void remove1() {
        assertTrue(testArray.isEmpty());
        testArray.add(1L);
        testArray.add(2L);
        testArray.remove(2L);
        Assert.assertEquals(1, testArray.size());
    }

    @Test
    public void indexOf() {
        assertTrue(testArray.isEmpty());
        testArray.add(1L);
        testArray.add(2L);

        int index = testArray.indexOf(1L);
        Assert.assertEquals(0, index);
    }

    @Test
    public void lastIndexOf() {
        assertTrue(testArray.isEmpty());

        testArray.add(1L);
        testArray.add(2L);
        Assert.assertTrue(testArray.indexOf(2L) == testArray.lastIndexOf(2L));
    }

    @Test
    public void listIterator() {
        testArray.add("Zuzanna");
        testArray.add("Bartek");
        testArray.add("Jakub");
        testArray.add("Filip");

        ListIterator listIterator = testArray.listIterator(2);
        int i = 2;
        while (listIterator.hasNext()) {
            assertEquals(testArray.get(i), listIterator.next());
            i++;
        }
    }

    @Test
    public void listIterator1() {

        testArray.add("Zuzanna");
        testArray.add("Bartek");
        testArray.add("Jakub");
        testArray.add("Filip");

        ListIterator listIterator = testArray.listIterator(0);
        int i = 0;
        while (listIterator.hasNext()) {
            assertEquals(testArray.get(i), listIterator.next());
            i++;
        }
    }

    @Test
    public void subList() {
        assertTrue(testArray.isEmpty());
        assertTrue(testArray2.isEmpty());
        testArray.add(222L);
        testArray.add(333L);
        testArray.add(444L);

        testArray.subList(1, 2);
        testArray2.add(333L);
        testArray2.add(444L);

        Assert.assertEquals(testArray2.get(1), testArray.get(2));
    }

    @Test
    public void add() {
        assertTrue(testArray.isEmpty());

        testArray.add(1L);
        testArray.add(2l);
        testArray.add(0, 3L);

        Assert.assertEquals(3L, testArray.get(0));
    }

    @Test
    public void set() {

        assertTrue(testArray.isEmpty());
        testArray.add(1L);
        testArray.add(2l);

        testArray.set(0, 33L);
        Assert.assertEquals(33L, testArray.get(0));
    }

    @Test
    public void addAll() {
        assertTrue(testArray.isEmpty());
        assertTrue(testArray2.isEmpty());
        testArray.add(111111L);
        testArray.add(222222L);
        testArray.add(444444L);
        testArray2.add(111111L);
        testArray2.add(222222L);

        testArray.addAll(1, testArray2);
        Assert.assertEquals(5, testArray.size());
    }

    @Test
    public void addAll1() {
        assertTrue(testArray.isEmpty());
        assertTrue(testArray2.isEmpty());
        testArray.add(111111L);
        testArray.add(222222L);
        testArray.add(444444L);
        testArray2.add(111111L);
        testArray2.add(222222L);

        testArray.addAll(testArray2);

        Assert.assertEquals(5, testArray.size());
    }

    @Test
    public void add1() {
        assertTrue(testArray.isEmpty());
        testArray.add(1L);
        testArray.add(2l);

        Assert.assertEquals(2, testArray.size());
    }
}