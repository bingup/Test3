package com.com.day011.test5;

public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("选择：法力角色");
        FightAble f1= player.select("法力角色");
        f1.specialFight();
        f1.commonFight();
        System.out.println("===============");
        System.out.println("选择：战力角色");
        FightAble f2= player.select("战力角色");
        f2.specialFight();
        f2.commonFight();
    }
}
