package com.customertimes.oracle.part1.operators_HW;

public class IntMax {
    public static void main(String[] args) {
        int max = threeMax(52, 53, 50);
        System.out.println(max);
    }

    public static int threeMax(int a, int b, int c) {
        if ((a > b) && (a > c)) {
            return a;
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }
}
