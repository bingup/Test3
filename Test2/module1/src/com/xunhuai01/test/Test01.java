package com.xunhuai01.test;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
//        Start start = new Start("周星驰","boy",
//                "功夫");
//        Student student = new Student("周星星","男",18);
//        Tracher tracher = new Tracher("星仔",30,"演戏");
//        start.show();
//        start.Sing();
//        student.sleep();
//        student.study();
//        tracher.add();
//        tracher.speak();


//        Dog dog1 = new Dog();
//        Dog dog2 = new Dog("中华田园犬", 10, "黄色");
//        Dog dog3 = new Dog("柯基", 5, "黄色");
//        dog1.setAge(3);
//        dog1.setColor("黄色");
//        dog1.setName("藏獒");
//
//        ArrayList<Dog> list = new ArrayList<>();
//        list.add(dog1);
//        list.add(dog2);
//        list.add(dog3);
//        int max = dog1.getAge();
//        for (Dog do1 :list){
//            do1.show();
//        }
//        Dog d = dog1;
//        for (Dog dog : list) {
//
//            if (dog.getAge() > max) {
//                max = dog.getAge();
//                d = dog;
//            }
//        }
//        d.show();

        Student student1=new Student("a",100,"男");
        Student student2=new Student("b",20,"男");
        Student student3=new Student("c",110,"女");
        ArrayList<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        for(Student student :list ){
            System.out.println("姓名："+student.getName()+",年龄："+student.getAge()+",性别："+student.getSex());

        }
        Student max=list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(max.getAge()<list.get(i).getAge()){
                max=list.get(i);
            }
        }
        System.out.println("姓名："+max.getName()+",年龄："+max.getAge()+",性别："+max.getSex());
        max.setName("小魔仙");
        System.out.println("姓名："+max.getName()+",年龄："+max.getAge()+",性别："+max.getSex());


    }
}
