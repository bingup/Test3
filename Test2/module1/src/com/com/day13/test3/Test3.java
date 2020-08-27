package com.com.day13.test3;

import java.util.HashSet;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("zhangsan");
        set.stream().forEach(m-> System.out.println(m));
    }
}
