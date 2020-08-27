package com.com.day10.test8;

import java.util.ArrayList;

public class GouWuChe {
    public ArrayList<Goods> list = new ArrayList<>();

    public void addGoods(Goods goods) {
        System.out.println("加入" + goods.name + "成功");
        list.add(goods);
    }

    public void showGoods() {
        System.out.println("=============打印商品============");
        System.out.println("您选购的商品为：");
        for (Goods g : list
        ) {
            System.out.println(g);
        }
    }

    public void total() {
        System.out.println("-------------------");
        double sum = 0;
        for (Goods g : list) {
            sum += g.price;
        }

        double sum1 = 0;
        for (Goods g1 : list) {
            if(g1 instanceof EGoods){
                sum1 = sum1 + g1.price*0.88;
            }else{
                sum1 = sum1 +g1.price;
            }
        }
        System.out.println("原价为:" + sum + "元");
        System.out.println("折后价为:" + sum1 + "元");
    }
}
