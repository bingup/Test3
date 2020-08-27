package com.com.day04;

public class Task2_7 {
    public static void main(String[] args) {
        int[] arr3 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr4 = {1, 2, 3, 4, 3, 2, 1};
        boolean b2 = allEquals(arr3, arr4);
        System.out.println("[1,2,3,4,3,2,1]");
        System.out.println("[1,2,3,4,3,2,1]");
        System.out.println("是否一致:" + b2);
    }

    private static boolean allEquals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
