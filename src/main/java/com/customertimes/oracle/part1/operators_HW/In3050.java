package com.customertimes.oracle.part1.operators_HW;

/*
Given 2 int values
return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
 */

public class In3050 {
    public static void main(String[] args) {
        boolean tf = tfOrNottf(30, 40);
        System.out.println(tf);
        System.out.println();
    }
    public static boolean tfOrNottf(int a, int b) {
        if (((a >= 30) && (a <= 40) && (b >= 30) && (b <= 40)) || ((a >= 40) && (a <= 50) && (b >= 40) && (b <= 50))) {
            return true;
        } else {
            return false;
        }
    }

}