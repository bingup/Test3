package com.com.test18.test13;

import com.com.day14.Test23.PainException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//思路
//在写入文件时，都要判断一次当前的文件名跟不跟list里面的文件名是否重复
//如果重复就更改当前的文件名在存入其中。最好弄一个100-999的随机数
//然后写入到那个文件中，计算的java文件的个数,用过滤器在计算一次呗，只能这样了
public class Test13 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\ccc");
        List<String> list = new ArrayList<>();
        int a = getJava(file1);
        System.out.println("java文件的数量为:"+a);
        copy(file1,list);

    }

    public static void copy(File file, List<String> list) throws IOException {

        File[] files = file.listFiles();
        Random random = new Random();
        for (File file1 : files) {
            if (file1.isFile()) {
                String name = file1.getName(); //获取到文件名
                boolean b = isRep(name, list); //然后判断list里面有没有跟上面那个文件名一样的。
                if (b == true) {
                    list.add(name);
                    fileCopy(name,file1.getAbsolutePath());
                    //然后进行文件复制
//                    FileOutputStream fos = new FileOutputStream("D:\\java\\" + name);
//                    FileInputStream fis = new FileInputStream(file1.getAbsoluteFile());
//                    int len;
//                    byte[] bytes = new byte[1024];
//                    while ((len = fis.read(bytes)) != -1) {
//                        fos.write(bytes, 0, len);
//                    }
//                    fis.close();
//                    fos.close();
                } else {
                    int num = random.nextInt(1000 - 100 + 1) + 100;
                    String[] strings =name.split("\\.");

                    String rename = strings[0] + num +"."+strings[1];
                    fileCopy(rename,file1.getAbsolutePath());
                    //文件复制
//                    FileOutputStream fos = new FileOutputStream("D:\\java\\" + rename);
//                    FileInputStream fis = new FileInputStream(file1.getAbsoluteFile());
//                    int len;
//                    byte[] bytes = new byte[1024];
//                    while ((len = fis.read(bytes)) != -1) {
//                        fos.write(bytes, 0, len);
//                    }
//                    fis.close();
//                    fos.close();
                }
            } else {
                copy(file1, list);
            }
        }

    }

    //判断是否跟传进来的文件名重复，重复返回false， 不重复返回false
    public static boolean isRep(String name, List<String> list) {
        if (list.contains(name)) {
            return false;
        }
        return true;
    }

    public static int getJava(File file) {
        if (file == null) {
            return  0;
        }
        int num = 0;
        File[] files =file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory())
                    return  true;
                String s= pathname.getName();
                return s.endsWith("java");
            }
        });
        for (File file1 :files){
            if (file1.isDirectory()){
                num += getJava(file1);
            }else {
                num++;
            }
        }
        return num;

    }

    public static void fileCopy(String name1,String name2) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\java\\" + name1);
        FileInputStream fis = new FileInputStream(name2);
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fis.close();
        fos.close();
    }

}
