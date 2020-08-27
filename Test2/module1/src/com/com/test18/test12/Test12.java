package com.com.test18.test12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test12 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        //加载文本信息到属性集中
        pro.load(new FileInputStream("c:\\score.txt"));
        FileOutputStream fos = new FileOutputStream("c:\\score.txt");
        Set<String> strings = pro.stringPropertyNames();
        for (String key :strings){
            if(key.equals("lisi")){
                pro.setProperty(key,"100");
            }
            String s = key+" = "+ pro.getProperty(key);
            byte[] bytes = s.getBytes();
            fos.write(bytes);
            fos.write("\r\n".getBytes());
        }
        fos.close();


    }
}
