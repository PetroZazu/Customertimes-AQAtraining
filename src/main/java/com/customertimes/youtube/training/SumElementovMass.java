package com.customertimes.youtube.training;

public class SumElementovMass {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int sum = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 27;
        }

        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }

        for (int i = 0; i < mas.length; i++) {
            if (i == (mas.length - 1)) {
                System.out.println("element #:" + i + " = " + mas[i] + " ");
            } else {
                System.out.print("element #:" + i + " = " + mas[i] + " ");
            }

            if ((mas.length - 1) == i) {
                System.out.println("sum vsih elementov mass = " + sum);
            }
        }
    }
}

