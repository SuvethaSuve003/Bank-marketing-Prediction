package com.demo.oo;

import com.demo.entity.Person;

import java.time.LocalDate;

public class Resident extends Person {
    private int residence;

    public Resident()
    {

    }
    public Resident (int id, String name, LocalDate birthdate, int residence)
    {
        super(id,name,birthdate);
        this.residence=residence;


    }


    public int getResidence() {
        return residence;
    }
    public void setResidence(int residence) {
        this.residence = residence;
    }


    @Override
    public String toString() {
        return super.toString() + " ,Residence: " + this.residence;
    }
}
