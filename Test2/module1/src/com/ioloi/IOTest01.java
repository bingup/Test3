package com.ioloi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* close() :关闭此输出流并且释放与此流有关的任何系统资源、
* flush（） 刷新此输出流并且强制任何被缓冲的输出字节被写出
* write（byte【】 b）将指定的字节数组写入此输出流
* write （int b)  将指定的字节输出流
* FileOutPutStream
* */
public class IOTest01 {
    public static void main(String[] args) throws IOException {
    //使用file对象创建流对象
        //传入路径时，如果没有这个文件，会创建该文件，如果有这个文件，会清空这个文件的数据
        File file  = new File("a.txt");
        FileOutputStream f1 = new  FileOutputStream(file,true);

        //使用文件名称创建流对象
    //    FileOutputStream fileOutputStream = new FileOutputStream("a.txt");

//        f1.write(97);
//        f1.write(98);
        byte[] b ="niamsile".getBytes();
        f1.write(b);

        f1.close();

    }
}
