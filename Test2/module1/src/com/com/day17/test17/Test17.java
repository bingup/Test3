package com.com.day17.test17;

import java.io.File;

public class Test17 {
    public static void main(String[] args) {
        File file = new File("C:\\bbb");
         long  sum = calculate(file);
        System.out.println(sum);

    }

    public static long calculate(File file) {
        if (file == null) {
            return 0;
        }
        File[] files = file.listFiles();
        long size = 0l;
        for (File f : files) {
            if (f.isFile()) {
                size += f.length();
            } else {
             size +=calculate(f);
            }
        }

        return size;

    }
}
