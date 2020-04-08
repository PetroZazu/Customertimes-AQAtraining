package com.customertimes.youtube.training;

public class TwoDimArrayWithCountOfRowsContainsZero {
    public static void main(String[] args) {
        int min = -4;
        int max = 4;
        int count = 0;
        int[][] mas = new int[5][5];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.round(Math.random() * 10));
                System.out.print(mas[i][j] + " ");
                if (mas[i][j] == 0) {
                    count++;
                    j = mas[i].length;
                }
            }
            System.out.println();
        }
        System.out.println("count of zero rows= " + count);
    }
}
