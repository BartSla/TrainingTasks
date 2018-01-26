package pl.coderstrust.myLinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable {

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public MyLinkedList() {
    }

    private class Node<T> {
        private T element;
        private Node nextNode;

        public Node(T element) {
            this.element = element;
        }
    }

    public void add(T element) {

        Node<T> node = new Node(element);
        if (head == null) {
            tail = node;
            head = node;
        } else {
            tail.nextNode = node;
            tail = node;
        }
        size++;
    }

    public boolean remove(T element) {
        boolean result = false;
        Node<T> previous = head;
        Node<T> current = head;
        while (current.nextNode != null || current == tail) {
            if (current.element.equals(element)) {

                if (size == 1) {
                    head = null;
                    tail = null;
                } else if (current.equals(head)) {
                    head = head.nextNode;
                } else if (current.equals(tail)) {
                    tail = previous;
                    tail.nextNode = null;
                } else {
                    previous.nextNode = current.nextNode;
                }
                size--;
                result = true;
                break;
            }
            previous = current;
            current = previous.nextNode;
        }
        return result;
    }

    public boolean contains(T element) {

        if (head == null) {
            return false;
        }
        if (head.element == element) {
            return true;
        }
        Node node = head;
        while (head.nextNode != null) {
            node = node.nextNode;

            if (node.element != element) {
                return false;
            }
        }
        return true;
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node<T> current = head;

        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T item = current.element;
            current = current.nextNode;
            return item;
        }

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}