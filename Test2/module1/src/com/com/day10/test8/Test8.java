package com.com.day10.test8;

import com.com.day10.test4.Phone;

public class Test8 {
    public static void main(String[] args) {
        GouWuChe gouWuChe = new GouWuChe();
        EGoods laptop = new Laptop("g10000","笔记本",10000);
        EGoods phone = new Phone("g10001","手机",5000);
        Fruit fruit = new Fruit("g20000","苹果",50);
        gouWuChe.addGoods(laptop);
        gouWuChe.addGoods(phone);
        gouWuChe.addGoods(fruit);
        gouWuChe.showGoods();
        gouWuChe.total();


    }
}
