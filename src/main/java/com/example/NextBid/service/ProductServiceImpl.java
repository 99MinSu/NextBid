package com.example.NextBid.service;

import com.example.NextBid.entity.Product;
import com.example.NextBid.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product registerProduct(Product product) {
        // 필요한 유효성 검사 및 비즈니스 로직을 추가할 수 있습니다.
        return productRepository.save(product); // 상품 등록
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll(); // 모든 상품 조회
    }

    // 필요한 추가 메서드를 구현할 수 있습니다.
}
