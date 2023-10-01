package com.demo.oo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UseCollections {
    public static void main(String[] args) {

        ArrayList general = new ArrayList();
        general.add(1);
        general.add("hello");
        general.add( new Resident(1,"dee", LocalDate.of(2000,1,1),1));

        System.out.println(general.get(2));

        //generics
        List<Resident> residentList = new ArrayList<>();
        residentList.add( new Resident(1,"dee", LocalDate.of(2000,1,1),1));
        residentList.add( new Resident(2,"deirdre", LocalDate.of(2000,1,1),1));

        for (Resident resident : residentList)
        {
            System.out.println(resident);
        }




    }
}
