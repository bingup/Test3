package com.com.day14.test5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test05 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
        map.put("黄晓明", "baby");
        map.put("谢霆锋", "张柏芝");
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + "value:" + value);
        }
    }
}
