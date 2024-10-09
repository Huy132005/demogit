package com.tutorial.apdemo.spring.boot.Model;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductRepository {
    private  Long id;
    private String productName;
    private int year;
    private int price;
    private String url;



    public ProductRepository(Long id, String productName, int year, int price, String url) {
        this.id = id;
        this.productName = productName;
        this.year = year;
        this.price = price;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", year=" + year +
                ", price='" + price + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public String save(ProductRepository productB) {
        return null;

    }
}
