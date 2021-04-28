package com.syn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] array = { 54, 46, 83, 66, 95, 92, 43 };
        bucketSort(array);
        print(array);
    }

    private static void bucketSort(int[] array) {
        List<Integer>[] buckets = createBucketArray(10);

        fillBucketArray(array, buckets);
        sortBuckets(buckets);
        sortArray(array, buckets);
    }

    private static void sortArray(int[] array, List<Integer>[] buckets) {
        int j = 0;
        for (List<Integer> bucket : buckets) {
            for (Integer value : bucket) {
                array[j++] = value;
            }
        }
    }

    private static void sortBuckets(List<Integer>[] buckets) {
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
    }

    private static void fillBucketArray(int[] array, List<Integer>[] buckets) {
        for (int value : array) {
            int index = hash(value);
            buckets[index].add(value);
        }
    }

    private static int hash(int value) {
        return value / 10;
    }

    private static List<Integer>[] createBucketArray(int size) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        return buckets;
    }

    private static void print(int[] array) {
        Arrays.stream(array).forEach(v -> System.out.print(v + " "));
    }
}
