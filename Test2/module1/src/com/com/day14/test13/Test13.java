package com.com.day14.test13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test13 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("cbd");
        HashMap<Character, Integer> map = new HashMap<>();

        for (String s : list) {
            char[] chs = s.toCharArray();
            for (int i = 0; i < chs.length; i++) {
                if (map.containsKey(chs[i])) {
                    Integer value = map.get(chs[i]) + 1;
                    map.put(chs[i],value );
                }else{
                    map.put(chs[i],1);
                }
            }
        }
        System.out.println(map);
    }
}
