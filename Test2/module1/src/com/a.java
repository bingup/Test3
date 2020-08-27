package com;

public class a {
    public static void main(String[] args) {

    }

    public static void test01(int score) {
        if (score < 0 || score > 100) {
            System.out.println("成绩有误");
        } else if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("好");
        } else if (score >= 70 && score < 80) {
            System.out.println("里昂");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }

    public static int test02(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("1-100的奇数累加和:" + sum);
        return sum;

    }

    public static int test03(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("1-100之间既是3的倍数又是5的倍数的数字之和：" + sum);
        return sum;

    }

    public static void test06() {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int num1 = 100; num1 < 1000; num1++) {
            a = num1 / 100;
            b = num1 / 10 % 10;
            c = num1 % 10;
            if (num1 == (a * a * a + b * b * b + c * c * c)) {
                System.out.println(num1);
            }
        }
    }

    public static void test07() {
        int count = 0;

        for (int i = 1; i <= 60; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
                if (count == 5) {
                    System.out.println();
                    count = 0;
                }
            }

        }
    }

    public static void test09(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }

            }
            System.out.print('\n');
        }
    }


}
