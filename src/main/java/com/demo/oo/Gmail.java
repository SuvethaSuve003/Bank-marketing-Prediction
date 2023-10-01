package com.demo.oo;

public class Gmail implements Mail, Print{
    @Override
    public void send() {
        System.out.println("Gmail send");
    }

    @Override
    public void receive() {
        System.out.println("Gmail receive");
    }

    @Override
    public int totalUnread() {
        return 200;
    }

    @Override
    public void print() {
        System.out.println("Gmail print");
    }

    public void drive()
    {
        System.out.println("Gmail drive");
    }
}
