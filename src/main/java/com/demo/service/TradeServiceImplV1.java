package com.demo.service;

import com.demo.entity.Trade;
import com.demo.exceptions.TradeException;
import com.demo.repository.TradeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TradeServiceImplV1  implements TradeService {

    @Autowired
    TradeRepo tradeRepo;
    @Override
    public List<Trade> all() {
        return tradeRepo.all();
    }

    @Override
    public Trade find(int id) {
        if (id < 0 )
        {
            throw new IllegalArgumentException("ID must be over 0");
        }
        return tradeRepo.find(id);//mock

    }

    @Override
    public int count() {
        return tradeRepo.count();
    }

    @Override
    public void save(Trade trade) {
        if (trade.getApartment() == null)
        {
            throw  new TradeException("Must specify apartment");
        }
        if (trade.getSeller() == null)
        {
            throw  new TradeException("Must specify seller");
        }

        if (find(trade.getId())== null )//mock
        {
            tradeRepo.save(trade); //mock
        }

    }

    @Override
    public void update(Trade trade) {

    }

    @Override
    public void delete(int id) {

    }
}
