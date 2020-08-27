package com.com.test19.test6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"), "GBK");
        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char)b);
        }
        isr.close();
    }
}
