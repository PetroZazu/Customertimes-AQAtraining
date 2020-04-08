package com.customertimes.oracle.part1.control.flow.statements;

public class QuestionsUnswers {
    /*
    1) The most basic control flow statement supported by the Java programming language is the __if then__ statement.
    2) The __case :(__ -> (switch) statement allows for any number of possible execution paths.
    3) The __do while__ statement is similar to the while statement, but evaluates its expression at the _buttom_ of the loop.
    4) How do you write an infinite loop using the for statement __for(;;)__ or for(i=0;i=0;)?
    5) How do you write an infinite loop using the while statement? _While(true)  */

    public static void main(String[] args) {
        int aNumber = -1;
        if (aNumber >= 0)
            if (aNumber == 0)
                System.out.println("first string");
            else System.out.println("second string");
        System.out.println("third string");
    }
}

/*
a) What output do you think the code will produce if aNumber is 3?:

second string
third string

b) - Write a test program containing the previous code snippet;
- make aNumber 3. What is the output of the program?
- Is it what you predicted?
- Explain why the output is what it is;
- in other words, what is the control flow for the code snippet?

c) Using only spaces and line breaks, reformat the code snippet to make the control flow easier to understand.

if (aNumber >= 0)
    if (aNumber == 0)
        System.out.println("first string");
    else
        System.out.println("second string");

System.out.println("third string");

d) Use braces, { and }, to further clarify the code.

 if (aNumber >= 0){
    if (aNumber == 0){
        System.out.println("first string");
    }
    else {
        System.out.println("second string");
         }
System.out.println("third string");
 }


 */