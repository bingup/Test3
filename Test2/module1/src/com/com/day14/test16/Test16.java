package com.com.day14.test16;

import com.sun.xml.internal.ws.util.QNameMap;

import java.util.*;

public class Test16 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (map.size() < 5) {
            System.out.println("请输入书名:");
            String s = sc.nextLine();
            System.out.println("请输入价格:");
            Double d = sc.nextDouble();
            sc.nextLine();
            map.put(s, d);
        }
        map.put("java", 38.8);
        map.remove("c++");
        System.out.println("keySet方式遍历map");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Double num = map.get(key);
            System.out.println(key + "=" + num);
        }
        System.out.println("entrySet方式遍历map");
        Iterator<Map.Entry<String, Double>> entrys = map.entrySet().iterator();
        while (entrys.hasNext()) {
            Map.Entry<String, Double> entry = entrys.next();
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
