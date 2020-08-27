package com.com.day04;

public class Task2_3 {
    public static void main(String[] args) {
        printNewArr();
    }
    public static void printNewArr() {
        int[] nums = {5, 10, 15};
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i] * 2;
        }
        System.out.println("nums数组:");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("newArr新数组:");
        for (int j : newArr) {
            System.out.print(j + " ");
        }

    }
}
