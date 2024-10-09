package com.tutorial.apdemo.spring.boot.repositpries;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositpries extends JpaRepository<ProductRepositpries, Long> {
}
