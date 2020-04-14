package com.customertimes.oracle.part1.strings.hw;

/*
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.


left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
 */
public class Left2 {
    public static String leftTwo(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public static void main(String[] args) {
        System.out.println(leftTwo("java"));
    }
}
