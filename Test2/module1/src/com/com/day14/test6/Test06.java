package com.com.day14.test6;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test06 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        Student s1 = new Student("a",11);
        Student s2 = new Student("b",12);
        Student s3 = new Student("c",13);
        Student s4 = new Student("d",14);
        map.put("广东广州",s1);
        map.put("广东潮汕",s2);
        map.put("北京",s3);
        map.put("福建胡州",s4);
        System.out.println("使用keySet方法遍历map");
        Set<String> keys = map.keySet();
        for (String key :keys){
            Student stu = map.get(key);
            System.out.println(stu.getAge()+"岁的"+stu.getName()+"居住在"+key);
        }
        System.out.println("使用entrySet方法遍历map");
        Set<Map.Entry<String,Student>> entry  = map.entrySet();
        for(Map.Entry<String,Student> entry1 :entry){
            String key = entry1.getKey();
            Student student = entry1.getValue();
            System.out.println(student.getAge()+"岁的"+student.getName()+"居住在"+key);
        }

    }
}
