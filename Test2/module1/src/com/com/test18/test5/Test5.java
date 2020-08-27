package com.com.test18.test5;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\c.txt");
        byte[] bytes = new byte[8];
        int a;
        while((a = fis.read(bytes))!=-1){
            System.out.println( new String(bytes));
        }

        fis.close();
    }
}
