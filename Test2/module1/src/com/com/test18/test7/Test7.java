package com.com.test18.test7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("d:\\bb.png");
        FileInputStream fis = new FileInputStream("c:\\aa.png");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();
    }
}
