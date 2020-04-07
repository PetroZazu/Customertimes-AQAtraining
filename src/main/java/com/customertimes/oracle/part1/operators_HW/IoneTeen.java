package com.customertimes.oracle.part1.operators_HW;

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive
Given 2 int values
return true if one or the other is teen, but not both.

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
*/
public class IoneTeen {
    public static boolean teenOrNotTheTeenOne(int a, int b) {
        boolean ax = ((a >= 13) && (a <= 19));
        boolean bx = ((b >= 13) && (b <= 19));

        if (ax && bx) {
            return false;
        }

        if (ax || bx) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean tf = teenOrNotTheTeenOne(19, 19);
        System.out.println(tf);
    }
}
