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

    public void delete(int value) {
        root = delete(root, value);
    }

    private Node delete(Node node, int value) {
        if (node == null) {
            return node;
        }

        if (value < node.getData()) {
            node.setLeft(delete(node.getLeft(), value));
        } else if (value > node.getData()) {
            node.setRight(delete(node.getRight(), value));
        } else {
            if (node.getLeft() == null) {
                return node.getRight();
            } else if (node.getRight() == null) {
                return node.getLeft();
            }
        }

        return node;
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
