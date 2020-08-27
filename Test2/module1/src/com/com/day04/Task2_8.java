package com.com.day04;

public class Task2_8 {
    public static void main(String[] args) {
        String[] s2 = {"DCBAD", "ADBCD", "ADBCA", "ABCDD"};
        int[] arr5 = pingFen(s2);
        System.out.println("满分10分， 小明：得分："+arr5[0]+"分");
        System.out.println("满分10分， 小红：得分："+arr5[1]+"分");
        System.out.println("满分10分， 小黄：得分："+arr5[2]+"分");
        System.out.println("满分10分， 小强：得分："+arr5[3]+"分");


    }

    public static int[] pingFen(String[] s) {
        int[] arr = new int[s.length];
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if ('A' == s[i].charAt(0)) {
                    count = count + 2;
                }
                if ('D' == s[i].charAt(1)) {
                    count = count + 2;
                }
                if ('B' == s[i].charAt(2)) {
                    count = count + 2;
                }
                if ('C' == s[i].charAt(3)) {
                    count = count + 2;
                }
                if ('D' == s[i].charAt(4)) {
                    count = count + 2;
                }

                arr[i] = count;
                count = 0;
            }
        }
        return arr;
    }
}
