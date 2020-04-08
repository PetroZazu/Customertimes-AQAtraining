package com.customertimes.youtube.training;

public class MultDimArrayGame {
    public static void main(String[] args) {
        double s = 0;
        int[][] lotto = {
                {2, 53, 32, 17, 43, 5},
                {44, 12, 39, 1, 6, 50},
                {17, 9, 8, 44, 19, 27},
                {54, 3, 29, 20, 4, 11},
                {26, 54, 4, 37, 41, 8},
                {12, 8, 47, 5, 23, 26},
                {51, 30, 9, 20, 42, 15}
        };
        for (int i = 0; i < lotto.length; i++) {
            int m = 0;
            for (int j = 0; j < lotto[i].length; j++) {
                m += lotto[i][j];
                System.out.println(m);
                if (j == (lotto[i].length - 1)) {
                    s = m / lotto[i].length;
                    System.out.println("ser arf  " + i + " go riadka = " + s);
                }
            }
        }
    }
}
