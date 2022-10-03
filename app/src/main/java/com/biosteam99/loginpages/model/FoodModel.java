package com.biosteam99.loginpages.model;

public class FoodModel {

    private String name;
    private String desc;
    private double price;
    private String image;
    private String restaurantName;
    private String restaurantLocation;

    public FoodModel() {
    }

    public FoodModel(String name, String desc, double price, String image, String restaurantName, String restaurantLocation) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.image = image;
        this.restaurantName = restaurantName;
        this.restaurantLocation = restaurantLocation;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }
}
