package com.com.day04;

public class Task2_9 {
    public static void main(String[] args) {
        printY();
    }

    public static void printY() {
        String[] s1 = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] S2 = {"黑桃", "红桃", "梅花", "方块"};
        for (int i = 0; i < S2.length; i++) {
            for (int j = 0; j < s1.length; j++) {
                System.out.print(S2[i] + s1[j] + " ");
            }
            System.out.println();
        }

    }
}
