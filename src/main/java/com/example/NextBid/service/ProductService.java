package com.example.NextBid.service;

import com.example.NextBid.entity.Product;

import java.util.List;

public interface ProductService {
    Product registerProduct(Product product);
    List<Product> getAllProducts();
    // 다른 필요한 메서드 정의
}
