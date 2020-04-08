package com.customertimes.oracle.part1.arrays.control.flow.hw;

/*

Write a program which prints the next figure to the console:
**********
**********
**********
**********


 */

public class Task8 {
    public static void main(String[] args) {
        String[][] arr = new String[4][5];// обявляємо двовимірний масив стрінгів
        String a = "*";

        for (int i = 0; i < arr.length; i++) { // перечислюємо кожен елемент
            for (int j = 0; j < arr[i].length; j++) { // присвоюємо кожному елементу зірочку
                arr[i][j] = a;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
