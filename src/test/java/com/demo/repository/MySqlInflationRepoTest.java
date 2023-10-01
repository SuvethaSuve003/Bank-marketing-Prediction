package com.demo.repository;

import com.demo.entity.Inflation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.relational.core.sql.In;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MySqlInflationRepoTest {


    @Autowired
    MySqlInflationRepo mySqlInflationRepo;


    @Test
    void countReturnsValueOver0() {
        int actual = mySqlInflationRepo.count();
        assertTrue(actual>0);
    }
//TODO setup test data
    @Test
    void allReturnsSizeOver0() {
        List<Inflation> actual = mySqlInflationRepo.all();
        assertTrue(actual.size()>0);//size of the collection
    }

    @Test
    void find() {
        Inflation actual = mySqlInflationRepo.find(2023);
        assertNotNull(actual);

    }
    @Test
    void findInvalidYear() {
        Inflation actual = mySqlInflationRepo.find(2099);
        assertNull(actual);
    }

    @Test
    void insert() {
        Inflation inflation = new Inflation(2025,.02F, 50000);
        mySqlInflationRepo.insert(inflation);
        Inflation actual = mySqlInflationRepo.find(2025);
        assertNotNull(actual);
    }

    @Test
    void delete() {

        mySqlInflationRepo.delete(2025);
        Inflation actual = mySqlInflationRepo.find(2025);
        assertNull(actual);
    }

    @Test
    void update() {
        Inflation inflation = new Inflation(2023,.03F, 40000);
        mySqlInflationRepo.update(inflation);
        Inflation actual = mySqlInflationRepo.find(2023);
        assertTrue(actual.getAverageFloorPrice()==40000 &&  actual.getInflation()==.03F);


    }
}