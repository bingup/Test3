package com.com.day17.test2;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\a.txt");
        if(!file.exists()){
            file.createNewFile();
        }
    }
}
