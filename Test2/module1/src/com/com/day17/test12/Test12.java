package com.com.day17.test12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件路径");
        String s = sc.nextLine();
        File file = new File(s);
        if (file.exists()){
            System.out.println(file.length());
        }else{
            file.createNewFile();
        }
    }
}
