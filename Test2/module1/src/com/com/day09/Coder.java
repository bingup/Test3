package com.com.day09;

public class Coder extends Person{

    public Coder(String name, int age) {
        super(name, age);
    }

    public void code(){
        System.out.println(name+"敲代码");
    }
}
