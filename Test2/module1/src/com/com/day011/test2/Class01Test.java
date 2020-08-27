package com.com.day011.test2;

import java.util.ArrayList;

public class Class01Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("小明");
        Student s2 = new Student();
        s2.setName("小亮");
        Student s3 = new Student();
        s3.setName("小红");
        Teacher teacher =new Teacher("张老师");
        teacher.setDo(s1,"旷课");
        teacher.setDo(s2,"上课");
        teacher.setDo(s3,"上课");
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Class01 class01 = new Class01("java",teacher,list);
        class01.show();
    }
}
