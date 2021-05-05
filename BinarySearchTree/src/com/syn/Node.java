package com.syn;

public class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public Node get(int value) {
        if (value == data) {
            return this;
        }

        if (value < data) {
            if (left != null) {
                return left.get(value);
            }
        } else {
            if (right != null) {
                return right.get(value);
            }
        }

        return null;
    }

    public int min() {
        if (left == null) {
            return data;
        }

        return left.min();
    }

    public int max() {
        if (right == null) {
            return data;
        }

        return right.max();
    }

    public void traverseInOrder() {
        // left -> root -> right
        if (left != null) {
            left.traverseInOrder();
        }

        System.out.print(data + " ");

        if (right != null) {
            right.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        // root -> left -> right
        System.out.print(data + " ");

        if (left != null) {
            left.traversePreOrder();
        }

        if (right != null) {
            right.traversePreOrder();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
