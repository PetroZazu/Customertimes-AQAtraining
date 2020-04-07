package com.customertimes.oracle.part1.operators_HW;

/*
Return true if the given non-negative number is a multiple of 3 or a multiple of 5
Use the % "mod" operator

or35(3) → true
or35(10) → true
or35(8) → false
 */
public class Or35 {
    public static boolean multiple(int n) {
        if (((n % 3) == 0) || ((n % 5) == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean tf = multiple(8);
        System.out.println(tf);
    }
}
