package com.com.test19.test12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test12 {
        public static void main(String[] args) {
            File file = new File("a.txt");
            Path p =file.toPath();

            try {
                //复制文件
                Files.copy(p, Paths.get("b.txt"), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Path p2 = Paths.get("b.txt");
            //读取文件
            try {
                //读取文件
                byte[] bytes = Files.readAllBytes(p2);
                System.out.println(new String(bytes));
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
}
