package com.com.day16.test8;

import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student s1 = new Student("啊", 5);
        Student s2 = new Student("吧", 3);
        Student s3 = new Student("的", 6);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        Arrays.sort(students, (a, b) -> b.getScore() - a.getScore());



        for (Student student : students){
            System.out.println(student.getScore());
        }

    }
}
