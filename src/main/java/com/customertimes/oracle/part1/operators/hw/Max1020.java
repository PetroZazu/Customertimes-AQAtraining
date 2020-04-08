package com.customertimes.oracle.part1.operators.hw;

/*
Given 2 positive int values
return the larger value that is in the range 10..20 inclusive
or return 0 if neither is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */

public class Max1020 {
    public static void main(String[] args) {
        int s = twoNumbersMax(9, 13);
        System.out.println(s);
    }

    public static int twoNumbersMax(int a, int b) {

        if ((a >= 10) && (a <= 20) && (b >= 10) && (b <= 20)) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }

        if (((a < 10) || (a > 20)) && ((b >= 10) && (b <= 20))) {
            return b;
        }

        if (((b < 10) || (b > 20)) && ((a >= 10) && (a <= 20))) {
            return a;
        }

        return 0;
    }
}

/*if (((a < 10) || (a > 20)) && ((b >= 10) && (b <= 20))) {
            return b;
        } else {
            if (((b < 10) || (b > 20)) && ((a >= 10) && (a <= 20))) {
                return a;
            } else {
                return 0;
            }
        }*/


