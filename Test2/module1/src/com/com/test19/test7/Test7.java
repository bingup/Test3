package com.com.test19.test7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test7 {
    public static void main(String[] args) {
        Student s1 = new Student("爱",20,"男");
        Student s2 = new Student("恨",30,"女");
        Student s3 = new Student("仇",50,"男");
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("stu.txt"));
            os.writeObject(s1);
            os.writeObject(s2);
            os.writeObject(s3);

            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
