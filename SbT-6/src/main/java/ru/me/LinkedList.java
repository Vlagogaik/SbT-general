package ru.me;
public class LinkedList {
    private Node node;

    private class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node getNext(){
            return next;
        }
        public Object getObject(){
            return data;
        }
        public void setNext(){
            this.next = next;
        }
        public void setObject(){
            this.data = data;
        }
    }

    public void add(Object data) {
        Node newNode = new Node(data);
        newNode.next = node;
        node = newNode;
    }

    public boolean contains(Object data) {
        Node currentNode = node;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public boolean remove(Object data) {
        if (node == null) {
            return false;
        }

        if (node.data.equals(data)) {
            node = node.next;
            return true;
        }

        Node currentNode = node;
        while (currentNode.next != null) {
            if (currentNode.next.data.equals(data)) {
                currentNode.next = currentNode.next.next;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public int size() {
        int size = 0;
        Node currentNode = node;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = node;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
}

