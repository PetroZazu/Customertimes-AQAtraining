package com.customertimes.youtube.training;

public class SumOfElementsKratne2vMas {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int sum = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round(Math.random() * 100);
            if (mas[i] % 2 == 0) {
                sum += mas[i];
            }
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + "  ");
        }
        System.out.println("sum chusel krat 2: " + sum);
    }
}
