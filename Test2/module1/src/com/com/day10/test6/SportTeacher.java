package com.com.day10.test6;

public class SportTeacher extends Person implements Sport {
    @Override
    public void eat() {
        System.out.println("吃工作餐");
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+age+"岁"+nmae+"的老师打篮球");
    }


    public SportTeacher(String nmae, int age) {
        super(nmae, age);
    }
}
