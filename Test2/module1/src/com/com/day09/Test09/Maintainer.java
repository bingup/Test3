package com.com.day09.Test09;

public class Maintainer extends AdminStaff {
    @Override
    public void work() {
        System.out.println("工号为:"+id+"的维护专员"+name+"在解决不能共享屏幕的问题");
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    public Maintainer() {
    }
}
