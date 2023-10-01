package com.demo.repository;

import com.demo.entity.Inflation;

import java.util.List;

public interface InflationRepo {
    List<Inflation> all();
    int count();
    Inflation find(int year);
    void insert(Inflation inflation);
    void update(Inflation inflation);
    void delete(int year);
}
