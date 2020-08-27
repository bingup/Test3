package com.com.day12.test7;

//泛型接口
public class InterImpl1 implements Inter<String> {


    @Override
    public void show(String s) {
        System.out.println("定义实现类时确定泛型的类型");
        System.out.println("传入的内容："+s);
    }
}
