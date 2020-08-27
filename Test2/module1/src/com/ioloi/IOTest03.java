package com.ioloi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* int read() 从输入流中读取下一个字节
* int read(byte[]  b）*/
public class IOTest03 {
    public static void main(String[] args) throws IOException {

        FileInputStream in  = new FileInputStream("a.txt");

//        int read = in.read();
//        System.out.println((char) read);
            int read ;
            byte[] b = new byte[2];
         while((read=in.read(b))!=-1){
             System.out.println(new String(b,0,read));
         }

         in.close(); //一定要关闭资源哦!
    }
}
