package com.com.day17.test21;

import java.io.File;

public class Test21 {
    public static void main(String[] args) {
        File file = new File("d:\\aaa");
        show(file);
    }

    public static void show(File file){
        System.out.println(file.getName());
        File[] files = file.listFiles();
        for (File f : files){
            if (f.isFile()){
                System.out.println(f.getName());
            } else {

                show(f);
            }
        }
    }
}
