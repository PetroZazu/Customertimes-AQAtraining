package com.customertimes.oracle.part1.strings.hw;

/*
Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.


nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
 */
public class NTwice {
    public static String nichose(String str, int n) {
        if (n <= str.length()) {
            return str.substring(0, n) + str.substring(str.length() - n);
        } else {
            return "pridurkanama, n > str.length!!!";
        }
    }

    public static void main(String[] args) {
        System.out.println(nichose("Hello", 6));
    }
}
