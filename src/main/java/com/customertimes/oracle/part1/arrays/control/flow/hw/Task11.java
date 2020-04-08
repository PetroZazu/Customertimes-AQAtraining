package com.customertimes.oracle.part1.arrays.control.flow.hw;

/*
 Write a program which prints the next figure to the console:

          *
         ***
        *****
       *******
      *********
     ***********

 */


public class Task11 {
    public static void main(String[] args) {

        String[][] mas = new String[6][11];
        String a = "*";
        String b = " ";
        int s = (mas[1].length/2); // змінна яка буде мати число середину другого виміру масиву
        int y = s; // змінна яка буде мати число середину другого виміру масиву

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j <= (mas[i].length / 2); j++) { // проходимо елементи до середнього (mas[i].length / 2) = 5
                if (j >= s) { // TRUE буде на останній ітерації і ми заповнимо зірочкою елемент [0][5]
                               /* Після кожної ітерації циклу, змінна 's' зменьшується на 1.
                               друга ітерація -> 's' стає вже не 5 а 4!, відповідно на другій ітерації заповняться зірочкою вже два елементи
                               [1][4] і [1][5]*/
                    mas[i][j] = a;
                } else {
                    mas[i][j] = b;
                }
                System.out.print(mas[i][j]);
            }
            s--;

            for (int j = ((mas[i].length + 1) / 2); j < (mas[i].length); j++) { // проходимо елементи від середнього + 1 (mas[i].length + 1 / 2) = 6
                if (j <= y) {
                    mas[i][j] = a;
                } else {
                    mas[i][j] = b;
                }
                System.out.print(mas[i][j]);
            }
            y++;
            System.out.println();
        }
    }
}





