package com.com.day08;

public class Test02 {
    public static void main(String[] args) {
        String str1 ="hello";
        String str2 = new String("hello");
        String str3 = "Hello";

        System.out.println("比较str1和str2内容是否相等:"+str1.equals(str2));
        System.out.println("比较str1和str3内容是否相等:"+str1.equals(str3));
        System.out.println("忽略大小写比较str1和str3内容是否相等:"+
                str1.equalsIgnoreCase(str3));
        System.out.println("测试str1字符串是否以\"He\"前缀开"+ str1.startsWith("He"));
        System.out.println("测试str1字符串是否以\"abc\"前缀开"+str1.startsWith("abc"));
        System.out.println("测试str1字符串是否以\"o\"后缀结尾"+str1.endsWith("o"));
        System.out.println("测试str1字符串是否以\"i\"后缀结尾"+str1.endsWith("i"));


    }
}
