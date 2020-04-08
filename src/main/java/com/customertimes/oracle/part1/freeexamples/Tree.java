package com.customertimes.oracle.part1.freeexamples;

/*
Write a program which prints the next figure to the console:
          *
         ***
        *****
       *******
      *********
     ***********
 */
public class Tree {
    public static void main(String[] args) {
        int h = 200;
        int l = h*2-1;
        String a = "*";
        String b = " ";

        int k = (l / 2) + 1;// k = 6
        int k2 = k;

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                if (j < k || j > k2) {
                    System.out.print(b);
                } else {
                    System.out.print(a);
                }
            }
            k--;
            k2++;
            System.out.println();
        }
    }
}


