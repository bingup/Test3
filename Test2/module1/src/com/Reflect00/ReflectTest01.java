package com.Reflect00;

public class ReflectTest01 {
    //获取Class对象的三种方式
    //1.通过类名。class获取
    public static void main(String[] args) throws ClassNotFoundException {
        String s = "com.Reflect00.Student";
        Class c = Student.class;
        System.out.println(c);
        //通过object的的成员方法getclass（）方法获取
        Student stu = new Student();
        Class c2 = stu.getClass();
        System.out.println(c2);
        //通过Class.forName(s);s = 全限定类名

        Class c3 =Class.forName(s);
        System.out.println(c3);

        String s1 = c3.getName();

        String s2 = c.getSimpleName();
    }
}
