package com.com.day13.test15;

import java.util.HashSet;
import java.util.Iterator;

public class Test13 {
    public static void main(String[] args) {
        HashSet<Student> list = new HashSet<>();
        Student s1 = new Student("a", 11, 60);
        Student s2 = new Student("b", 12, 50);
        Student s3 = new Student("c", 13, 80);
        Student s4 = new Student("d", 12, 88);
        Student s5 = new Student("e", 11, 50);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        Iterator it = list.iterator();
        int sum = 0;
        Student student = (Student) it.next();
        int max = student.getScore();
        int min = student.getScore();
        for (Student ss : list) {
            sum += ss.getScore();
            if (max < ss.getScore())
                max = ss.getScore();
            if (min > ss.getScore())
                min = ss.getScore();

        }
        int avg = sum / 5;
        System.out.println("总分为：" + sum + "最高分为：" + max + "最低分:" + min + "平均分:" + avg);

    }
}
