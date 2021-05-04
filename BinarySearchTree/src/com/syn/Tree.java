package com.syn;

public class Tree {

    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.insert(value);
        }
    }

    public Node get(int value) {
        if (root != null) {
            return root.get(value);
        }

        return null;
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
        System.out.println();
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        return root.min();
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        return root.max();
    }
}
