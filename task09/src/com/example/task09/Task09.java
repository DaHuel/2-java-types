package com.example.task09;

public class Task09 {

    public static double solution() {
        // add Float

        float a = 1.0f;
        float b = 3.0f;
        float c = 1.0e9f;
        double x = (a / b - 1.0F / 3.0F) * c;

        return x;
    }

    public static void main(String[] args) {
        System.out.println(solution() == 0.0d);
    }

}
