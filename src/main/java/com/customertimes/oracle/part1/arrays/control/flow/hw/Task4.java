package com.customertimes.oracle.part1.arrays.control.flow.hw;

// Given an array of 10 integers. To display the sum of all its elements except the first and last.

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = k;
            if ((i == 0) || (i == (arr.length - 1))) {
            }
            else {
                sum += arr[i];
                System.out.println(arr[i]);
            }
          k++;
        }
        System.out.println("sum: " + sum);
    }
}
