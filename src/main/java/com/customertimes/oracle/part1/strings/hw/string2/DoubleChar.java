package com.customertimes.oracle.part1.strings.hw.string2;

/*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class DoubleChar {
    public static String letsDoubleChar(String str) {
        String dva = "";
        String lit;
        for (int i = 0; i < str.length(); i++) {
            lit = str.substring(i, i+1) + str.substring(i, i+1);
            dva = dva + lit;
        }
        return dva;
    }

    public static void main(String[] args) {
        System.out.println(letsDoubleChar("sare"));

    }
}
