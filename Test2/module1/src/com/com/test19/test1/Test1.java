package com.com.test19.test1;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:\\d.txt"));
        bos.write(99);
        bos.close();
    }
}
