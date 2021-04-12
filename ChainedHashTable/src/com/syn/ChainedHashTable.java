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

    public Employee remove(String key) {
        int index = hash(key);
        ListIterator<EmployeeNode> iter = hashTable[index].listIterator();
        EmployeeNode node = null;

        int listIndex = 0;
        while (iter.hasNext()) {
            node = iter.next();
            listIndex++;
            if (node.key.equals(key)) {
               break;
            }
        }

        if (node == null || !node.key.equals(key)) {
            return null;
        }

        hashTable[index].remove(listIndex);
        return node.employee;
    }

    private int hash(String key) {
        return key.length() % hashTable.length;
    }
}
