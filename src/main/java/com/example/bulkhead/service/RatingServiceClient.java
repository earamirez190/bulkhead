package com.example.bulkhead.service;

import com.example.bulkhead.dto.ProductRatingDto;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class RatingServiceClient {
    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${rating.service.endpoint}")
    private String ratingService;

    @Bulkhead(name = "ratingService", fallbackMethod = "getDefault")
    public ProductRatingDto getProductRatingDto(int productId){
        return this.restTemplate.getForEntity(this.ratingService + productId, ProductRatingDto.class)
                .getBody();
    }

    public ProductRatingDto getDefault(int productId, Throwable throwable){
        return new ProductRatingDto(0, Collections.emptyList());
    }
}
