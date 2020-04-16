package com.customertimes.oracle.part1.strings.hw.string1;
/*

Given 2 strings
return their concatenation, except omit the first char of each. The strings will be at least length 1.

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
 */
public class NonStart {
    public static String withouFirtsWordConc(String a, String b){
        return a.substring(1) + b.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(withouFirtsWordConc("Hello", "Java:)"));
    }
}
