package com.customertimes.oracle.part1.strings.hw.string1;
/*
Given a string
return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back.
The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
 */
public class TheEnd {
    public static String oneInTheBeginingOrOneInTheEnd(String str, boolean front){
        String a = front ? str.substring(0, 1) : str.substring(str.length()-1);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(oneInTheBeginingOrOneInTheEnd("NeHapay", false));
    }
}
