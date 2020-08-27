package com.com.day16.test10;

import com.innnerclass.Start;

public class Person {
    private String name;
    private String sex;
    private static  int count = 1;

    public Person() {
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
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

    public  void show1(String name, String sex) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            synchronized (Object.class){
                while(count!=1){
                    Object.class.wait();
                }
                Thread.sleep(10);
                setName(name);
                setSex(sex);
                System.out.println("fuzhiwanbi");
                count=2;
                Object.class.notify();
            }

        }
    }
    public  void show2(String name, String sex) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            synchronized (Object.class){
                while(count!=2){
                    Object.class.wait();
                }
                Thread.sleep(10);
                System.out.println("名字:"+getName()+"性别:"+getSex()+i);
                count=1;
                Object.class.notify();
            }

        }
    }



}
