package com.com.test18.test11;

import java.io.*;

public class Test11 {
    public static void main(String[] args) {
        try {
            sum('a');
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void sum(char ch) throws IOException {
        int num = 0;
        //定义一个方法统计info.txt里面的字符次数
        File file = new File("c:\\info.txt");
        FileInputStream fis = new FileInputStream(file);
        int b;
        while ((b = fis.read()) != -1) {
            char b1 = (char) b;
            if (b1 ==  ch){
                num++;
            }
        }

        System.out.println(ch+"出现了"+num+"次");
        fis.close();

    }
}
