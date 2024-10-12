package com.example.NextBid.repository;

import com.example.NextBid.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // 필요에 따라 추가적인 쿼리 메소드를 정의할 수 있습니다.
}