package com.ioloi;

import java.io.*;

public class IOTest06 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try (
                BufferedInputStream bt = new BufferedInputStream(new FileInputStream("D:\\aa\\jq01\\03-选择器.mp4"));
                BufferedOutputStream ot = new BufferedOutputStream(new FileOutputStream("D:\\aa\\jq01\\sb.mp4"));

        ) {
            int len;
            byte[] bytes = new byte[1024];
            while ((len = bt.read(bytes)) != -1) {
                ot.write(bytes, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
