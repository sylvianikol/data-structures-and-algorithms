package com.syn;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
        tree.insert(17);

        tree.traverseInOrder();

//        Node node = tree.get(22);
//        System.out.println(node == null ? "Not found!" : node.getData());
//
//        int min = tree.min();
//        System.out.println(min == Integer.MIN_VALUE ? "Tree is empty!" : min);
//
//        int max = tree.max();
//        System.out.println(max == Integer.MAX_VALUE ? "Tree is empty" : max);

        tree.delete(25);
        tree.traverseInOrder();
    }
}
