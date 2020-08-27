package com.com.day04;

public class Task2_6 {
    public static void main(String[] args) {
        int[] arr3 = {1, 2, 3, 4, 3, 2, 1};
        boolean b1 = duiCheng(arr3);
        System.out.println("[1,2,3,4,3,2,1] 是否对称:" + b1);
    }

    public static boolean duiCheng(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        for (; i >= j; i++, j--) {
            if (arr[i] != arr[j])
                return false;
        }
        return true;
    }
}
