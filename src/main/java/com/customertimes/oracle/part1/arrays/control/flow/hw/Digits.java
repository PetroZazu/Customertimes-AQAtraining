package com.customertimes.oracle.part1.arrays.control.flow.hw;

public class Digits {
    public static int getEvenDigitSum(int a) {
        int sum = 0;
        int cuf = 0;
        if (a < 0) {
            return -1;
        }
        while (a > 0) {
            cuf = a % 10;
            a /= 10;
            if ((cuf % 2) == 0) {
                sum = cuf + sum;
            }
        }
        return sum;
    }

}
