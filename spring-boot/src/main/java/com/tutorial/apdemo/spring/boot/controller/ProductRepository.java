package com.tutorial.apdemo.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(path = "/api/v1/Product")
public class ProductRepository {
    @Autowired
    private ProductRepository repository;

    @GetMapping("")
    List<ProductRepository> getAllProduct(){
        return repository.findAll();
    }

    private List<ProductRepository> findAll() {
        return null;
    }
}
