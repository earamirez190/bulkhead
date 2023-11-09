package com.example.bulkhead.service;

import com.example.bulkhead.dto.ProductRatingDto;
import com.example.bulkhead.dto.ReviewDto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RatingService {

    private Map<Integer, ProductRatingDto> map;

    @PostConstruct
    private void init(){

        // product 1
        ProductRatingDto ratingDto1 = new ProductRatingDto(4.5,
                List.of(
                        new ReviewDto("vins", "guru", 1, 5, "excellent"),
                        new ReviewDto("marshall", "mathers", 1, 4, "decent")
                )
        );

        // product 2
        ProductRatingDto ratingDto2 = new ProductRatingDto(4,
                List.of(
                        new ReviewDto("slim", "shady", 2, 5, "best"),
                        new ReviewDto("fifty", "cent", 2, 3, "")
                )
        );

        // map as db
        this.map = Map.of(
                1, ratingDto1,
                2, ratingDto2
        );

    }

    public ProductRatingDto getRatingForProduct(int productId) {
        return this.map.getOrDefault(productId, new ProductRatingDto());
    }
}
