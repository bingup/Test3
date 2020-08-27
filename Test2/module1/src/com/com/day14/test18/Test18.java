package com.com.day14.test18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test18 {
    public static void main(String[] args) {
        HashMap<String, HashMap> map1 = new HashMap<>();

        HashMap<String, String> map3 = new HashMap<>();
        HashMap<String, String> map4 = new HashMap<>();
        map3.put("001", "李晨");
        map3.put("002", "范冰冰");
        map4.put("001", "马云");
        map4.put("002", "马化腾");
        map1.put("java就业班", map4);
        map1.put("Java基础班", map3);
        System.out.println("1.使用keySet和增强for遍历map");
        Set<String> keys = map1.keySet();
        for (String key : keys) {
            HashMap<String,String> map = map1.get(key);
            System.out.println(key);
            Set<String> keys1 = map.keySet();
            for (String key1 : keys1){
                String value = map.get(key1);
                System.out.println(key1+" "+value);
            }
        }
        System.out.println("2.使用entrySet和迭代器遍历map");
        Iterator<Map.Entry<String, HashMap>> entryIterator = map1.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,HashMap> entry = entryIterator.next();
            String key = entry.getKey();
            System.out.println(key);
            HashMap<String,String> map = entry.getValue();
            Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<String,String> entry1 = it.next();
                String key1 = entry1.getKey();
                String value = entry1.getValue();
                System.out.println(key1+" " +value);
            }


        }

    }
}
