package com.customertimes.oracle.part1.arrays.control.flow.hw;

/*
Write a program which prints the next figure to the console:

**********
*        *
*        *
*        *
**********


 */

public class Task10 {
    public static void main(String[] args) {
        String[][] mas = new String[20][20];
        String a = "*";
        String b = " ";
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = a;
                if ((i > 0) && (i < (mas.length - 1))) {
                    if ((j > 0) && (j < (mas[i].length - 1))) {
                        mas[i][j] = b;
                    } else {
                        mas[i][j] = a;
                    }
                }
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
    }
}
