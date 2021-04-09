package com.syn;

public class SinglyLinkedList {

    private Node head;
    private int size;

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToFront(int data) {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
        ++size;
    }

    public boolean insertSorted(int data) {
        if (isEmpty()) {
            addToFront(data);
            return true;
        }

        Node node = new Node(data);
        Node current = head;

        while (current != null) {
            if (node.getData() >= current.getData()) {
                if (current.getNext() != null) {
                    node.setNext(current.getNext());
                }
                current.setNext(node);

                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public Node removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        Node node = head;
        head = head.getNext();
        node.setNext(null);
        --size;
        return node;
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }
}
