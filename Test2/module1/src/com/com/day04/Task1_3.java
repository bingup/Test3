package com.com.day04;

public class Task1_3 {
    public static void main(String[] args) {

        int length = 20, width = 8;
        int zc = getPerimeter(length, width);
        System.out.println("长方形周长:" + zc);
        int area = getArea(length, width);
        System.out.println("长方形面积:" + area);



    }
    public static int getPerimeter(int length, int width) {

        return (length + width) * 2;
    }

    public static int getArea(int length, int width) {
        return length * width;
    }
}
