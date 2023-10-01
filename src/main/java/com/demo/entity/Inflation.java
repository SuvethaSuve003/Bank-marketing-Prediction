package com.demo.entity;

public class Inflation {
    private int year;
    private float inflation;
    private double averageFloorPrice;

    public Inflation() {
    }

    public Inflation(int year, float inflation, double averageFloorPrice) {
        this.year = year;
        this.inflation = inflation;
        this.averageFloorPrice = averageFloorPrice;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getInflation() {
        return inflation;
    }

    public void setInflation(float inflation) {
        this.inflation = inflation;
    }

    public double getAverageFloorPrice() {
        return averageFloorPrice;
    }

    public void setAverageFloorPrice(double averageFloorPrice) {
        this.averageFloorPrice = averageFloorPrice;
    }

    @Override
    public String toString() {
        return "Inflation{" +
                "year=" + year +
                ", inflation=" + inflation +
                ", averageFloorPrice=" + averageFloorPrice +
                '}';
    }
}
