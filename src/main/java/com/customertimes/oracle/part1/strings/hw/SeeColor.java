package com.customertimes.oracle.part1.strings.hw;

/*
Given a string,
if the string begins with "red" or "blue" return that color string,
otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
 */
public class SeeColor {
    public static String methodThatReturnDependsOnColor(String str) {
        if ((str.length() > 2) && "red".equals(str.substring(0, 3))) {
            return "red";
        }

        if ((str.length() > 3) && "blue".equals(str.substring(0, 4))) {
            return "blue";
        }

        return "";

        /*if (str.startsWith("blue")) {
            return "blue";
        }

        if (str.startsWith("red")) {
            return "red";
        }

        return "";*/
    }

    public static void main(String[] args) {
        System.out.println(methodThatReturnDependsOnColor("bluebla"));
    }

}
