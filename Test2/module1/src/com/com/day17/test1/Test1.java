package com.com.day17.test1;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        //使用绝对路径或者相对路径来创建文件对象
        System.out.println("绝对路径创建文件对象：使用File类一个参数的构造方法");
        File file = new File("d:\\aaa.txt");
        System.out.println(file.getAbsoluteFile());

        //2.相对路径创建文件对象：使用File类两个参数的构造方法
        System.out.println("相对路径创建文件对象：使用File类两个参数的构造方法");
        String fu = "aaa";
        String zi = "aaa.txt";

        File file1 = new File(fu,zi);
        System.out.println(file1.getAbsoluteFile());
    }
}
