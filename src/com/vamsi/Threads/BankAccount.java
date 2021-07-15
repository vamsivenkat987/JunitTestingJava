package com.vamsi.Threads;

public class BankAccount {
    private double money;
    private String name;
    public static final int CHECKING =1;
    public static final int SAVINGS =2;
    private int accountType;

    public BankAccount(double money, String name,int accountType) {
        this.money = money;
        this.name = name;
        this.accountType = accountType;
    }
    public double deposit(double money,boolean flag){
        if (flag){
            this.money += money;
        }
        return this.money;
    }
    public void withDrawl(double money,boolean flag){
        if (flag){
            this.money -= money;
        }
    }

    public double getMoney() {
        return money;
    }
    public boolean isChecking(){
        return accountType == CHECKING;
    }
}
