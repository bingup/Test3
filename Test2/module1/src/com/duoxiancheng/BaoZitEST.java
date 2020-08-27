package com.duoxiancheng;

public class BaoZitEST {
    public static void main(String[] args) {

        Bun baoZi = new Bun();
        baoZi.setNumber(6);
        baoZi.setName("肉包");
        Customer customer = new Customer(baoZi);
        Product product = new Product(baoZi);
        (new Thread(customer, "猪八戒")).start();
        (new Thread(product, "小二")).start();
    }
}
