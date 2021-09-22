package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        // fff

        return (char)(c-('a'-'A'));
    }

    public static void main(String[] args) {


        char result = toUpperCase('x');
        System.out.println(result);
    }

}
