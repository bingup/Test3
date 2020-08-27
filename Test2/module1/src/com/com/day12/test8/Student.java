package com.com.day12.test8;

public class Student {
    private String nmae;
    private int age;
    private int score;

    public Student(String nmae, int age, int score) {
        this.nmae = nmae;
        this.age = age;
        this.score = score;
    }

    public Student() {
    }

    public String getNmae() {
        return nmae;
    }

    public void setNmae(String nmae) {
        this.nmae = nmae;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
