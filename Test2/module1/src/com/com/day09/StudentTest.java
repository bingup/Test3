package com.com.day09;

public class StudentTest {
    public static void main(String[] args) {
        Teacher1 teacher1 = new Teacher1("王小平",20,"java课");
        Student student = new Student("李小乐",20,90);

        System.out.println(teacher1.getName()+","+"讲授"+teacher1.getXueke());
        System.out.println(student.getName()+","+"考试得了:"+student.getFen());
    }
}
