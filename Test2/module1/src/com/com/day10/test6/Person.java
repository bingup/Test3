package com.com.day10.test6;

public abstract class Person {
    public String nmae;
    public int age;

    public abstract void eat();

    public Person(String nmae, int age) {
        this.nmae = nmae;
        this.age = age;
    }

    public Person() {
    }
}
