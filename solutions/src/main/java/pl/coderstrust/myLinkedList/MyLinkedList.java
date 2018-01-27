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
        if (head == null) {
            return true;
        }

        Node<T> previousNode = null;
        Node<T> currentNode = head;
        while (currentNode != null && currentNode.element != element) {
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }
        if (previousNode == null) {
            head = head.nextNode;
            return true;
        }
        if (currentNode == null) {
            System.out.println("A node with that value does not exist.");
            return false;
        }
        previousNode.nextNode = currentNode.nextNode;
        return true;
    }

    public boolean contains(T element) {
        Node<T> current = head;
        while (current != null) {
            if (current.element.equals(element)) {
                return true;
            } else {
                current = current.nextNode;
            }
        }
        return false;
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