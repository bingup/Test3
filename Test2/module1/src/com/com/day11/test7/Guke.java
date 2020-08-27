package com.com.day11.test7;

class GouWuChe {
    private String name;
    private double sum;
    private int num;
    private double money;

    public GouWuChe() {
    }

    public GouWuChe(String name, double sum, int num, double money) {
        this.name = name;
        this.sum = sum;
        this.num = num;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return name+" "+sum+"  "+num+"   "+money;
    }
}
