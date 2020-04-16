package com.customertimes.oracle.part1.strings.hw.string1;

import java.awt.*;

/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */
public class WithoutX {
    public static String gdeMyIks(String str) {
        if (str.equals("x") || str.equals("")) {
            return "";
        } else {
            if (str.substring(0, 1).equals("x")) {
                str = str.substring(1);
            }
            if (str.substring(str.length() - 1).equals("x")) {
                str = str.substring(0, str.length() - 1);
            }
            return str;
        }
    }

    public static void main(String[] args) {
        System.out.println(gdeMyIks("s"));
    }
}
