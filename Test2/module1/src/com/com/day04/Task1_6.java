package com.com.day04;

public class Task1_6 {
    public static void main(String[] args) {


        printX(9);


    }

    public static void printX(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
