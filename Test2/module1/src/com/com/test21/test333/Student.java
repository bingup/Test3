package com.com.test21.test333;

public class Student {


    private String name;
    private String sex;
    private int age;

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;

    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //protested修饰构造
    protected Student(String name, String sex) {
        System.out.println("protect修饰符");
        this.name = name;
        this.sex = sex;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    //公有方法
    public  void eat(){
        System.out.println("chifan");
    }
    //有参数的方法
    public void sleep(int num ){
        System.out.println(num+"shuijiaoshuinimab");
    }

    //私有方法
    private void show(){
        System.out.println("biaoyan");
    }
}
