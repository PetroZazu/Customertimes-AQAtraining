package com.customertimes.oracle.part1.strings.hw.string2;

public class CatDog {
    public static Boolean catAndDog(String str) {
        int c = 0;
        int d = 0;
        //if (str.equals("dog") || str.equals("cat")) {
         //   return false;
        //}
        //if (str.length() <= 3) {
          //  return true;
        //}

        for (int i = 0; i < str.length() - 2; i++) {

            if (str.substring(i, i + 3).equals("cat")) {
                c++;
            }

            if (str.substring(i, i + 3).equals("dog")) {
                d++;
            }
        }

        if (d == c) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(catAndDog("cat"));
    }

}

