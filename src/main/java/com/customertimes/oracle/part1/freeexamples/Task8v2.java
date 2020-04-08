package com.customertimes.oracle.part1.freeexamples;

/*

Write a program which prints the next figure to the console:

**********
**********
**********
**********

 */
public class Task8v2 {
    public static void main(String[] args) {


        String x = "*";
        int h = 4;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
