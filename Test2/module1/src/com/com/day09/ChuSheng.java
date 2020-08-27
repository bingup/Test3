package com.com.day09;

public abstract class ChuSheng {
    int age;
    String color;

    public abstract void eat();

    public ChuSheng(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public ChuSheng() {
    }
}
