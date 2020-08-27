package com.com.day17.test20;

import java.io.File;
import java.util.HashMap;

public class Test20 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        File file = new File("D:\\PDF课件\\方俊杰作业");
        show(file,map);
        map.entrySet().stream().forEach((entry)->{
            System.out.println(entry.getKey()+"的类型文件有"+entry.getValue()+"个");
        });
    }

    public static void show(File file, HashMap<String, Integer> map) {
        if (file == null){
            return;

        }

        File[] files = file.listFiles();

        for (File file1 : files) {

            if (file1.isFile()) {
                String s = file1.getName();
                String[] strings = s.split("\\.");
                if (map.containsKey(strings[1])) {
                    int a = map.get(strings[1]) + 1;
                    map.put(strings[1], a);
                } else {
                    map.put(strings[1], 1);
                }
            } else {
                show(file1,map);
            }
        }

    }
}
