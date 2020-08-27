package com.com.day09.Test09;



public class Buyer extends AdminStaff {
    @Override
    public void work() {
        System.out.println("工号为:"+id+"的采购专员"+name+"在采购音响设备");
    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    public Buyer() {
    }
}
