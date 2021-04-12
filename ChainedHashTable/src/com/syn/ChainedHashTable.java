package com.syn;

import java.util.LinkedList;
import java.util.ListIterator;

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

    public Employee get(String key) {
        int index = hash(key);
        ListIterator<EmployeeNode> iter = hashTable[index].listIterator();
        EmployeeNode node;

        while (iter.hasNext()) {
            node = iter.next();
            if (node.key.equals(key)) {
                return node.employee;
            }
        }

        return null;
    }

    private int hash(String key) {
        return key.length() % hashTable.length;
    }
}
