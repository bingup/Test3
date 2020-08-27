package com.com.test19.test5;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test5 {
    public static void main(String[] args) throws IOException {

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"),"GBK");
        osw.write("我爱我家");
        osw.close();


    }
}
