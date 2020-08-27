package com.com.day05;

public class Manager {
    private String name;
    private int id;
    private int salary;
    private int money;

    public Manager() {
    }

    public Manager(String name, int id, int salary, int money) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void intro(){
        System.out.println("经理姓名:"+name);
        System.out.println("工号:"+id);
    }
    public void showSlary(){
        System.out.println("基本工资为"+salary+",奖金为"+money);
    }
    public  void work(){
        System.out.println("正在努力的做着管理工作，分配任务，检查员工提交上来的代码");
    }
}
