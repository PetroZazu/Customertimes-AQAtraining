package com.customertimes.oracle.part1.operators_HW;

/*

Given 2 int values, return true if either of them is in the range 10..20 inclusive.


in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false

 */

public class In1020 {
    public static void main(String[] args) {
        boolean tf = returnTrueIf10to20inc(8, 99);
        System.out.println(tf);

    }

    public static boolean returnTrueIf10to20inc(int a, int b) {
        if (((a >= 10) && (a <= 20)) || ((b >= 10) && (b <= 20))) {
            return true;
        } else {
            return false;
        }
    }
}
