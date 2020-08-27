package com.com.day09;

public class Chicken extends ChuSheng {

    public Chicken() {
    }

    public Chicken(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat() {
        System.out.println(age+color+"的公鸡在啄米");
    }

    public void work(){
        System.out.println(age+color+"的公鸡在打鸣");
    }
}
