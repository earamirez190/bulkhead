package com.example.bulkhead.service;

import com.example.bulkhead.dto.Product;
import com.example.bulkhead.dto.ProductDto;
import com.example.bulkhead.dto.ProductRatingDto;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private Map<Integer, Product> map;

    @Autowired
    private RatingServiceClient ratingServiceClient;

    @PostConstruct
    private void init(){
        this.map = Map.of(
                1, new Product(1, "Blood On The Dance Floor", 12.45),
                2, new Product(2, "The Eminem Show", 12.12)
        );
    }

    public ProductDto getProductDto(int productId){
        ProductRatingDto ratingDto = this.ratingServiceClient.getProductRatingDto(1);
        Product product = this.map.get(productId);
        return new ProductDto(productId, product.getDescription(), product.getPrice(), ratingDto);
    }

    public List<ProductDto> getAllProducts(){
        return this.map.values()
                .stream()
                .map(product -> new ProductDto(product.getProductId(), product.getDescription(), product.getPrice(), new ProductRatingDto(0, Collections.emptyList())))
                .collect(Collectors.toList());
    }
}
