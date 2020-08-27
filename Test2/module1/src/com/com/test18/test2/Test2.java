package com.com.test18.test2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("c:\\b.txt");
        byte[] bytes = {97,98,99,99,99,99};
        byte[] bytes1 = "我是中国人~".getBytes();
        fileOutputStream.write(bytes1);
        fileOutputStream.close();
    }
}
