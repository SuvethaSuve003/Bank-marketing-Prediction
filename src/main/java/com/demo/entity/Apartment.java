package com.demo.entity;

public class Apartment {
    private int id;
    private int number;
    private int area;
    private int house;
    private int owner;

    public Apartment() {
    }

    public Apartment(int id, int number, int area, int house, int owner) {
        this.id = id;
        this.number = number;
        this.area = area;
        this.house = house;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", number=" + number +
                ", area=" + area +
                ", house=" + house +
                ", owner=" + owner +
                '}';
    }
}
