package com.customertimes.oracle.part1.operators.hw;
/*
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
 */

public class SumDouble {
    public static void main(String[] args) {
        int tns = twoIntSum(2, 2);
        System.out.println(tns);

    }

    public static int twoIntSum(int a, int b) {
        int sum = 0;
        sum = a + b;
        if (a == b) {
            return sum += sum;
        } else {
            return sum;
        }
    }
}
