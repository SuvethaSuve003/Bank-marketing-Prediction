package com.demo.service;

import com.demo.entity.Inflation;
import com.demo.exceptions.InvalidInflationRateException;
import com.demo.exceptions.InvalidYearException;
import com.demo.repository.InflationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InflationServiceImplV1 implements InflationService{

    @Autowired
    InflationRepo inflationRepo; //di = at runtime, spring scans all our components, looks
    //for a component that implements InflationRepo and is decorated with @component
    // or @respository > MySqlInflationRepo mySqlInflationRepo = new ...
    @Override
    public List<Inflation> all() {
        return inflationRepo.all();
    }

    @Override
    public int count() {
        return inflationRepo.count();
    }

    @Override
    public Inflation find(int year) {
        if (year < 1895 || year > 2030)
        {
            throw new InvalidYearException("Invalid input", "Valid years are 1895-2030");
        }

        return inflationRepo.find(year);
    }

    @Override
    public void insert(Inflation inflation) {
        if (inflation.getYear() < 1895 || inflation.getYear() > 2030)
        {
            throw new InvalidYearException("Invalid input", "Valid years are 1895-2030");
        }

        if (inflation.getInflation() < 0 )
        {
            throw new InvalidInflationRateException("Rate must be positive");
        }

        if (inflationRepo.find(inflation.getYear())!=null)
        {
            throw new DuplicateKeyException("Record exists");
        }

        inflationRepo.insert(inflation);

    }

    @Override
    public void update(Inflation inflation) {
        if (inflation.getYear() < 1895 || inflation.getYear() > 2030)
        {
            throw new InvalidYearException("Invalid input", "Valid years are 1895-2030");
        }

        if (inflation.getInflation() < 0 )
        {
            throw new InvalidInflationRateException("Rate must be positive");
        }

        inflationRepo.update(inflation);
    }

    @Override
    public void delete(int year) {
        if (year < 1895 || year > 2030)
        {
            throw new InvalidYearException("Invalid input", "Valid years are 1895-2030");
        }

        inflationRepo.delete(year);
    }
}
