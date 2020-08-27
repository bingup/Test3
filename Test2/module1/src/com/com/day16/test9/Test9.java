package com.com.day16.test9;

import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        //lambda对listforeach的遍历
        System.out.println("lambda对listforeach的遍历");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.forEach((Integer integer)->{
            System.out.println(integer);
        });

        //lambda对setforeach的遍历
        System.out.println("lambda对setforeach的遍历");
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("d");
        set.add("e");
        set.forEach((s -> {
            System.out.println(s);
        }));

        //lambda对setforeach的遍历
        System.out.println("lambda对setforeach的遍历");
        Map<String,Integer>  map = new HashMap<>();
        map.put("A",20);
        map.put("B",10);
        map.put("C",1210);
        map.put("d",2);
        map.put("e",30);
        map.put("f",50);
        //普通方式的遍历
//        for(Map.Entry<String,Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey()+entry.getValue());
//        }
        map.forEach((k,v)->{
            System.out.println(k+v);
        });


    }
}
