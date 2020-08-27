package com.com.day17.test8;

import java.io.File;

public class Test8 {
    public static void main(String[] args) {
        File file = new File("C:/aaa");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}
