package com.demo.entity;

import java.time.LocalDate;

public class Person {
    //fields
    private int id;
    private String name;
    private LocalDate birthdate;

    public Person()
    {

    }
    public Person (int id, String name, LocalDate birthdate)
    {
        this.id=id;
        this.name=name;
        this.birthdate=birthdate;
    }



    public int getId()
    {
        return  this.id;
    }
    public void setId(int id)
    {
        this.id=id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthdate() {
        return this.birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Name:" + this.name + " ,id:" +  this.id + " ,birthdate:" +  this.birthdate;
    }
}
