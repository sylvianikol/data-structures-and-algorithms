package com.syn;

import java.util.Arrays;
import java.util.Objects;

public class SimpleHashTable {

    private EmployeeEntry[] hashTable;

    public SimpleHashTable() {
        this.hashTable = new EmployeeEntry[10];
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
            hashTable[index] = new EmployeeEntry(key, employee);
        }
    }

    public Employee get(String key) {
        int index = findIndex(key);
        if (index == -1) {
            return null;
        }
        return hashTable[index].employee;
    }

    public Employee remove(String key) {
        int index = findIndex(key);
        if (index == -1) {
            return null;
        }
        Employee employee = hashTable[index].employee;
        hashTable[index] = null;
        return employee;
    }

    private int findIndex(String key) {
        int index = hash(key);
        if (hashTable[index] != null && hashTable[index].key.equals(key)) {
            return index;
        }

        int stopIndex = index;

        if (index == hashTable.length - 1) {
            index = 0;
        } else {
            index++;
        }

        while (index != stopIndex
                && hashTable[index] != null && !hashTable[index].key.equals(key)) {
            index = (index + 1) % hashTable.length;
        }

        if (stopIndex == index) {
            return -1;
        }

        return index;
    }

    private int hash(String key) {
        return key.length() % hashTable.length;
    }

    private boolean isOccupied(int index) {
        return hashTable[index] != null;
    }

    public void print() {
        Arrays.stream(hashTable)
                .forEach(e -> System.out.println(e == null ? "empty" : e.employee));
    }
}
