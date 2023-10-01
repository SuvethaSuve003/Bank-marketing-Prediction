package com.demo.oo;

public class UseAccount {

    public static void main(String[] args) {
        Account account = new Account();
        account.setName("dee");
        account.deposit(1000);
        account.withDraw(100);
        System.out.println(account);


        OffshoreAccount offshoreAccount= new OffshoreAccount();
        offshoreAccount.setName("dee offshore");
        offshoreAccount.setTaxCode(1);
        offshoreAccount.deposit(1000);
        offshoreAccount.withDraw(100);

        System.out.println(offshoreAccount);

        processAccount(account, 50);
        processAccount(offshoreAccount, 200);

    }

    public static void processAccount(Account account, double amt)
    {
        account.withDraw(amt);
        System.out.println(account);
    }
}
