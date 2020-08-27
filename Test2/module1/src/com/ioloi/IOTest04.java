package com.ioloi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest04 {
    public static void main(String[] args) throws IOException {
        //输入流对象，就是从文件中读取到内存
        FileInputStream filein = new FileInputStream("D:/1.jpg");

        //输出流对象，就是从内存中输出到文件中
        FileOutputStream fileout = new FileOutputStream("d:/2.jpg");

        int b;
        while ((b = filein.read()) != -1){
            fileout.write(b);
        }

        fileout.close();
        filein.close();


        //流的关闭原则：先开后关，后开先关
    }
}
