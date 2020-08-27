package com.com.day09.Test09;

public class Teacher extends Employee {
    @Override
    public void work() {
        System.out.println("工号为:"+id+"的讲师"+name+"在讲课");
    }

    public Teacher(String id, String name) {
        super(id, name);
    }

    public Teacher() {
    }
}
