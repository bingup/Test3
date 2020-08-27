package com.com.day08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test09 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("bca");
        list.add("dadfa");
        list.add("dddaaa");
        list.add("我来啦你干嘛呢");
        list.add("别跑啊");
        list.add("你好啊");

        System.out.println(list);
        for (int i = list.size()-1; i >=0; i--) {
            if (list.get(i).length() > 4) {
                list.remove(i);
            }
        }
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//           if (iterator.next().length()>4){
//               iterator.remove();
//           }
//
//
//        }

        System.out.println("被删除后的" + list);

    }
}
