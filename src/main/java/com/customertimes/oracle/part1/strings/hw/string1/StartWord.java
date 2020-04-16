package com.customertimes.oracle.part1.strings.hw.string1;

/*
Given a string and a second "word" string,
we'll say that the word matches the string if it appears at the front of the string,
except its first char does not need to match exactly.
On a match, return the front of the string, or otherwise return the empty string.
So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.



startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
startWord("hippo", "ix") → ""
startWord("h", "ix") → ""
startWord("", "i") → ""
startWord("hip", "zi") → "hi"
startWord("hip", "zip") → "hip"
startWord("hip", "zig") → ""
startWord("h", "z") → "h"
startWord("hippo", "xippo") → "hippo"
startWord("hippo", "xyz") → ""
startWord("hippo", "hip") → "hip"
startWord("kitten", "cit") → "kit"
startWord("kit", "cit") → "kit"

 */
public class StartWord {
    public static String startWord2(String str, String word) {
        if ((str.length() < word.length()) || (str.length() == 1 && word.length() == 0)) {
            return "Kabinabokom";
        }

        if (str.length() == 1 && word.length() == 1) {
            return str;
        }

        if ((str.substring(1, word.length())).equals(word.substring(1))) {
            return str.substring(0, word.length());
        }

        return "pizdaRulu";
    }

    public static void main(String[] args) {
        System.out.println(startWord2("h", "s"));
    }
}
