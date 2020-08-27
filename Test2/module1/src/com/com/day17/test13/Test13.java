package com.com.day17.test13;

import java.io.File;
import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件路径");
        String s = sc.nextLine();
        File file = new File(s);
        if (file.isFile()){
            System.out.println(file.getName()+"的大小为:"+file.length());
        }
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for(File file1 :files){
                sum += file1.length();
            }

            System.out.println("大小为:"+sum);
        }
    }
}
