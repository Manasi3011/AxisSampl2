package com.Banking.entities;

public class Account {
    private int acntNo;
    private String type;
    private float balance;

    public Account(int acntNo, String type, float balance) {
        this.acntNo = acntNo;
        this.type = type;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "\n Account{" +
                "acntNo=" + acntNo +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int getAcntNo() {
        return acntNo;
    }

    public void setAcntNo(int acntNo) {
        this.acntNo = acntNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
