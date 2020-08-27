package com.com.day17.test15;

import java.io.File;

public class Test15 {
    public static void main(String[] args) {
        File file = new File("D:\\PDF课件\\方俊杰作业");
        JavaFilter javaFilter = new JavaFilter();
        File[] files = file.listFiles(javaFilter);
        for (File file1 : files){
            System.out.println(file1.getName());
        }


    }
}
