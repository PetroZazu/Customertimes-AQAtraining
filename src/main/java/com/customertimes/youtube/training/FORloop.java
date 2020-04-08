package com.customertimes.youtube.training;

public class FORloop {
    public static void main(String[] args) {
        int sum = 0;
        int k = -1;
        for (int i = -200; i <= 1000; i++) {
            if ((i % 3) == 0) {
                k++;
                if ((k % 2) == 0) {
                    System.out.println(i);
                    sum += i;
                }
            }
        }
        System.out.println("and the sum is equals: " + sum);
    }
}

