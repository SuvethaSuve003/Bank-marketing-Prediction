package com.demo.repository;

import com.demo.entity.Inflation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository ()
public class MySqlInflationRepo implements InflationRepo{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Inflation> all() {
        String sql ="select * from inflation";
        List<Inflation> result = jdbcTemplate.query(sql, new InflationMapper());
        return result;
    }


    @Override
    public int count() {
        String sql ="select count(*) as Total from inflation";
        int result= jdbcTemplate.queryForObject(sql, Integer.class);
        return result;
    }

    @Override
    public Inflation find(int year) {
        String sql ="select * from inflation where year = ?";
        try {
            Inflation result = jdbcTemplate.queryForObject(sql, new InflationMapper(), year);
            return result;
        }
        catch (DataAccessException ex)
        {
            //TODO Logging
            return null;
        }

    }

    @Override
    public void insert(Inflation inflation) {
        String sql ="insert into inflation(year,inflation,average_floor_price) values (?, ?, ?)";
        jdbcTemplate.update(sql, inflation.getYear(),inflation.getInflation(), inflation.getAverageFloorPrice());
    }

    @Override
    public void update(Inflation inflation) {
        String sql ="update inflation set inflation=?, average_floor_price = ? where year = ?";
        jdbcTemplate.update(sql, inflation.getInflation(), inflation.getAverageFloorPrice(),inflation.getYear());


    }

    @Override
    public void delete(int year) {
        String sql ="delete from inflation  where year = ?" ;
        jdbcTemplate.update(sql, year);
    }

    private static final class InflationMapper implements RowMapper<Inflation> {

        @Override
        public Inflation mapRow(ResultSet rs, int rowNum) throws SQLException {
            //mapping the sql field to our entity field
            return new Inflation(
                    rs.getInt("year"),
                    rs.getFloat("inflation"),
                    rs.getDouble("average_floor_price")
            );

        }
    }



}
