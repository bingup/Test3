package com.com.day17.test4;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("C:\\ccc\\bbb\\aaa");
        System.out.println(file.mkdirs());
    }
}
