package com.customertimes.oracle.part1.strings.hw;
/*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 */
public class HelloName {
    public static void main(String[] args) {
        System.out.println(nameHello("Bob"));

    }

    public static String nameHello (String str) {
        return "Hello " + str + "!";
    }
}
