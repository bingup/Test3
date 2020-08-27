package com.com.day04;

public class Test01 {
    public static void main(String[] args) {
        printEven(20);
        int a = getSum(20);
        System.out.println("总和为:" + a);

        int length = 20, width = 8;
        int zc = getPerimeter(length, width);
        System.out.println("长方形周长:" + zc);
        int area = getArea(length, width);
        System.out.println("长方形面积:" + area);

        char aChar = getChar(66);
        System.out.println("字符:" + aChar);

        showColor("red");

        printX(10);
        float f1 = 10.1f;
        int a1 = round(10.5f);
        System.out.println(f1 + "->" + a1);


        double d1 = swapTemperature("30C");
        System.out.println("摄氏度为:30.0°--华氏度w为:"+d1 +"°");
        double d2 = swapTemperature("86F");
        System.out.println("华氏度为:86.0°--摄氏度为:"+d2 +"°");

        print99();

    }

    public static void printEven(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int getPerimeter(int length, int width) {

        return (length + width) * 2;
    }

    public static int getArea(int length, int width) {
        return length * width;
    }

    public static char getChar(int num) {
        char ch = (char) num;
        if (ch >= 'A' && ch <= 'Z') {
            return ch;
        } else if (ch >= 'a' && ch <= 'z') {
            return ch;
        } else if (ch >= '1' && ch <= '9') {
            return ch;
        }
        return ' ';
    }

    public static void showColor(String color) {
        switch (color) {
            case "red":
                System.out.println("red是红色");
                break;
            case "blue":
                System.out.println("blue是蓝色");
                break;
            case "green":
                System.out.println("green是绿色");
                break;
            default:
                System.out.println("颜色未知");
                break;
        }
    }

    //n=10
    public static void printX(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("0");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    public static int round(float f) {
        return (int) (f + 0.5);
    }

    public static double swapTemperature(String s) {
        if (s.contains("C")) {
            String s1 = s.replace("C", " ");
            System.out.println(s1);
            String s2 =s1.trim();
            int a1 = Integer.parseInt(s2);
            return (9.0 / 5) * a1 + 32;
        } else {
            String s1 = s.replace("F", " ");
            System.out.println(s1);

            String s2 =s1.trim();
            int a1 = Integer.parseInt(s2);
            return (double) (a1 - 32) * 5 / 9.0;
        }

    }

    public static void print99(){
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
