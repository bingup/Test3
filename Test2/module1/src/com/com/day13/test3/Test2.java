package com.com.day13.test3;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"a","f",
                "b","c","a","d");
        Set<String> set = new HashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        list.stream().forEach(n-> System.out.println(n));
    }
}
