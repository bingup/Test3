package com.com.day14.test9;

import java.util.HashMap;
import java.util.Set;

public class Test09 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("柳岩", 2100);
        map.put("张亮", 1700);
        map.put("诸葛亮", 1800);
        map.put("灭绝师太", 2600);
        map.put("东方不败", 3800);
        int money = map.get("柳岩");
        map.replace("柳岩", money + 300);
        Set<String> list = map.keySet();
        for (String key : list){
            int value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
