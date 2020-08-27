package com.com.day17.test18;

import java.io.File;
import java.io.FileFilter;

public class Test18 {
    public static void main(String[] args) {
        File file = new File("D:\\aa");
        show(file);
    }

    public static void show(File file) {
        if (file == null) {
            return;
        }
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory())
                    return  true;

                if (pathname.length() /1024 <200){
                    return true;
                }else {
                    return false;
                }
            }
        });
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println(file1.getAbsoluteFile());
            }
            if (file1.isDirectory()) {
                show(file1);
            }
        }
    }
}
