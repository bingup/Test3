package com.com.day13.test7;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test5 {
    public static void main(String[] args) {
        LinkedHashSet<String> list = new LinkedHashSet<>();
        list.add("王昭君");
        list.add("王昭君");
        list.add("西施");
        list.add("杨玉环");
        list.add("貂蝉");
        //迭代器获取元素
        System.out.println("通过迭代器来遍历元素:");
        Iterator it =list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("通过增加for来遍历元素:");
        //增强for获取元素
        for(String s : list){
            System.out.println(s);
        }
    }
}
