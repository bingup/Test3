package com.com.day13.test15;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        Student s1 = new Student("a", 11, 60);
        Student s2 = new Student("b", 12, 50);
        Student s3 = new Student("c", 13, 80);
        Student s4 = new Student("d", 12, 88);
        Student s5 = new Student("e", 11, 50);
        Student s6 = new Student("b", 12, 50);
        Student s7 = new Student("c", 13, 80);
        Student s8 = new Student("d", 12, 88);
        Student s9 = new Student("e", 11, 50);
        Student s10 = new Student("f", 11, 50);
        Set<Student> set  = new HashSet<>();
        Collections.addAll(set,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
        Iterator<Student> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
        System.out.println("==============================");
        set.forEach(student -> System.out.println(student.toString()));
    }
}
