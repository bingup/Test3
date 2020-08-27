package com.com.day14.Test23;

public class Father {
  public void eat() throws ToothPainException {
      System.out.println("吃到了一个石头");
      throw  new ToothPainException("father");
  }

  public void drink(){
      System.out.println("喝什么都没问题");
  }
}
