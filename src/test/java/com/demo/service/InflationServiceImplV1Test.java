package com.demo.service;

import com.demo.exceptions.InvalidYearException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class InflationServiceImplV1Test {

    @Autowired
    InflationServiceImplV1 inflationServiceImplV1;

    @Test
    void find() {
        //TODO lambdas in java
        //lambda
        assertThrows(InvalidYearException.class, () ->
        {
            inflationServiceImplV1.find(2050);
        });

    }
}