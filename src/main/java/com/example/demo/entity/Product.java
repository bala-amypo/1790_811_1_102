package com.example.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String brand;

    @Column(nullable = false)
    private String modelNumber;

    @Column(nullable = false)
    private String category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Warranty> warranties;

    // No-argument constructor
    public Product() {}

    // All-argument constructor
    public Product(Long id, String name, String brand, String modelNumber, String category, List<Warranty> warranties) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.category = category;
        this.warranties = warranties;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModelNumber() { return modelNumber; }
    public void setModelNumber(String modelNumber) { this.modelNumber = modelNumber; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public List<Warranty> getWarranties() { return warranties; }
    public void setWarranties(List<Warranty> warranties) { this.warranties = warranties; }
}
