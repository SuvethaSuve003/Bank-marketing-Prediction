package com.demo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UsePet {
    @Qualifier("george")
    @Autowired
    Pet pet;

}
