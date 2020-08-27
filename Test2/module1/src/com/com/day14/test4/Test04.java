package com.com.day14.test4;

import java.util.HashMap;
import java.util.Iterator;

public class Test04 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
        map.put("黄晓明", "baby");
        map.put("谢霆锋", "张柏芝");
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            String value = map.get(key);
            System.out.println("key:" + key + "value:" + value);
        }

    }
}
