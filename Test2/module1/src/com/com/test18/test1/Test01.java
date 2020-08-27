package com.com.test18.test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:\\a.txt");
        FileOutputStream fopts = new FileOutputStream(file);
        fopts.write(99);
        fopts.write(98);
        fopts.write(99);
        fopts.close();

    }
}
