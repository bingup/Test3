package com.ioloi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("a.txt");

        Byte[] b = {99, 98, 107, 98};
        for (int i = 0; i < b.length; i++) {
            file.write(b[i]);

            file.write("\r\n".getBytes());
        }
        file.close();

    }
}
