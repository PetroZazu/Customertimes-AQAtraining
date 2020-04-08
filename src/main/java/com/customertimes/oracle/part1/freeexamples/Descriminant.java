package com.customertimes.oracle.part1.freeexamples;

import java.util.Scanner;

public class Descriminant {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double x1 = 0;
        double x2 = 0;
        double d;

        //ax^2+bx+c=0
        System.out.println("input the a");
        int a = in.nextInt();
        System.out.println("input the b");
        int b = in.nextInt();
        System.out.println("input the c");
        int c = in.nextInt();

        d = (b * b) - (4 * a * c);
        double sq = Math.sqrt(d);

        if (d>0) {
            x1 = (-b + sq) / (2 * a);
            x2 = (-b - sq) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else {
            System.out.println("D < 0");
        }














    }
}
