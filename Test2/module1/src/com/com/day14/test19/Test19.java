package com.com.day14.test19;

import java.util.HashMap;

public class Test19 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        map.put("智多星","吴用");
        System.out.println(map);
        map.remove("玉麒麟");
        map.put("智多星",null);
        map.put("呼保义","宋江");
        map.remove("及时雨");
        System.out.println(map);

    }
}
