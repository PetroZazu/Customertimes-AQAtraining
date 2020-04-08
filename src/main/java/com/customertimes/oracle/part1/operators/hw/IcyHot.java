package com.customertimes.oracle.part1.operators.hw;
/*
Given two temperatures
return true if one is less than 0 and the other is greater than 100


icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
*/

public class IcyHot {
    public static boolean hotOrNotHot(int temp1, int temp2) {
        if (((temp1 < 0) || (temp2 < 0)) && ((temp1 > 100) || (temp2 > 100))){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean tf = hotOrNotHot(120, 2);
        System.out.println(tf);
        System.out.println();
        System.out.println(); //2222
    }
}
