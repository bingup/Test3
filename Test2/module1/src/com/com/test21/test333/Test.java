package com.com.test21.test333;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) {

        try {
            Class c = Class.forName("com.com.test21.test333.Student");
            Student stu = (Student) c.newInstance();
            System.out.println(stu);
            Constructor<Student> dc = c.getConstructor();
//            constructor.newInstance();
            Student stu1 = dc.newInstance();
            System.out.println(stu1);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
