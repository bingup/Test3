package com.com.test19.test3;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\d.png"));
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\c.png"));
        byte[] bytes = new byte[8 * 1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }

        bis.close();
        bos.close();
    }
}
