package com.com.day17.test7;

import java.io.File;

public class Test7 {
    public static void main(String[] args) {
        File file = new File("c:/aaa");
        File file1 = new File("c:/a.txt");
        if (file.isFile()) {
            System.out.println(file.getName() + "是一个文件");
        } else {
            System.out.println(file.getName() + "不是一个文件");
        }

        if (file.isDirectory()) {
            System.out.println(file.getName() + "是一个文件夹");
        } else {

            System.out.println(file.getName() + "不是一个文件夹");
        }

        if (file1.isFile()) {
            System.out.println(file1.getName() + "是一个文件");
        } else {
            System.out.println(file1.getName() + "不是一个文件");
        }

        if (file1.isDirectory()) {
            System.out.println(file1.getName() + "是一个文件夹");
        } else {

            System.out.println(file1.getName() + "不是一个文件夹");
        }
    }
}
