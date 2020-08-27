package com.com.day011.test2;

import java.util.ArrayList;

public class Class01 {
    private String name;
    private Teacher teacher;
    private ArrayList<Student> list;

    public Class01(String name, Teacher teacher, ArrayList<Student> list) {
        this.name = name;
        this.teacher = teacher;
        this.list = list;
    }

    public Class01() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }
    public  void show(){
        System.out.println("课程名称:"+name);
        System.out.println("授课老师:"+teacher.getName());
        for (Student s1 :list){
            System.out.println(s1.getIsdo()+":"+s1.getName());
        }
    }
}
