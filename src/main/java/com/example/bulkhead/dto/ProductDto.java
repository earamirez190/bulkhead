package com.example.bulkhead.dto;

public class ProductDto {

    private int productId;
    private String description;
    private double price;
    private ProductRatingDto productRating;

    public ProductDto(int productId, String description, double price, ProductRatingDto productRating) {
        this.productId = productId;
        this.description = description;
        this.price = price;
        this.productRating = productRating;
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

    public ProductRatingDto getProductRating() {
        return productRating;
    }
}