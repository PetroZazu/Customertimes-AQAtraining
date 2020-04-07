package com.customertimes.oracle.part1.Arrays_Control_Flow_HW;

public class Task7 {
    public static void main(String[] args) {
        int div = getGreatestCommonDivisor(108, 48);
        System.out.println(div);


    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int c = 0;
        if ((first < 10) || (second < 10)) {
            return -1;
        }
        if (first > second) {
            if ((first % second) == 0) {
                return second;
            } else {
                c = first - second;
                for (int i = c; i > 0; i--) {
                    if (((first % i) == 0) && ((second % i) == 0)) {
                        return i;
                    }
                }
            }
        } else {
            if ((second % first) == 0) {
                return first;
            } else {
                c = second - first;
                for (int i = c; i > 0; i--) {
                    if (((first % i) == 0) && ((second % i) == 0)) {
                        return i;
                    }
                }
            }
        }
        return -2;
    }
}
