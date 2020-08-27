package com.com.day13.test11;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();
        LinkedHashSet<Character> list = new LinkedHashSet<>();
        char[] chs = s.toCharArray();
        for (char ch : chs)
            list.add(ch);

        for (char a :list){
            System.out.println(a);
        }
    }
}
