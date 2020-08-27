package com.com.day10.test8;

public class Goods {
    public String id;
    public String name;
    public double price;

    public Goods(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Goods() {
    }

    @Override
    public String toString() {
        return id+","+name+","+price;
    }
}
