package com.customertimes.oracle.part1.strings.hw;
/*
Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
 */
public class EndsLy {
    public static Boolean twoCharsFromTheEndLy(String str){
        //str.substring(str.length()-2) == "ly" ? return true : return false;
        if (str.length() < 2){
            
        }
        if ((str.substring(str.length()-2)).equals("ly")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(twoCharsFromTheEndLy("Bruslys"));
    }
}
