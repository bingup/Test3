package com.com.day011.test5;

public class Player {

    public FightAble select(String str){
        if(str == "法力角色"){
            Fashi fa= new Fashi();
              return  fa;
        }else{
            Zhanshi zhanshi = new Zhanshi();
            return  zhanshi;
        }


    }
}
