package com.syn;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<EmployeeNode>[] hashTable;

    public ChainedHashTable() {
        this.hashTable = new LinkedList[10];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<>();
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

        int listIndex = -1;
        while (iter.hasNext()) {
            node = iter.next();
            listIndex++;
            if (node.key.equals(key)) {
               break;
            }
        }

        if (node == null || !node.key.equals(key)) {
            return null;
        } else {
            hashTable[index].remove(listIndex);
            return node.employee;
        }
    }

    private int hash(String key) {
//        return key.length() % hashTable.length;

        return Math.abs(key.hashCode() % hashTable.length);
    }

    public void print() {
        for (LinkedList<EmployeeNode> entry : hashTable) {
            if (entry.isEmpty()) {
                System.out.println("empty");
            }

            for (EmployeeNode employeeNode : entry) {
                System.out.println(employeeNode.employee);
            }
        }
    }
}
