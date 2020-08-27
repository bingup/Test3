package com.com.day10.test6;

public class SportStudent extends Person implements Sport {
    @Override
    public void eat() {
        System.out.println("吃学生餐");
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+age+"岁"+nmae+"的学生打篮球");
    }

    public SportStudent(String nmae, int age) {
        super(nmae, age);
    }
}
