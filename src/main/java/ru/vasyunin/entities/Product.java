package com.geekbrains.entities;

public class Product {
    Long id;
    String title;
    Long price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Product(Long id, String title, Long price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Product() {
    }
}
