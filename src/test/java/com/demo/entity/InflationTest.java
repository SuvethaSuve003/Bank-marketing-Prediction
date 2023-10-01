package com.demo.entity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class InflationTest {
    private Inflation inflation;
    @BeforeEach
    public void setup()
    {
        inflation = new Inflation(2024,0.01F, 5000.66);
    }
    @Test
    public void getYearReturnCorrectValue()
    {
        assertTrue(inflation.getYear()==2024);
    }
    @Test
    public void getInflationReturnCorrectValue()
    {
        assertTrue(inflation.getInflation()==0.01F);
    }
    @Test
    public void getAverageFloorPriceReturnCorrectValue()
    {
        assertTrue(inflation.getAverageFloorPrice()==2024);
    }
}