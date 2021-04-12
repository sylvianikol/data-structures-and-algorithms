package com.syn;

import java.util.LinkedList;

public class ChainedHashTable {

    private LinkedList<EmployeeNode>[] hashTable;

    public ChainedHashTable() {
        this.hashTable = new LinkedList[10];
        for (LinkedList<EmployeeNode> list : hashTable) {
            list = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee) {
        int index = hash(key);
        hashTable[index].add(new EmployeeNode(key, employee));
    }

    private int hash(String key) {
        return key.length() % hashTable.length;
    }
}
