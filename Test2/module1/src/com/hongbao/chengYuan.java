package com.hongbao;

import java.util.ArrayList;

public class chengYuan extends User {
    @Override
    public void work() {
        super.work();
    }

    public chengYuan() {
    }

    public chengYuan(String username, Double money) {
        super(username, money);
    }

    public  void shouHongBao(ArrayList<Double> hongbao){
        double d1 = hongbao.remove(0);
        double newMoney = getMoney() +d1;
        setMoney(newMoney);


    }
}
