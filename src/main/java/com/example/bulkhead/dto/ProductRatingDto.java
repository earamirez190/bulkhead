package com.example.bulkhead.dto;


import java.util.List;

public class ProductRatingDto {

    private double avgRating;
    private List<ReviewDto> reviews;

    public ProductRatingDto() {
    }

    public ProductRatingDto(double avgRating, List<ReviewDto> reviews) {
        this.avgRating = avgRating;
        this.reviews = reviews;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public void setReviews(List<ReviewDto> reviews) {
        this.reviews = reviews;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public List<ReviewDto> getReviews() {
        return reviews;
    }
}