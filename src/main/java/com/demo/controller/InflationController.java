package com.demo.controller;

import com.demo.entity.Inflation;
import com.demo.exceptions.InvalidYearException;
import com.demo.service.InflationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@CrossOrigin
@RequestMapping("inflation-api")
public class InflationController {
    @Autowired
    InflationService inflationService;
    private final Logger logger;

    public InflationController(){
        logger= Logger.getLogger(InflationController.class.getName());
    }




    @RequestMapping(method = RequestMethod.GET, value = "count" )
    public int count()
    {
        return  inflationService.count();
    }

    @RequestMapping(method = RequestMethod.GET, value = "all" )
    public List<Inflation> all()
    {
        return  inflationService.all();
    }

    @RequestMapping(method = RequestMethod.GET, value = "find/{year}" )
    public Inflation find(@PathVariable int year)
    {
        return  inflationService.find(year);
    }

    @RequestMapping(method = RequestMethod.POST, value = "insert" )
    public void insert(@RequestBody Inflation inflation)
    {
        inflationService.insert( inflation);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "update" )
    public void update(@RequestBody Inflation inflation)
    {
        inflationService.update( inflation);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "delete/{year}" )
    public void delete(@PathVariable int year)
    {
        inflationService.delete( year);
    }

    //controller advice
    @ExceptionHandler({InvalidYearException.class})
    public ResponseEntity<String> handleExc(InvalidYearException e)
    {
        logger.warning(String.format("Exception thrown %s", e.getMessage()));
        return ResponseEntity.badRequest().body( e.getMessage());

    }



}
