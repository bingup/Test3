package com.com.day12.test1;

import java.util.ArrayList;
import java.util.Collection;

public class Test1_1 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        ((ArrayList) collection).add("a");
        ((ArrayList) collection).add("b");
        System.out.println(collection);
        collection.remove("a");
        System.out.println("删除a后的集合"+collection);
        System.out.println("集合的大小为："+collection.size());
        collection.clear();
        System.out.println("集合已被清空");

    }
}
