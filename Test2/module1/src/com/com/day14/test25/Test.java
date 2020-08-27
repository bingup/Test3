package com.com.day14.test25;

public class Test {
    public static void main(String[] args) {
        try {
//            login("asd","asd");
//            login("admin","1");
            login("admin","admin");
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
    public static  void login(String name,String pwd) throws LoginException {
        if (name != "admin"){
            throw new LoginException("用户名不存在");
        }
        if(pwd != "admin"){
            throw  new LoginException("密码错误");
        }
        System.out.println("欢迎"+name);

    }
}
