package com.com.day09;

public abstract class Emp {
    String id;
    String name;
    double price;

    public abstract void work();
    public abstract void eat();


    public Emp(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
