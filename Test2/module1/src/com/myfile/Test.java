package com.myfile;

import com.ioloi.IOTest03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\IdeaProjects\\Test2\\module1\\src\\com\\myfile\\Myfile01.java");
        System.out.println("com.myfile.Myfile01");
        try {
            FileOutputStream fos = new FileOutputStream(file,true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName());


    }
}
