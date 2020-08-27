package com.com.day04;

public class Task2_4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 8, 10, 12, 28, 12};
        printBall(arr1);

    }

    public static void printBall(int[] array) {
        System.out.println("您的双色球号码为:");
        for (int i : array
        ) {
            System.out.print(i + " ");

        }
    }
}
