package com.com.day05;

public class StudentTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("周老师",30,"JAVA面向对象");

        Student student = new Student("韩同学",18,"JAVA面向对象");


        teacher.eat();
        teacher.teach();
        student.eat();
        student.study();
    }
}
