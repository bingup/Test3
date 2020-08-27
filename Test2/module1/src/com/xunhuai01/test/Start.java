package com.xunhuai01.test;



public class Start {
    private String name;
    private String sex;
    private String content;

    public Start(String name, String sex, String content) {
        this.name = name;
        this.sex = sex;
        this.content = content;
    }

    public void Sing(){
        System.out.println(name+"明星唱歌需要100元");
    }

    public void show(){
        System.out.println(name+"明星演戏需要200元");
    }
}
