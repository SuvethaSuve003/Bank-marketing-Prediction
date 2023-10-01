package com.demo.oo;

import com.demo.entity.Person;

import java.time.LocalDate;


public class UsePerson {

    public static void main(String[] args) {
        Person person = new Person();

        person.setBirthdate(LocalDate.of(2000,12,25));
        person.setName("dee");
        System.out.println(person.getName());

        //person1 is pointing to person, same object ref
        Person person1=person;
        person1.setId(100);
        person1.setName("deirdre");
        System.out.println(person1.getName());

        //primitives own copy
        int num1=10;
        int num2=num1;
        num2=100;


        //testing constructors
        Person person2 = new Person(3,"Aoife", LocalDate.of(2000,3,3));
        System.out.println(person2);



    }
}

