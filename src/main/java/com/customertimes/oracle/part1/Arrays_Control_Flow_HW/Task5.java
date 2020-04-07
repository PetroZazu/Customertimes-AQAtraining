package com.customertimes.oracle.part1.Arrays_Control_Flow_HW;
/*
Write a function which calculates and returns the minimum of 4 arguments.

public static void main(String[] args) {
        // write your code here
}

public static int min(int a, int b, int c, int d) {

}

public static int min(int a, int b) {

}

Requirements:
- Function min(int a, int b, int c, int d) should use the function
min(int a, int b).
5 4 1 2
a b c d


 */

public class Task5 {
    public static void main(String[] args) {
        int a = 33;
        int b = 44;
        int c = 22;
        int d = 1;

        int m = min(a, b, c, d);
        System.out.println("min: " + m);

    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b, int c, int d) {
        int x = min(a, b);
        int y = 0;

        if (c < d) {
            y = c;
        } else {
            y = d;
        }

        if (x > y) {
            return y;
        } else {
            return x;
        }
    }

}