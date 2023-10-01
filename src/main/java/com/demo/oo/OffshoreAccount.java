package com.demo.oo;

public class OffshoreAccount extends Account{
    private String nation;
    private int taxCode;

    public OffshoreAccount() {
    }

    public OffshoreAccount(int accNumber, double balance, String name, String nation, int taxCode) {
        super(accNumber, balance, name);
        this.nation = nation;
        this.taxCode = taxCode;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(int taxCode) {
        this.taxCode = taxCode;
    }

    @Override
    public void withDraw(double amount) {
        super.withDraw(amount);
        if (this.taxCode==1) {
            super.withDraw(1);
        }
    }
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        if (this.taxCode==1) {
        super.deposit(1.99);
        }
    }

    @Override
    public String toString() {
        return "OffshoreAccount{" +
                "nation='" + nation + '\'' +
                ", taxCode=" + taxCode +
                "} " + super.toString();
    }
}
