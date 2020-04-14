package com.customertimes.oracle.part1.strings.hw;

/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
such as with "badxxx" or "xbadxx" but not "xxbadxx".
The string may be any length, including 0. Note: use .equals() to compare 2 strings.

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
 */
public class hasBad {
    public static Boolean badButLittleBitgood(String str) {
       /* if (str.length() >= 3) {
            if (str.substring(0, 3).equals("bad")) {
                return true;
            }
        }
        if (str.length() >= 4) {
            if (str.substring(0, 4).equals("xbad")) {
                return true;
            }
        }
        return false;*/

        if ((str.length() == 3) && (str.substring(0, 3).contains("bad"))) {
            return true;
        }

        if ((str.length() >= 4) && (str.substring(0, 4).contains("bad"))) {
            return true;
        }

        //if ((str.length() >= 4) && (str.substring(1, 4).equals("bad"))) {//return true;
        //}
        return false;

    }

    public static void main(String[] args) {
        System.out.println(badButLittleBitgood("xbad))))haha"));
    }
}
