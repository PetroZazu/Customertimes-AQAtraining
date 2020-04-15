package com.customertimes.oracle.part1.strings.hw;

/*
Given two strings,
append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char,
then omit one of the chars, so "abc" and "cat" yields "abcat".

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
 */
public class ConCat {
    public static String catCon(String a, String b) {
        /*String ax = "";
        String bx = "";

        if (a.length() > 1) {
            ax = a.substring(a.length() - 2);
        } else {
            ax = a;
        }

        if (b.length() > 1) {
            bx = b.substring(0, 2);
        } else {
            bx = b;
        }*/

        if ((a.length() >= 1) && (b.length() >= 1)) {
            if ((a.substring(a.length() - 1)).equals(b.substring(0, 1))) {
                return a.substring(0, a.length() - 1) + b;
            }
            return a + b;
        }

        if ((a.length() == 0) && (b.length() > 0)) {
            return b;
        }

        if ((b.length() == 0) && (a.length() > 0)) {
            return a;
        }

        return "";


    }


    public static void main(String[] args) {
        System.out.println(catCon("asdasdasfsdqweqwed", "dgregrgrtgrtgrtgrtgrtgrtgrtgrtgrtg"));
    }
}