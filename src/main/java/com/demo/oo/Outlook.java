package com.demo.oo;

public class Outlook implements Mail, Print{
    @Override
    public void send() {
        System.out.println("Outlook send");
    }

    @Override
    public void receive() {
        System.out.println("Outlook receive");
    }

    @Override
    public int totalUnread() {
        return 100;
    }

    @Override
    public void print() {
        System.out.println("Outlook print");
    }

    public void makeAppointment()
    {
        System.out.println("Appointment");
    }
}
