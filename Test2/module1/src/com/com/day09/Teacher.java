package com.com.day09;

public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void shangke(){
        System.out.println(name+"上课");
    }
}
