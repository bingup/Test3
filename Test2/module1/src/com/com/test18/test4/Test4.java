package com.com.test18.test4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws IOException {
        //读取c:\\a.txt上的数据到控制台中
        FileInputStream fis = new FileInputStream("c:\\a.txt");
        int b;
        while ((b = fis.read())!=-1) {
            System.out.println((char)b);
        }

        fis.close();

    }
}
