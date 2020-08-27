package com.com.day10.test6;

public class SportTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("马云",45);
        SportTeacher t2 = new SportTeacher("大姚",35);
        Student s1 = new Student("小王",20);
        SportStudent S2 = new SportStudent("王中王",21);
       // goToSprot(t1);
        goToSprot(t2);
  //      goToSprot(s1);
        goToSprot(S2);

    }

    public static void goToSprot(Sport sport){
        sport.playBasketball();
    }
}
