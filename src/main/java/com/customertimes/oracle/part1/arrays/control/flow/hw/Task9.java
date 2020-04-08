package com.customertimes.oracle.part1.arrays.control.flow.hw;

/*

 Write a program which prints the next figure to the console:
*
**
***
****
*****
******
*******

 */
public class Task9 {
    public static void main(String[] args) {
        String[][] arr = new String[100][100];
        String a = "*";
        //int k = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                //System.out.print(a);
                arr[i][j] = a;
                System.out.print(arr[i][j]);
            }
            System.out.println();
           // k++;
        }

    }
}
