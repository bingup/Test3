package com.com.day14.test10;


import java.util.HashMap;
import java.util.Set;

public class Test10 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        Set<Integer> keys = map.keySet();
        for (Integer key : keys){
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
        map.put(5,"李晓红");
        map.remove(1);
        map.put(2,"周林");
        System.out.println("修改后的map：");
        Set<Integer> keys1 = map.keySet();
        for (Integer key : keys1){
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
