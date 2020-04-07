package com.customertimes.oracle.part1.operators_HW;
/*
Given 2 int values
return whichever value is nearest to the value 10, or return 0 in the event of a tie.
Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */
public class Close10 {
    //public static int closeTwoNumbersTo10(int a, int b) {
       // int ax = Math.abs(a);
        //int bx = Math.abs(b);
//}

    public static void main(String[] args) {
        int a = -9999;
        int b = -10000;

        System.out.println(returnCloserTonumber10(a,b));
    }

    public static int returnCloserTonumber10(int a, int b) {
        int ax = 0;
        int bx = 0;

        ax = a - 40; // = -10;  Math.abs(a - 40) = 10
        if (ax <= 0) {
            ax *= -1;
        }

        bx = b - 40; // = -21;  Math.abs(b - 40) = 19
        if (bx <= 0) {
            bx *= -1;
        }


        if (ax < bx) {
            return a;
        }
        if (bx < ax) {
            return b;
        }
        return 0;
    }
}
