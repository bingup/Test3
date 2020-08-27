package com.com.day12.test7;

public class InterImpl2<E> implements Inter<E> {
    @Override
    public void show(E e) {
        System.out.println("定义实现类时不确定泛型的类型");
        System.out.println("传入的内容："+e);

    }
}
