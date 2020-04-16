package com.customertimes.oracle.part1.strings.hw.string2;

/*
Return the number of times that the string "hi" appears anywhere in the given string.


countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */
public class CountHi {
    public static int letCountHi(String str) {
        int k = 0;
        String b = "";
        for (int i = 0; i < str.length() - 1; i++) {
               b = str.substring(i, i + 1) + str.substring(i + 1, i + 2);
               if (b.equals("hi")){
                k++;
            }
            }
        return k;
        }


    public static void main(String[] args) {
        System.out.println(letCountHi("hi"));
    }
}
