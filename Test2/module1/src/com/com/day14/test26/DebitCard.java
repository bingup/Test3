package com.com.day14.test26;

public class DebitCard {
    private int accountNumber;
    private int money;

    public DebitCard(int accountNumber, int money) {
        this.accountNumber = accountNumber;
        setMoney(money);
    }

    public DebitCard() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money < 0)
        {
            throw new MoneyException("钱不能为负数！！");
        }
            this.money = money;
    }
}
