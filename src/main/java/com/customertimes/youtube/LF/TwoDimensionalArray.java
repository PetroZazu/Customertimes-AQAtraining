package com.customertimes.youtube.LF;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j += 2) {
                arr[i][j] = (i + 1) * (j + 1);
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("sum= " + sum);
        }
    }

}
