package com.demo.oo;

import java.time.LocalDate;

public class UseResident {
    public static void main(String[] args) {
        Resident resident= new Resident();
        resident.setId(100);
        resident.setName("dee");
        resident.setResidence(999);
        System.out.println(resident); //invoking the toString

        Resident resident1 = new Resident(1,"Muireann", LocalDate.of(2003,3,4),2);
        System.out.println(resident1);


    }
}
