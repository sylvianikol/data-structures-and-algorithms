package com.syn;

import java.util.Arrays;

public class SimpleHashTable {

    private Employee[] hashTable;

    public SimpleHashTable() {
        this.hashTable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int index = hash(key);
        if (hashTable[index] != null) {
            System.out.println("Collision at index " + index);
        } else {
            hashTable[index] = employee;
        }
    }

    public Employee get(String key) {
        int index = hash(key);
        return hashTable[index];
    }

    private int hash(String key) {
        return key.length() % hashTable.length;
    }

    public void print() {
        Arrays.stream(hashTable).forEach(System.out::println);
    }
}
