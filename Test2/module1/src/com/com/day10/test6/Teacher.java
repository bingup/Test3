package com.com.day10.test6;

public class Teacher extends Person {
    public Teacher(String nmae, int age) {
        super(nmae, age);
    }

    @Override
    public void eat() {
        System.out.println("吃工作餐");
    }
}
