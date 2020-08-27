package com.colloceion01;

import java.util.HashSet;

public class Set01 {
    public static void main(String[] args) {
        HashSet<Student> stu =new HashSet<>();
        Student stu1 = new Student("nima",123);
        Student stu2 = new Student("nima1",456);
        Student stu3 = new Student("nima2",123);
        Student stu4 = new Student("nima",123);
        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);
        stu.add(stu4);

        for (Student stu11 : stu) {
            System.out.println(stu11.getAge());
        }
    }
}
