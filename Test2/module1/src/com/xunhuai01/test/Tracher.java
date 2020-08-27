package com.xunhuai01.test;


public class Tracher {
    private String name;
    private  int  age;
    private  String  kecheng;

    public Tracher(String name, int age, String kecheng) {
        this.name = name;
        this.age = age;
        this.kecheng = kecheng;
    }

    public void speak(){
        System.out.println(name+"老师正在讲课，讲的是"+kecheng);
    }

    public  void add(){
        System.out.println("班级加作业了");
    }
}
