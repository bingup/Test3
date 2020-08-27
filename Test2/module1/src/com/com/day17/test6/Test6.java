package com.com.day17.test6;

import java.io.File;

public class Test6 {
    public static void main(String[] args) {
        File file = new File("c:/aaa/b.txt");
        System.out.println("文件的绝对路径"+file.getAbsolutePath());
        System.out.println("文件的父路径"+file.getParent());
        System.out.println("文件的文件名"+file.getName());
        System.out.println("文件的大小"+file.length());
    }
}
