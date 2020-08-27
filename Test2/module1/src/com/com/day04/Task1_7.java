package com.com.day04;

public class Task1_7 {
    public static void main(String[] args) {
        float f1 = 10.1f;
        float f2 = 10.4f;
        float f3 = 10.5f;
        float f4 = 10.9f;
        int a1 = round(f1);
        int a2 = round(f2);
        int a3 = round(f3);
        int a4 = round(f4);
        System.out.println(f1 + "->" + a1);
        System.out.println(f2 + "->" + a2);
        System.out.println(f3 + "->" + a3);
        System.out.println(f4 + "->" + a4);


    }

    public static int round(float f) {
        return (int) (f + 0.5);
    }
}
