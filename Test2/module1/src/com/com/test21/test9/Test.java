package com.com.test21.test9;

import java.io.*;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        Reader reader = null;
        try {
            reader = new FileReader("data1.txt");
            pro.load(reader);
            String count = pro.getProperty("count");
            int num = Integer.parseInt(count);
            if (num >= 3) {                System.out.println("程序使用次数已满，请续费");
            } else {
                System.out.println("当前次数为" + num + "次");
                String s = num + 1 + "";
                pro.setProperty("count",s);
                FileOutputStream os = new FileOutputStream("data1.txt");
                pro.store(os,"");
                os.close();


            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }

    }
}
