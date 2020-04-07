package com.customertimes.oracle.part1.operators_HW;

/*
Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.


makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
 */

public class Makes10 {
    public static void main(String[] args) {
        boolean tf = m10(9, 9);
        System.out.println(tf);
    }

    public static boolean m10(int a, int b) {
        int sum = a + b;
        if (sum == 10 || a == 10 || b == 10) {
            return true;
        } else {
            return false;
        }
    }
}
