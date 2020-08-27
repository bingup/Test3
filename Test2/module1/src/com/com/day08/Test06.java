package com.com.day08;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        String mgc = "奥巴马";
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1 =sc.nextLine();
        System.out.println(s1.replaceAll(mgc,"*"));
    }
}
