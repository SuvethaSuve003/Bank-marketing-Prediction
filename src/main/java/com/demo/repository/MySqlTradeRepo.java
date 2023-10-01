package com.demo.repository;

import com.demo.entity.Apartment;
import com.demo.entity.Inflation;
import com.demo.entity.Person;
import com.demo.entity.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class MySqlTradeRepo implements TradeRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Trade> all() {
        String sql ="select * from vw_trade";
        List<Trade> result = jdbcTemplate.query(sql, new TradeMapper());
        return result;

    }

    @Override
    public Trade find(int id) {
        String sql ="select * from vw_trade where trade_id = ?";
        try {
            Trade result = jdbcTemplate.queryForObject(sql, new TradeMapper(), id);
            return result;
        }
        catch (DataAccessException ex)
        {
            //TODO Logging
            return null;
        }
    }

    @Override
    public int count() {
     int result=  jdbcTemplate.queryForObject("select count(*) from vw_trade", Integer.class);
     return result;
    }

    @Override
    public void save(Trade trade) {
        String sql ="insert into Trade(apartment,seller, price, completed_on) values (?, ?, ?,?)";
        jdbcTemplate.update(sql, trade.getApartment().getId(),trade.getSeller().getId(),
                trade.getPrice(), trade.getCompletedOn());

    }

    @Override
    public void update(Trade trade) {

    }

    @Override
    public void delete(int id) {

    }

    private static final class TradeMapper implements RowMapper<Trade> {
        @Override
        public Trade mapRow(ResultSet rs, int rowNum) throws SQLException {
            Trade trade = new Trade();

            trade.setId(rs.getInt("trade_id"));//mapping field to model
            trade.setPrice(rs.getDouble("price"));
            trade.setCompletedOn(rs.getDate("completed_on").toLocalDate());

            Apartment apartment = new Apartment(
                    rs.getInt("apartment"),
                    rs.getInt("number"),
                    rs.getInt("area"),
                    rs.getInt("house"),
                    rs.getInt("owner")

            );
            trade.setApartment(apartment);
            Person person = new Person(
                    rs.getInt("seller"),
                    rs.getString("name"),
                    rs.getDate("birthdate").toLocalDate()
            );
            trade.setSeller(person);
            return trade;

        }
    }
}
