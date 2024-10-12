package com.example.NextBid.controller;

import com.example.NextBid.entity.Product;
import com.example.NextBid.service.ProductService;
import lombok.RequiredArgsConstructor; // 롬복 어노테이션 추가
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor // 자동으로 생성자 주입을 생성
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Product> registerProduct(@RequestBody Product product) {
        Product savedProduct = productService.registerProduct(product);
        return ResponseEntity.ok(savedProduct);
    }
}
