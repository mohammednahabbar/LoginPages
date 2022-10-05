package com.biosteam99.loginpages.model;

public class FoodModel {

    private String name;
    private String desc;
    private String image;
    private String rNAme;
    private String rLocation;
    private double price;

    public FoodModel(String name, String desc, double price, String image, String rNAme, String rLocation) {
        this.name = name;
        this.desc = desc;
        this.image = image;
        this.rNAme = rNAme;
        this.rLocation = rLocation;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getrNAme() {
        return rNAme;
    }

    public void setrNAme(String rNAme) {
        this.rNAme = rNAme;
    }

    public String getrLocation() {
        return rLocation;
    }

    public void setrLocation(String rLocation) {
        this.rLocation = rLocation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
