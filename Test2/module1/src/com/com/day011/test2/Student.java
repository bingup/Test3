package com.com.day011.test2;

public class Student {
    private String name;
    private String isdo;

    public Student(String name, String isdo) {
        this.name = name;
        this.isdo = isdo;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsdo() {
        return isdo;
    }

    public void setIsdo(String isdo) {
        this.isdo = isdo;
    }
}
