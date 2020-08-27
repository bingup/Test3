package com.hongbao;

import java.util.ArrayList;

public class QunZhu extends User {
    @Override
    public void work() {
        super.work();
    }



    public QunZhu(String username, Double money) {
        super(username, money);
    }

    public ArrayList<Double> faHongBao(Double money1,int count){
        ArrayList<Double> list =new ArrayList<>();
        //剩余的钱
        Double money2 = getMoney();
        Double yue = money2 - money1;
        setMoney(yue);

        double newMoney = money1 /count;
        for (int i=0;i<count;i++){
            list.add(newMoney);
        }


        return list;
    }
}
