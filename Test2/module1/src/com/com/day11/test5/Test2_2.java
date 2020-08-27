package com.com.day11.test5;

public class Test2_2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String s = "123";
        for (int i = 0; i < 10000; i++) {
            s += i + "";
        }

        long end = System.currentTimeMillis();
        System.out.println("创建String使用for循环对字符串进行拼接需要耗费的毫秒值:");
        System.out.println(end - start);

        StringBuilder s1 = new StringBuilder("abc");
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            s1.append(i + "");
        }
        long end1 = System.currentTimeMillis();
        System.out.println("创建StringBuilder使用for循环对字符串进行拼接需要耗费的毫秒值:");
        System.out.println(end1 - start1);
    }
}
