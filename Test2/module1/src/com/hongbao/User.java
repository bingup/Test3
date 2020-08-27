package com.hongbao;

public class User {
    private String username;
    private Double money;


    public void work(){
        System.out.println("用户名："+username+"余额"+money);
    }

    public User() {
    }

    public User(String username, Double money) {
        this.username = username;
        this.money = money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
