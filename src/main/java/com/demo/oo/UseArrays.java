package com.demo.oo;

import java.time.LocalDate;

public class UseArrays {

    public static void main(String[] args) {
        //array of residents
        Resident[] residents = new Resident[3];
        residents[0] = new Resident(1,"dee", LocalDate.of(2000,1,1),1);
        residents[1] = new Resident(2,"deirdre", LocalDate.of(2009,1,1),1);
        residents[2] = new Resident(3,"aoife", LocalDate.of(2005,1,1),1);

        for(Resident acc : residents)
        {
            System.out.println(acc);
        }

        for (int i=0; i<residents.length; i++) {
            System.out.println(residents[i]);
        }
    }



}
