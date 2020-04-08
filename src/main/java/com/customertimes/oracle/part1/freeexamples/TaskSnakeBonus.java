package com.customertimes.oracle.part1.freeexamples;

/*

Write a program which prints the next figure to the console:
    **********
             |
    **********
    |
    **********
             |
    **********
    |
    **********
            ^^

            or

    **********
             |
    **********
    |
    **********
             |
    **********
    ^^



 */
public class TaskSnakeBonus {
    public static void PrintSnake(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i % 2 != 0) {
                    System.out.print("*");
                }
                if ((i % 2 == 0) && (j < 10) && (i % 4 != 0) && (i != n)) {
                    System.out.print(" ");
                }
                if ((i % 2 == 0) && (j == 10) && (i % 4 != 0) && (i != n)) {
                    System.out.print("|");
                }
                if ((i % 4 == 0) && (j == 1) && (i != n)) {
                    System.out.print("|");
                }
                if ((i == n) && (n % 2 == 0) && (n % 4 != 0) && (j <= 8)) {
                    System.out.print(" ");
                }
                if ((i == n) && (n % 2 == 0) && (n % 4 !=0) && (j > 8)) {
                    System.out.print("^");
                }
                if ((i == n) && (n % 4 == 0) && (j > 2)) {
                    System.out.print(" ");
                }
                if ((i == n) && (n % 4 == 0) && (j <= 2)) {
                    System.out.print("^");
                }



            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintSnake(4);
    }
}

