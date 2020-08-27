package com.com.day10.test6;

public class Student extends Person {
    @Override
    public void eat() {
        System.out.println("吃学生餐");
    }

    public Student(String nmae, int age) {
        super(nmae, age);
    }
}
