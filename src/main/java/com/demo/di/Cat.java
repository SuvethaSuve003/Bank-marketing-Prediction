package com.demo.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("george")
public class Cat implements Pet{
    @Override
    public void feed() {
        System.out.println("fish");
    }

    @Override
    public void wash() {
        System.out.println("self cleaned");
    }
}
