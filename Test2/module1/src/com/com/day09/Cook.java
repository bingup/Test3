package com.com.day09;

public class Cook extends Emp {
    @Override
    public void eat() {
        System.out.println("工号为"+id+",姓名为:"+name+"工资为:"+price+"的厨师在吃肉");
    }

    @Override
    public void work() {
        System.out.println("工号为"+id+",姓名为:"+name+"工资为:"+price+"的厨师在工作,炒菜");
    }

    public Cook(String id, String name, double price) {
        super(id, name, price);
    }
}
