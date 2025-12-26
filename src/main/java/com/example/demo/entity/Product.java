package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String modelNumber;   // 🔴 REQUIRED

    private String category;      // 🔴 REQUIRED

    public Product() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModelNumber() {   // ✅ REQUIRED
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getCategory() {   // ✅ REQUIRED
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
