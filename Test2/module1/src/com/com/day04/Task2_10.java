package com.com.day04;

public class Task2_10 {
    public static void main(String[] args) {
        int[] arr6 = {99, 100, 98, 97, 96};
        getAvg1(arr6);
    }

    public static void getAvg1(int[] arr1) {
        int max = arr1[0];
        int min = arr1[0];
        int sum = 0;
        for (int i : arr1) {
            if (max < i)
                max = i;
            if (min > i)
                min = i;

            sum += i;
        }
        int avg = (sum - max - min) / 3;
        System.out.println("最终得分为： "+avg);
    }

}
