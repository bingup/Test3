package com.com.day04;

public class Task2_1 {
    public static void main(String[] args) {
        int[] arr = {12, 33, 25, 6, 16};
        int min = getMin(arr);
        System.out.println("数组最小值为:" + min);

    }
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min)
                min = i;
        }
        return min;
    }
}
