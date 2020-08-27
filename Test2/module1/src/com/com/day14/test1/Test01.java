package com.com.day14.test1;

import java.util.HashMap;

public class Test01 {
    public static void main(String[] args) {
        //训练map集合中的常用方法
        HashMap<String,Integer> map = new HashMap();
        map.put("1",1002);
        map.put("2",103);
        map.put("3",104);
        map.put("4",114);
        System.out.println(map);
        System.out.println("使用map的map.get(\"1\")方法获取元素:");
        System.out.println(map.get("1"));
        map.remove("1");
        System.out.println(map);
    }
}
