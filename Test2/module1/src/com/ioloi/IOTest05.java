package com.ioloi;

import java.io.FileWriter;
import java.io.IOException;

public class IOTest05 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("a.txt");
        fw.write("我是");
        fw.write("\r\n");
        fw.write("中国人");

        fw.close();
    }
}
