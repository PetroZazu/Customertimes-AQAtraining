package com.customertimes.oracle.part1.arrays.control.flow.hw;

/*
Print all the numbers from 1 to 100
which are divided by 3 without a remainder.
 */

public class Task2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Divided by 3: ----->" + i);
            }
            else
                System.out.println("Not divided by 3 without reminder: ------> " + i);
        }
    }
}
