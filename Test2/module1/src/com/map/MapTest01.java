package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
* map接口中定义的方法，常用的如下
* public V put(K Key。V value）
* pulic  V remove（object key） 在指定的键所对应的值在map集合中删除，返回被删除元素的值
* public V get（Oject key）
 containskey (object Key) 判断集合中是否包含该键值
 public Set<K> Keyset（） 获取map集合中所有的键，存放到set集合中

 如果要保证map中存放的key和取出的顺序一致，可以使用 java.util.LinkedHashMap 集合来存放
 如果要保证map中存放的key和取出的顺序一致，可以使用 java.util.LinkedHashMap 集合来存放
 */
public class MapTest01 {
    public static void main(String[] args) {
        LinkedHashMap<String,String > map = new LinkedHashMap<>();
        map.put("nikma","nidie");
        map.put("nima","niqinma");
        map.put("jianrne","gou");
        map.put("nima","jiangou");
//        System.out.println(map);
//        System.out.println(map.remove("nima"));
//        //map集合遍历键找值的方式
//        Set<String> keys = map.keySet();
//        for(String key :keys){
//            String value = map.get(key);
//            System.out.println(value);
//        }

        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry :entrySet){
            String key =entry.getKey();
            String value = entry.getValue();
            System.out.println(key+value);
        }
    }
}
