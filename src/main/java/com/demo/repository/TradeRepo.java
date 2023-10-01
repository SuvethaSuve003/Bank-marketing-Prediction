package com.demo.repository;

import com.demo.entity.Trade;

import java.util.List;
//CRUD
public interface TradeRepo {
    List<Trade> all();
    Trade find(int id);
    int count();
    void save(Trade trade);
    void update(Trade trade);
    void delete(int id);

}
