package pl.coderstrust.MyArrayList;

import java.util.*;

public class MyArrayList<T> implements List<T> {

    private T[] myArray;
    private int actSize = 0;

    public MyArrayList() {
        myArray = (T[]) new Object[10];
    }

    private void increaseListSize() throws RuntimeException {
        myArray = Arrays.copyOf(myArray, myArray.length * 2);
    }

    private void decreaseListSize() throws RuntimeException {
        myArray = Arrays.copyOf(myArray, myArray.length / 2);
    }

    @Override
    public int size() {

        return actSize;
    }

    @Override
    public boolean isEmpty() {
        if (actSize == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < actSize; i++) {
            if (o.equals(myArray[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(myArray, actSize);

    }

    @Override
    public <T> T[] toArray(T[] a) {
        Object[] original = toArray();
        T[] result = Arrays.copyOf(a, original.length);
        for (int i = 0; i < original.length; i++) {
            result[i] = (T) original[i];
        }
        return result;
    }

    @Override
    public boolean remove(Object o) {

        for (int i = 0; i < myArray.length; i++) {
            Object object = myArray[i];
            if (o == object) {
                T[] newList = (T[]) new Object[myArray.length];
                System.arraycopy(myArray, 0, newList, 0, i);
                if (myArray.length > i + 1) {
                    System.arraycopy(myArray, i + 1, newList, i, myArray.length - 1 - i);
                }
                myArray = newList;
                actSize--;
                return true;

            }
        }
        if (actSize <= (myArray.length / 4)) {
            decreaseListSize();
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {

        for (int i = 0; i < actSize; i++) {
            Object obj = get(i);
            if (!(collection.contains(obj))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        int x = 0, i;
        for (i = 0; i < actSize; i++)
            if (!collection.contains(myArray[i]))
                myArray[x++] = myArray[i];
        if (x != i) {
            Arrays.fill(myArray, x, i, null);
            actSize = x;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean retainAll(Collection<?> collection) {

        for (int i = 0; i < actSize; i++) {
            Object obj = get(i);
            if (!collection.contains(obj)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        actSize = 0;
    }

    @Override
    public T get(int index) {
        if (index < actSize) {
            return myArray[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public T remove(int index) {
        if (index < actSize) {
            T obj = myArray[index];
            myArray[index] = null;
            int tmp = index;
            while (tmp < actSize) {
                myArray[tmp] = myArray[tmp + 1];
                myArray[tmp + 1] = null;
                tmp++;
            }
            actSize--;
            if (myArray.length - actSize > myArray.length / 4) {
                decreaseListSize();
            }
            return obj;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < myArray.length; i++) {
            if (o.equals(myArray[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = 0; i >= 0; i++) {
            if (o.equals(myArray[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        return new MyListIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return new MyListIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return new SubList(this, fromIndex, toIndex);
    }

    @Override
    public void add(int pos, T element) {
        if (pos < 0 || pos > actSize) {
            throw new IndexOutOfBoundsException();
        }
        if (myArray.length == actSize) {
            increaseListSize();
        }
        for (int k = actSize; k > pos; k--) {
            myArray[k] = myArray[k - 1];
        }
        myArray[pos] = element;
        actSize++;
    }

    @Override
    public T set(int index, T element) {

        T oldValue = myArray[index];
        myArray[index] = element;
        return oldValue;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        Object[] addingArray = c.toArray();
        int arrayALength = addingArray.length;
        if (arrayALength == 0)
            return false;
        if (arrayALength > (myArray.length - actSize))
            increaseListSize();

        int numberPositionToMove = actSize - index;
        if (numberPositionToMove > 0)
            System.arraycopy(myArray, index,
                    myArray, index + arrayALength,
                    numberPositionToMove);
        System.arraycopy(addingArray, 0, myArray, index, arrayALength);
        actSize += arrayALength;
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> elements) {
        Object[] addingArray = elements.toArray();

        int arrayALength = addingArray.length;
        if (arrayALength == 0)
            return false;

        if (arrayALength > (myArray.length - actSize))
            increaseListSize();
        System.arraycopy(addingArray, 0, myArray, actSize, arrayALength);
        actSize += arrayALength;
        return true;
    }


    @Override
    public boolean add(T a) {
        if ((myArray.length - actSize) <= 1) {
            increaseListSize();
        }
        myArray[actSize] = a;
        actSize++;
        return true;
    }

    private class SubList extends MyArrayList {

        List parentList;
        int startPosition;
        int endPosition;

        public SubList(List<T> parentList, int startPosition, int endPosition) {
            this.parentList = parentList;
            this.startPosition = startPosition;
            this.endPosition = endPosition;
        }
    }

    private class MyIterator implements Iterator<T> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < actSize && myArray[currentIndex] != null;
        }

        @Override
        public T next() {
            return myArray[currentIndex++];
        }
    }

    private class MyListIterator extends MyIterator implements ListIterator<T> {

        public MyListIterator(int index) {
            this.cursor = index;
        }

        public MyListIterator() {
            this.cursor = 0;
        }

        int cursor;
        int lastRet = -1;

        @Override
        public boolean hasPrevious() {
            return cursor != 0;
        }

        @Override
        public T previous() {
            int i = cursor - 1;
            T[] elementData = MyArrayList.this.myArray;
            cursor = i;
            return elementData[lastRet = i];
        }

        @Override
        public int nextIndex() {
            return cursor + 1;
        }

        @Override
        public int previousIndex() {
            return cursor - 1;
        }

        @Override
        public void remove() {

            MyArrayList.this.remove(lastRet);
            cursor = lastRet;
            lastRet = -1;
        }

        @Override
        public void set(T t) {

            MyArrayList.this.set(lastRet, t);
        }

        @Override
        public void add(T t) {
            int i = cursor;
            MyArrayList.this.add(i, t);
            cursor = i + 1;
            lastRet = -1;
            actSize++;
        }
    }
}
