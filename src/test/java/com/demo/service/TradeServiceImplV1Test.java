package com.demo.service;

import com.demo.entity.Apartment;
import com.demo.entity.Person;
import com.demo.entity.Trade;
import com.demo.exceptions.InvalidYearException;
import com.demo.exceptions.TradeException;
import com.demo.repository.TradeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.transaction.TransactionDefinition;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
class TradeServiceImplV1Test {

    @MockBean
    TradeRepo tradeRepo;

    @Autowired
    TradeService tradeService;
    @Test
    void findValidIdReturnsATrade() {
        Trade trade = new Trade();
        when(tradeRepo.find(anyInt())).thenReturn(trade);
        var result = tradeService.find(10);
        assertNotNull(result);

    }

    @Test
    void saveThrowExceptionsWhenApartmentIsnull() {
        assertThrows(TradeException.class, () ->
        {
            Trade trade = new Trade();
            tradeService.save(trade);
        });
    }
    @Test
    void saveThrowExceptionsWhenSellerIsnull() {
        assertThrows(TradeException.class, () ->
        {
            Trade trade = new Trade(1,new Apartment(1,1,1,1,1),
                    null, 1.99, LocalDate.now());


            tradeService.save(trade);
        });
    }

    @Test
    void saveSaveATrade() {

        Trade trade = new Trade(10,new Apartment(1,1,1,1,1),
                new Person(1,"Dee", LocalDate.now()), 1.99, LocalDate.now());

        when(tradeRepo.find(anyInt())).thenReturn(null);
        tradeService.save(trade);

        verify(tradeRepo).save(trade);

    }


}