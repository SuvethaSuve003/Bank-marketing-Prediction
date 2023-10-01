package com.demo.oo;

public class UseMail {
    public static void main(String[] args) {
        //scenario 1
        System.out.println("==========scenario 1===========");
        Outlook outlook = new Outlook();
        outlook.send();
        outlook.print();
        outlook.makeAppointment();

        System.out.println("==========scenario 2===========");
        Mail mail = new Outlook();
        mail.send();
        ((Print) mail).print();
        ((Outlook) mail).makeAppointment();


        //scenario 3
        System.out.println("==========scenario 3===========");
        Mail mail2 = new Gmail();
        mail2.send();
        ((Print) mail2).print();
        ((Gmail) mail2).drive();



    }
}
