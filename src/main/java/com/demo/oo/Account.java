package com.demo.oo;

public class Account {
    private int accNumber;
    private double balance;

    private String name;

    public Account() {
    }

    public Account(int accNumber, double balance, String name) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.name = name;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public void withDraw(double amount)
    {
        this.balance -= amount;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNumber=" + accNumber +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }
}
