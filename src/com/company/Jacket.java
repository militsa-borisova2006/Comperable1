package com.company;

public class Jacket extends Clothes implements Comparable<Jacket> {
    private String brand;
    private String season;
    private double price;

    public Jacket(String brand, String season, double price) {
        this.brand = brand;
        this.season = season;
        this.price = price;
    }

    public Jacket() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "brand='" + brand + '\'' +
                ", season='" + season + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Jacket o) {
        if (this.getPrice() > o.getPrice())
            return 1;
        else if (this.getPrice() < o.getPrice())
            return -1;
        else
            return 0;
    }

    @Override
    public void sell() {
        System.out.println("Jacket is sold for 5lv.");
    }
}
