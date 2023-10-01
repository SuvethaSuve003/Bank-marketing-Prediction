package com.demo.di;

import org.springframework.stereotype.Component;

@Component("hunter")
public class Dog implements Pet{
    @Override
    public void feed() {
        System.out.println("Bone");
    }

    @Override
    public void wash() {
        System.out.println("Swim");
    }
}
