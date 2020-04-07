package com.customertimes.oracle.part1.Arrays_Control_Flow_HW;
/*
Write a method named getEvenDigitSum with one parameter of the type "int".
The method should return the sum of even digits within the number.
If the number is negative, method should return -1;
 */
public class Task6 {
    public static void main(String[] args) {
        int a = -27;
        int res = 0;
        Digits Dig = new Digits();
        res = Digits.getEvenDigitSum(a);
        System.out.println(res);
    }



}
