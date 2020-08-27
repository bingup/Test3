package com.Reflect00;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest02 {

    @Test
    public void test01() {
        Class c = Student.class;
        System.out.println("获取所有public修饰符的构造方法");
        Constructor<?>[] constructors = c.getConstructors();
        for (Constructor c1 : constructors) {
            System.out.println(c1);
        }
    }

    @Test
    public void test02() {
        Class c = Student.class;
        System.out.println("获取所有构造方法");
        Constructor<?>[] constructors = c.getDeclaredConstructors();
        for (Constructor c1 : constructors) {
            System.out.println(c1);
        }
    }

    @Test
    public void test03() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = Student.class;
        Constructor<Student> dc = c.getDeclaredConstructor(String.class, String.class);
        dc.setAccessible(true);
        Student stu = dc.newInstance("z", "Z");
        System.out.println(stu);
    }

    @Test
    public void test04() throws Exception {
        Class c = Student.class;
        Constructor<Student> dc = c.getConstructor();
        Student student = dc.newInstance();
        System.out.println(student);
    }

    @Test
    public void test05() throws Exception {
        Student student = new Student();
        Class c = student.getClass();
        Constructor<Student> sc = c.getConstructor(String.class, String.class,
                int.class);
        Student student1 = sc.newInstance("张三", "男", 20);
        System.out.println(student1);
    }

    @Test
    public void test06() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Student student = new Student();
        Class c = student.getClass();
        Student student1 = (Student) c.newInstance();
        Method method = c.getMethod("eat");
        Object invoke =  method.invoke(student1);
        System.out.println(invoke);
        Method method1 = c.getMethod("sleep", int.class);
        method1.invoke(student1,20);

    }
}
