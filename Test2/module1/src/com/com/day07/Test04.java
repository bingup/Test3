package com.com.day07;

import java.util.ArrayList;

public class Test04 {
    public static void main(String[] args) {
        Student s1 = new Student("it001", "黄渤", 1.72);
        Student s2 = new Student("it002", "孙红雷", 1.78);
        Student s3 = new Student("it003", "章子怡", 1.64);
        Student s4 = new Student("it004", "杨颖", 1.68);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);


        for (Student student :list)
        {
            System.out.println(student);
        }
        System.out.println("-----------------");
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).getHeight()>1.70){
                System.out.println(list.get(i));
            }
        }
    }
}
