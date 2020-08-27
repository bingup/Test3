package com.com.test19.test11;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        Student s1 = new Student("肖了",11,"boy");
        Student s2 = new Student("困了",22,"girl");
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        try {
            FileOutputStream fos = new FileOutputStream("stus.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(list);

            os.close();
            fos.close();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
