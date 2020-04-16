package com.customertimes.oracle.part1.strings.hw.string1;

/*
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
 */
public class FrontAgain {
    public static boolean frontAgainr1r2(String str) {
        if (str.length() < 2) {
            return false;
        }

        if ((str.substring(0, 2)).equals(str.substring(str.length() - 2))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
