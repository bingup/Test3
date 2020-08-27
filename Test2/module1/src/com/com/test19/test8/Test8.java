package com.com.test19.test8;

import com.com.test19.test7.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Comparator;

public class Test8 {
    public static void main(String[] args) {
        Student student = null;
        try {
            FileInputStream fs = new FileInputStream("stu.txt");
            ObjectInputStream ois = new ObjectInputStream(fs);
            student = (Student) ois.readObject();

            ois.close();
            fs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Name  = "+student.getName());
        System.out.println("Sex   = "+student.getSex());
        System.out.println("age   = "+student.getAge());
    }
}
