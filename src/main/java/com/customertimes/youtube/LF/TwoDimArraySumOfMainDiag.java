package com.customertimes.youtube.LF;

public class TwoDimArraySumOfMainDiag {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int sum = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
                System.out.print(arr[i][j] + " ");
                if ((i == j) && (arr[i][j] % 2 == 0)) {
                    k = j + 1;
                    sum += arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("sum of diag ell (krat 2):= " + sum);
    }
}
