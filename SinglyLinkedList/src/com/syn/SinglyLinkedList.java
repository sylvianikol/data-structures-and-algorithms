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

    public void insertSorted(int data) {

        if (isEmpty() || head.getData() >= data) {
            addToFront(data);
            return;
        }

        Node node = new Node(data);
        Node current = head.getNext();
        Node prev = head;

        while (current != null) {
            if (current.getData() >= data) {
                prev.setNext(node);
                node.setNext(current);
                size++;
                return;
            }
            current = current.getNext();
            prev = prev.getNext();
        }

        prev.setNext(node);
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
