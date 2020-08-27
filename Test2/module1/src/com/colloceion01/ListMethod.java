package com.colloceion01;


import java.util.ArrayList;
import java.util.List;

/*
* list方法的使用
* add(int index.E element) 将指定元素的代码添加到指定的位置上
* E get(int index):返回集合中指定的元素
* E remove（int index ） 移除指定位置的元素，返回的是被移除的元素*/
public class ListMethod {
    public static void main(String[] args) {
        List<String> list =new ArrayList<String>();
        list.add("sb");
        list.add("nc");
        list.add("cnmb");
        System.out.println(list);
        list.add(1,"sb1");
        System.out.println(list);
        list.remove(2);
        list.set(1,"sb改变了");

    }
}
