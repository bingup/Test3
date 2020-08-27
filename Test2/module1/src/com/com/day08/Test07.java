package com.com.day08;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个QQ号码：");
        String s1 = sc.nextLine();
        boolean b1 = checkQQ(s1);
        System.out.println("这个QQ号码是否正确："+b1);
    }

    private static boolean checkQQ(String s1) {
        if (s1.length() < 5 || s1.length() > 12) {
            return false;
        }
        if (s1.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch =s1.charAt(i);
            if(ch<'0'|| ch>'9'){
                return false;
            }
        }
        return true;

    }

}
