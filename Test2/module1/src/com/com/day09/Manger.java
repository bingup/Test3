package com.com.day09;

public class Manger extends Emp {
    @Override
    public void eat() {
        System.out.println("工号为"+id+",姓名为:"+name+"工资为:"+price+"的经理在吃鱼");
    }

    @Override
    public void work() {
        System.out.println("工号为"+id+",姓名为:"+name+"工资为:"+price+"在工作，管理其他人");

    }

    public Manger(String id, String name, double price) {
        super(id, name, price);
    }
}
