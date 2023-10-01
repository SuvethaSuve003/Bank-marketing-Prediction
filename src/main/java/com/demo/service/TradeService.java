package com.demo.service;

import com.demo.entity.Trade;

import java.util.List;

public interface TradeService {
    List<Trade> all();
    Trade find(int id);
    int count();
    void save(Trade trade);
    void update(Trade trade);
    void delete(int id);
}
