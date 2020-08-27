package com.com.day09;

public class duke extends ChuSheng {
    @Override
    public void eat() {
        System.out.println(age+color+"鸭子在吃饭");

    }
    public void swim(){
        System.out.println(age+color+"鸭子在游泳");
    }

    public duke(int age, String color) {
        super(age, color);
    }
}
