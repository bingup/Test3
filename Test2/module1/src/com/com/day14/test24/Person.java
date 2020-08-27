package com.com.day14.test24;

public class Person {
    private String name;
    private int lifevalue;

    public Person(String name, int lifevalue) {

        setLifevalue(lifevalue);
        setName(name);
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifevalue() {
        return lifevalue;
    }

    public void setLifevalue(int lifevalue) {
        if(lifevalue <0 ){
            throw  new NoLifeValueExption("生命值不能为负数:"+lifevalue);
        }
        this.lifevalue = lifevalue;
    }
}
