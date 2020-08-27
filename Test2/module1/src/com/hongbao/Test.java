package com.hongbao;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        QunZhu q1 =new QunZhu("qunzhu",100.0);

        chengYuan c1 =new chengYuan("1",10.0);
        chengYuan c2 =new chengYuan("2",10.0);
        chengYuan c3 =new chengYuan("3",10.0);
        ArrayList<Double> A1 = q1.faHongBao(30.0,3);

        c1.shouHongBao(A1);
        c2.shouHongBao(A1);
        c3.shouHongBao(A1);
        c1.work();
        c2.work();
    }
}
