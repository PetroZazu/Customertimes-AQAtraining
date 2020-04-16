package com.customertimes.oracle.part1.strings.hw.string1;

/*
Given a string,
return a new string made of 3 copies of the first 2 chars of the original string.
The string may be any length. If there are fewer than 2 chars, use whatever is there.


extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
 */
public class ExtraFront {
    public static String tripleCombo(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            String a = str.substring(0, 2);
            return a + a + a;
        }
    }

    public static void main(String[] args) {
        System.out.println(tripleCombo("/"));
    }
}
