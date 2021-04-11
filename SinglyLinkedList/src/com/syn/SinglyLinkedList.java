package com.syn;

import java.util.EmptyStackException;

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

        Node current = head.getNext();
        Node prev = head;

        while (current != null && current.getData() < data) {
            prev = current;
            current = current.getNext();
        }

        Node node = new Node(data);
        prev.setNext(node);
        node.setNext(current);
        size++;
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

    public Node getMiddle() {
        if (isEmpty()) {
            return null;
        }

        if (size == 1 || size == 2) {
            return head;
        }

        Node slow = head;
        Node fast = head.getNext();

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow;
    }

    public boolean isCircular() {
        if (isEmpty() || size == 1) {
            return false;
        }

        Node slow = head;
        Node fast = head.getNext();

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (fast.equals(slow)) {
                return true;
            }
        }

        return false;
    }

    public Node get(int data) {
        Node current = head;
        while (current != null) {
            if (current.getData() == data) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }
}
