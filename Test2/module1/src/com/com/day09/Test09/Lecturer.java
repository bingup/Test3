package com.com.day09.Test09;

public class Lecturer extends Teacher {
    @Override
    public void work() {
        System.out.println("工号为:"+id+"的讲师"+name+"在讲课");
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    public Lecturer() {
    }
}
