package com.demo.repository;

import com.demo.entity.Apartment;
import com.demo.entity.Person;
import com.demo.entity.Trade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MySqlTradeRepoTest {
    @Autowired
    TradeRepo tradeRepo;
    @Test
    void countReturnsMorethan0rows() {
        int result = tradeRepo.count();
        assertTrue(result> 0);
    }

    @Test
    void allReturnsAListofTrade() {
        List<Trade> actual = tradeRepo.all();
        assertTrue(actual.size()> 0);


    }
//+ve
    @Test
    void findValidIdReturnATrade(){
            var actual =  tradeRepo.find(10);
            assertTrue(actual.getPrice()==13490.52);
    }
    //-ve
    @Test
    void findInvalidIdReturnANull(){
        var actual =  tradeRepo.find(2);
        assertNull(actual);
    }

    @Test
    void save() {
        Trade trade = new Trade(1,new Apartment(1,1,1,1,1),
                new Person(1,"Dee", LocalDate.now()), 1.99, LocalDate.now());
        int beforecount = tradeRepo.count();
        //save to H2
        tradeRepo.save(trade);//new id preparedStmt to get the new id
        //workaround
        assertEquals(beforecount+1,  tradeRepo.count());



    }

    //TODO - JACOCO report maven
}