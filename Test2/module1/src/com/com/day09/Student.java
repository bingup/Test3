package com.com.day09;

public class Student extends Person1 {
    private int  fen;

    public Student(String name, int age, int fen) {
        super(name, age);
        this.fen = fen;
    }

    public Student() {
    }

    public int getFen() {
        return fen;
    }

    public void setFen(int fen) {
        this.fen = fen;
    }
}
