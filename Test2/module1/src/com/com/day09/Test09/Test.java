package com.com.day09.Test09;

public class Test {
    public static void main(String[] args) {
        Teacher l = new Teacher("666","傅红雪");
        l.work();
        Tutor t = new Tutor("668","顾棋");
        t.work();
        Maintainer m = new Maintainer("686","庖丁");
        m.work();
        Buyer b = new Buyer("888","景甜");
        b.work();
    }
}
