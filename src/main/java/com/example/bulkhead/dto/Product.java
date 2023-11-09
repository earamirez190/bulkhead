package com.example.bulkhead.dto;


public class Product {

    private int productId;
    private String description;
    private double price;

    public Product(int productId, String description, double price) {
        this.productId = productId;
        this.description = description;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}