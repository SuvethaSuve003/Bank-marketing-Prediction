package com.demo.entity;

import java.time.LocalDate;
//dto, entity, model data
public class Trade {
    private int id;

    private Apartment apartment;
    private Person seller;
    private double price;
    private LocalDate completedOn;

    public Trade() {
    }

    public Trade(int id, Apartment apartment, Person seller, double price, LocalDate completedOn) {
        this.id = id;
        this.apartment = apartment;
        this.seller = seller;
        this.price = price;
        this.completedOn = completedOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public Person getSeller() {
        return seller;
    }

    public void setSeller(Person seller) {
        this.seller = seller;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getCompletedOn() {
        return completedOn;
    }

    public void setCompletedOn(LocalDate completedOn) {
        this.completedOn = completedOn;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", apartment=" + apartment +
                ", seller=" + seller +
                ", price=" + price +
                ", completedOn=" + completedOn +
                '}';
    }
}
