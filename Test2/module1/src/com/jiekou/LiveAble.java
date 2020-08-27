package com.jiekou;
/*
*接口中的抽象方法有重名的话，只需要重写一次
* 默认方法:在实现多个接口中，如果多个接口中包含有同名方法，子类必须实现实现该方法
* 静态方法，存在同名的静态方法不会冲突，原因是通过各自的接口名访问静态方法
*
*int num =10
* public static final int num = 10;
* */
public interface LiveAble {
    public abstract void eat();
    public abstract void sleep();
    public default void fly(){
        System.out.println("sb");
    }

}
