package com.customertimes.oracle.part1.freeexamples;

/*
Write a program which prints the next figure to the console:
          *
         ***
        *****
       *******
      *********
     ***********
 */
public class Tree {
    public static void main(String[] args) {
        ChristmasTree(6);
    }

    public static void ChristmasTree(int numberOfRows) {
        //numberOfRows -> number that characterizes high of the tree (number of rows)
        int l = numberOfRows * 2 - 1;   //this variable 'l' will take the length depending on the count of rows (depending on the H - high variable)
        String a = "*";
        String b = " ";
        int k = (l / 2) + 1;   //for variable 'k' we assign the cell number, where the first '*' element must be printed (like the top of the tree)
        int k2 = k;   //we need the clone of this element

        for (int i = 1; i <= numberOfRows; i++) {   //this firs cycle to run on each row
            for (int j = 1; j <= l; j++) {   //second one for each element of the row
                if (j < k || j > k2) {   //if current element is < then middle element or > then middle element:
                    System.out.print(b);   //let's print ' nothing :) '
                } else {
                    System.out.print(a);   //no? let's print '*' !
                }
            }
            k--;   //hmm, as we see, the tree middle element equally increase and decrease for one
            k2++;   //let's do this and after that we will have right else flow to proint '*' in our if statement
            System.out.println();   //and this just to go to the next line after one cycle will count the last element of the line
        }
    }


}


