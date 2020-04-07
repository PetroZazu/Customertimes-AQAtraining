package com.customertimes.oracle.part1.operators_HW;

/*
Given two non-negative int values
return true if they have the same last digit
such as with 27 and 57.
Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */
public class lastDigit {
    public static boolean twoIntAndLastdigits(int a, int b) {
        a %= 10;
        b %= 10;
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean tf = twoIntAndLastdigits(46, 35);
        System.out.println(tf);
    }
}
