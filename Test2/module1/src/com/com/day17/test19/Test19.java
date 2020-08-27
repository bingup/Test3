package com.com.day17.test19;

import java.io.File;

public class Test19 {
    public static void main(String[] args) {
        File file = new File("C:\\bbb");
        if(!file.exists()){
            System.out.println("该文件不存在");
        }
        delete(file);
    }

    public static  void delete(File file){
        if (file == null){
            return;
        }
        if (file.isDirectory()) {
            File[] files = file.listFiles();

            for (File f : files) {
                if (f.isDirectory()) {
                    delete(f);
                    f.delete();
                } else {
                    f.delete();
                }
            }
            file.delete();
        }else {
            file.delete();
        }


    }
}
