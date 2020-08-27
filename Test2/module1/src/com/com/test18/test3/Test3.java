package com.com.test18.test3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("c:\\c.txt",true);
        byte[] bytes = ("i love java \r\n" +
                "i love java \r\n" +
                "i love java \r\n" +
                "i love java \r\n" +
                "i love java \r\n").getBytes();
        fileOutputStream.write(bytes);

        fileOutputStream.close();
    }
}
