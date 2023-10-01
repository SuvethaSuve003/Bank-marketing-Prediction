package com.demo.repository;

import com.demo.entity.Trade;
import org.springframework.stereotype.Repository;

import java.util.List;

public class MongoTradeRepo implements TradeRepo{
    @Override
    public List<Trade> all() {
        return null;
    }

    @Override
    public Trade find(int id) {
        return null;
    }

    @Override
    public int count() {
        return 0;//documents.count
    }

    @Override
    public void save(Trade trade) {

    }

    @Override
    public void update(Trade trade) {

    }

    @Override
    public void delete(int id) {

    }
}
