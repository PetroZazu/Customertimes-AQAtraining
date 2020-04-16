package com.customertimes.oracle.part1.strings.hw.string1;
/*
Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
 */
public class WithoutEnd {
    public static String WithoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(WithoutEnd("GamakDurak"));
    }
}
