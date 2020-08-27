package com.com.day11.test7;

public class Goods {
    private String id;
    private String name;
    private double price;
    private String danwei;

    public Goods(String id, String name, double price, String danwei) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.danwei = danwei;
    }

    public Goods() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }

    @Override
    public String toString() {
        return id+"   "+name+"  "+price+"   "+danwei;
    }
}
