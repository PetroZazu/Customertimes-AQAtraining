package com.customertimes.oracle.part1.arrays.control.flow.hw;

// Fill the array with numbers from 100 to 0.

public class Task3 {
    public static void main(String[] args) {
        int arr[] = new int[101];
        for (int i = 100; i >= 0; i--) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }
}
