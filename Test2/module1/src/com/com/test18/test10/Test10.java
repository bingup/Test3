package com.com.test18.test10;

import java.io.*;

public class Test10 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:\\d1");

        File[] files = file.listFiles();
        for (File file1 : files){
            int b;
            byte[] bytes = new byte[4];
            System.out.println(file1);
            String s = file1.getName();
            FileInputStream fr  =new FileInputStream(file1);
            FileOutputStream fw = new FileOutputStream("c:\\d2"+"\\"+s);
            while ((b = fr.read(bytes))!=-1){
                fw.write(bytes,0,b);
            }
            fw.close();
            fr.close();
        }

    }
}
