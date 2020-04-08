package com.customertimes.oracle.part1.freeexamples;

public class PostfixPrefix {
    public static void main (String [] args){
        int a = 2;
        int b = 3;
        int z = 200;

        int res = ((a + b++ - --a) * (++b - a--)) + a + b - a-- + ++a;
            /*
                a + b++ - --a
                2 + 3 (b=4) - 1 (a=1) = 4
                *
                ++b - a--
                5 (b=5) - 1 (a=0) = 4
                +
                a = 0
                +
                b = 5
                -
                a-- (a=-1) = 0
                +
                a++ = 0
                = 21

             */
        System.out.println("result= " + res);
    }
}

