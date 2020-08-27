package com.myfile;

import java.io.File;

public class Myfile01 {
    public static void main(String[] args) {
//        String pathname = "D:\\aa.txt";
//        File file1 = new File(pathname);
//        File f = new File("d:/aa/jq01");
//        System.out.println(f.getAbsoluteFile());
//        System.out.println(f.getPath());
//        System.out.println(f.getName());
//        System.out.println(f.length());

        //绝对路径
//        String pathname = "D:\\aaa.txt";
//        File file1 = new File(pathname);
//        //相对路径
//        File ff =new File("D:\\aa");
//        System.out.println(ff.getAbsoluteFile());
//        System.out.println(file1.isFile()); //true
//        System.out.println(file1.isDirectory()); //false
//        System.out.println(file1.exists());//true
//        System.out.println(ff.exists());//true
//        System.out.println(ff.isDirectory()); //true
//        System.out.println(ff.isFile()); //false
        File ff =new File("D:\\aa");
        printDir(ff);


    }

    public static void printDir(File dir){
        //先遍历该该文件的所有子文件或目录
        File[]  files = dir.listFiles();

        for(File file :files){
            if(file.isFile()){
                System.out.println("文件："+file.getAbsoluteFile());

            }else
            {
                System.out.println("目录："+file.getAbsoluteFile());
                printDir(file);
            }
        }

    }
}
