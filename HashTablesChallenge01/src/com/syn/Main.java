package com.syn;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // remove duplicates from linkedlist using hashmap

        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", 123));
        employees.add(new Employee("John", 5678));
        employees.add(new Employee("Mike", 45));
        employees.add(new Employee("Mary", 5555));
        employees.add(new Employee("John", 5678));
        employees.add(new Employee("Bill", 3948));
        employees.add(new Employee("Jane", 123));

        employees.forEach(System.out::println);

        Map<String, Employee> uniqueEmployees = new HashMap<>();
        List<Employee> duplicates = new LinkedList<>();

        for (Employee employee : employees) {
            String employeeName = employee.getName();
            if (uniqueEmployees.containsKey(employeeName)) {
                duplicates.add(employee);
            } else {
                uniqueEmployees.put(employeeName, employee);
            }
        }

        employees.removeAll(duplicates);
        System.out.println("-".repeat(10));
        employees.forEach(System.out::println);
        // implement hash() method
//        int[] nums = new int[10];
//        int[] numsToAdd = { 59282, 43, 6894, 500, 99, -58 };
//
//        for (int num : numsToAdd) {
//            int index = hash(num);
//            nums[index] = num;
//        }
//
//        print(nums);
    }

    private static int hash(int value) {
        return Math.abs(value % 10);
    }

    private static void print(int[] array) {
        Arrays.stream(array).forEach(v -> System.out.print(v + " "));
    }
}
