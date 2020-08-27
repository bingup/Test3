package com.com.day14.test17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test17 {
    public static void main(String[] args) {
        String[] arr1 = {"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] arr2 = {"哈尔滨","杭州","南昌","广州","福州"};
        HashMap<String,String> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i],arr2[i]);
        }
//        System.out.println(map);
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry :entrySet){
            String s1 = entry.getKey();
            String s2= entry.getValue();
            System.out.println(s1+"="+s2);
        }

    }
}
