package com.com.day04;

public class Test02 {
    static int[] arr1 = {11, 22, 33, 44, 55};

    public static void main(String[] args) {
        int[] arr = {12, 33, 25, 6, 16};
        int min = getMin(arr);
        System.out.println("数组最小值为:" + min);
        for (int i : arr1) {
            System.out.println(i);
        }

        printNewArr();
        int[] arr1 = {1, 8, 10, 12, 28, 12};

        int[] arr2 = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        int avg = getAvg(arr2);
        int count = 0;
        for (int z : arr2) {
            if (z > avg) {
                count++;
            }
        }
        System.out.println("高于平均分:" + avg + "的个数有" + count + "个");
        int[] arr3 = {1, 2, 3, 4, 3, 2, 1};
        boolean b1 = duiCheng(arr3);
        System.out.println("[1,2,3,4,3,2,1] 是否对称:" + b1);
        int[] arr4 = {1, 2, 3, 4, 3, 2, 1};
        boolean b2 = allEquals(arr3, arr4);
        System.out.println("[1,2,3,4,3,2,1]");
        System.out.println("[1,2,3,4,3,2,1]");
        System.out.println("是否一致:" + b2);

        String[] s2 = {"DCBAD", "ADBCD", "ADBCA", "ABCDD"};
        int[] arr5 = pingFen(s2);
        for (int a1 : arr5) {
            System.out.println(a1);
        }

        printY();
        int[] arr6 = {99, 100, 98, 97, 96};
        getAvg1(arr6);

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

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min)
                min = i;
        }
        return min;
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

    public static void printBall(int[] array) {
        System.out.println("您的双色球号码为:");
        for (int i : array
        ) {
            System.out.print(i + " ");

        }
    }

    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / (arr.length);
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
        System.out.println(avg);
    }
}
