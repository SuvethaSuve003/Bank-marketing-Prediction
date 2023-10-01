package com.demo.controller;

import com.demo.di.Pet;
import com.demo.repository.TradeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//url endpoints
@RestController
@RequestMapping("statusapi")
public class StatusController {
    @Qualifier("george")
    @Autowired  // take from the container, an object that implements the Pet Interface
    Pet pet;

    @Qualifier("hunter")
    @Autowired  // take from the container, an object that implements the Pet Interface
    Pet petDog;

    @RequestMapping("status")
    public String getStatus()
    {
        return  "Status Controller is running";
    }

    @RequestMapping("feed")
    public String feedthepet()
    {
        pet.feed();
        return  "fed";
    }

    @RequestMapping("feedthedog")
    public String feedthedog()
    {
        petDog.feed();
        return  "fed";
    }

    @RequestMapping("feedthecat")
    public String feedthecat()
    {
        pet.feed();
        return  "fed";
    }

    @Autowired
    TradeRepo tradeRepo;

    @RequestMapping("count")
    public int count()
    {
        return tradeRepo.count();
    }

}
