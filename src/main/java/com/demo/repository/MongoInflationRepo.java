package com.demo.repository;

import com.demo.entity.Inflation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Repository
public class MongoInflationRepo implements InflationRepo{

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<Inflation> all() {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public Inflation find(int year) {
        return null;
    }

    @Override
    public void insert(Inflation inflation) {
        mongoTemplate.save(inflation);
    }

    @Override
    public void update(Inflation inflation) {

    }

    @Override
    public void delete(int year) {

    }
}
