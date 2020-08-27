package com.stream;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张狗");
        list.add("狗无忌");
        list.add("张忌");
        list.stream().filter((n)->{
            return n.startsWith("张"
            );
        }).limit(2).forEach((n)->{
            System.out.println(n);
        });
    }
}
