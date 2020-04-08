package com.customertimes.oracle.part1.expressions.stat.blocks;

public class TernOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        /*
        if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }*/

        System.out.println(a > b ? a : b);
    }

}
