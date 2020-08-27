package com.com.day09.Test09;

public class Tutor extends Teacher {
    @Override
    public void work() {
        System.out.println("工号为:"+id+"的助教"+name+"在帮助学生解决问题");
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    public Tutor() {
    }
}
