package com.com.day17.test14;

import java.io.File;

public class Test14 {
    public static void main(String[] args) {
        File file = new File("D:\\IDEA");
//        File file = new File("D:\\PDF课件\\方俊杰作业\\方俊杰07");
        show(file);
    }

    public static void show(File file) {
        if (file == null){
            return;
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                System.out.println(file1.getAbsoluteFile());
            }
            if (file1.isDirectory()){
                show(file1);
            }
        }
    }
}
