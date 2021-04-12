package com.syn;

import java.util.Arrays;

public class SimpleHashTable {

    private Employee[] hashTable;

    public SimpleHashTable() {
        this.hashTable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int index = hash(key);
        if (isOccupied(index)) {
            int stopIndex = index;

            if (index == hashTable.length - 1) {
                index = 0;
            } else {
                index++;
            }

            while (isOccupied(index) && index != stopIndex) {
                index = (index + 1) % hashTable.length;
            }
        }
        if (isOccupied(index)) {
            System.out.println("Collision with employee at index " + index);
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

    private boolean isOccupied(int index) {
        return hashTable[index] != null;
    }

    public void print() {
        Arrays.stream(hashTable).forEach(System.out::println);
    }
}
