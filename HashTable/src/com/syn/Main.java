package com.syn;

public class Main {

    public static void main(String[] args) {

        Employee jane = new Employee("Jane", 1);
        Employee bob = new Employee("Bob", 2);
        Employee alice = new Employee("Alice", 3);
        Employee john = new Employee("John", 4);
        Employee mike = new Employee("Mike", 5);

        SimpleHashTable hashTable = new SimpleHashTable();

        hashTable.put("Jane", jane);
        hashTable.put("Bob", bob);
        hashTable.put("Alice", alice);
        hashTable.put("John", john);

        System.out.println("-".repeat(10));
//        hashTable.print();
//        System.out.println(hashTable.get("John"));
        System.out.println(hashTable.remove("Bob"));
        System.out.println("-".repeat(10));
        hashTable.print();
    }
}
