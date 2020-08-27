package com.com.day011.test2;

public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDo(Student student,String isdo){
     student.setIsdo(isdo);
    }
}
