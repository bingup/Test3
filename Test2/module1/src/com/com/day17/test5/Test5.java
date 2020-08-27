package com.com.day17.test5;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        File file = new File("C:/a.txt");
        File file1 = new File("C:/aaa");

        System.out.println(file.delete());
        System.out.println(file1.delete());
    }
}
