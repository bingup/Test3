package com.com.day13.test3;

import java.util.HashSet;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("二丫");
        set.add("钱六");
        set.add("孙七");
        set.forEach(n-> System.out.println(n));
        set.remove("二丫");
        set.add("王小丫");
        set.forEach(n-> System.out.println(n));
    }
}
