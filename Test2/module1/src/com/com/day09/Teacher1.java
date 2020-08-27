package com.com.day09;

public class Teacher1 extends Person1 {
    private String xueke;

    public Teacher1(String name, int age, String xueke) {
        super(name, age);
        this.xueke = xueke;
    }

    public Teacher1(String xueke) {
        this.xueke = xueke;
    }

    public Teacher1() {
    }

    public String getXueke() {
        return xueke;
    }

    public void setXueke(String xueke) {
        this.xueke = xueke;
    }
}
