package com.customertimes.oracle.part1.strings.hw.string1;

/*
Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.


withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
 */
public class WithouEnd2 {
    public static String withouEnd27(String str) {
        /*if (str.length() <= 2 && str.length() >=0) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }*/
        if (str.length() > 2) {
            return str.substring(1, str.length() - 1);
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        System.out.println(withouEnd27("qw3sasdasdasdasdasdasd"));
    }
}
