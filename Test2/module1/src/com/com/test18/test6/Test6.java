package com.com.test18.test6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("c:\\aa.png");
        FileOutputStream fos = new FileOutputStream("d:\\aa.png");
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        fos.close();
        fis.close();
    }
}
