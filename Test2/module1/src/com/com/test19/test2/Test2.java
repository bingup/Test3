package com.com.test19.test2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\e.txt"));
        String s= "i love java";
        byte[] bytes = s.getBytes();
        bos.write(bytes);
        bos.close();
    }
}
