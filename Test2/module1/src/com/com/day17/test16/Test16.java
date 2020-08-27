package com.com.day17.test16;

import java.io.File;
import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件夹路径");
        String s =sc.nextLine();
        File file = new File(s);
        File[] files =  file.listFiles();
        for (int i = 0;i<files.length;i++){
            files[i].delete();
        }
        file.delete();
    }
}
