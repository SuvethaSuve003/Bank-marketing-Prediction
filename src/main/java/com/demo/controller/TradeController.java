package com.demo.controller;

import com.demo.entity.Trade;
import com.demo.exceptions.InvalidYearException;
import com.demo.exceptions.TradeException;
import com.demo.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("trade-api")
@CrossOrigin("*")
public class TradeController {
    private final Logger logger;
    public TradeController(){
        logger= Logger.getLogger(TradeController.class.getName());
    }

    @Autowired
    TradeService tradeService;
    @RequestMapping(method = RequestMethod.GET, value="count")
    public int count()
    {
        logger.info("Count invoked");
        return tradeService.count();
    }


    @RequestMapping(method = RequestMethod.GET, value="all")
    public List<Trade> all()
    {
        logger.info("All invoked");
        return tradeService.all();
    }

    @RequestMapping(method = RequestMethod.GET, value="find/{id}")
    public Trade find(@PathVariable int id)
    {
        logger.info("find invoked");
        return tradeService.find(id);
    }
    @RequestMapping(method = RequestMethod.POST, value="save")
    public void Save(@RequestBody Trade trade)
    {
        logger.info("save invoked");
         tradeService.save(trade);
    }

    //controller advice
    @ExceptionHandler({ IllegalArgumentException.class})
    public ResponseEntity<String> handleExc(IllegalArgumentException e)
    {
        logger.warning(String.format("Exception thrown %s", e.getMessage()));
        return ResponseEntity.badRequest().body( e.getMessage());

    }



}
