package ru.me;

import java.util.*;

public class GLinkedList<T> {

    private Node<T> node;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public GLinkedList() {
        node = null;
        size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = node;
        node = newNode;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = node;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            node = node.next;
        } else {
            Node<T> current = node;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public int size() {
        return size;
    }


}

