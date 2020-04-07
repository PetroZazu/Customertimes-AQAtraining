package com.customertimes.oracle.part1.Arrays_Control_Flow_HW;

// Print numbers from 10 to 20 using all known cycles.

public class Task1 {
    public static void main(String[] args) {

        int i = 10;
        int k = 10;
        int j = 10;

        for (i = 10; i <= 20; i++) {
            if (i == 10) {
                System.out.println("'FOR'cycle:");
            }
            System.out.println(i);
        }

        System.out.println();

        while (k <= 20) {
            if (k == 10) {
                System.out.println("'WHILE'cycle:");
            }

            System.out.println(k);
            k++;
        }

        System.out.println();

        do {
            if (j == 10) {
                System.out.println("'DO WHILE'cycle:");
            }
            System.out.println(j);
            j++;
        }
        while (j <= 20);
    }
}