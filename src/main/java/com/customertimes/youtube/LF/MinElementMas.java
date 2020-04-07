package com.customertimes.youtube.LF;

public class MinElementMas {
    public static void main(String[] args) {
        int[] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round(Math.random() * 10);
            System.out.print(mas[i] + " ");
        }
        int min1 = mas[0];
        int min2 = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min1) {
                min2 = min1;
                min1 = mas[i];
            }
        }
        System.out.println();
        System.out.println("min= " + min1 + " second min=" + min2);
        System.out.println();
    }
}
