package com.com.day14.test7;


import com.com.day14.test6.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test07 {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        Student s1 = new Student("a", 11);
        Student s2 = new Student("b", 12);
        Student s3 = new Student("c", 13);
        Student s4 = new Student("d", 14);
        map.put(s1, "广州");
        map.put(s2, "上海");
        map.put(s3, "饶州");
        map.put(s4, "江西赣州");
        System.out.println("使用keySet方式遍历map");
        Set<Student> list = map.keySet();
        for (Student student : list) {
            String value = map.get(student);
            System.out.println(student.getAge() + "岁的" + student.getName() + "居住在" + value);
        }
        System.out.println("使用entrySet方式遍历map");
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries){
            Student student = entry.getKey();
            String value = entry.getValue();
            System.out.println(student.getAge() + "岁的" + student.getName() + "居住在" + value);

        }

    }
}
