package com.practice.array;

import java.util.Scanner;
/*
    program that tell the one hypan as that is 4 time tell no of hypan
    value of + , - , * , /
    + value is 4
    - value is 1
    * value is 5
    / value is 2
 */
public class PrintingCharOfStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to char printer of String");
        System.out.print("Please enter the string : ");
        String string = in.next();

        int a = 0;
        for (char c : string.toCharArray()) {
            a += switch (c){
                case '+' -> 4;
                case '-' -> 1;
                case '*' -> 5;
                case '/' -> 2;
                default -> 0;
            };
        }
        System.out.println("answer is " + a/4);
    }
}
