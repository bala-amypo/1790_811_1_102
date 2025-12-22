package com.example.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "warranties")
public class Warranty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    private LocalDate purchaseDate;

    private LocalDate expiryDate;

    @Column(unique = true, nullable = false)
    private String serialNumber;

    @OneToMany(mappedBy = "warranty", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<AlertSchedule> alertSchedules;

    @OneToMany(mappedBy = "warranty", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<AlertLog> alertLogs;

    // No-argument constructor
    public Warranty() {}

    // All-argument constructor
    public Warranty(Long id, User user, Product product, LocalDate purchaseDate,
                    LocalDate expiryDate, String serialNumber,
                    List<AlertSchedule> alertSchedules, List<AlertLog> alertLogs) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.purchaseDate = purchaseDate;
        this.expiryDate = expiryDate;
        this.serialNumber = serialNumber;
        this.alertSchedules = alertSchedules;
        this.alertLogs = alertLogs;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public LocalDate getPurchaseDate() { return purchaseDate; }
    public void setPurchaseDate(LocalDate purchaseDate) { this.purchaseDate = purchaseDate; }

    public LocalDate getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }

    public String getSerialNumber() { return serialNumber; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber; }

    public List<AlertSchedule> getAlertSchedules() { return alertSchedules; }
    public void setAlertSchedules(List<AlertSchedule> alertSchedules) { this.alertSchedules = alertSchedules; }

    public List<AlertLog> getAlertLogs() { return alertLogs; }
    public void setAlertLogs(List<AlertLog> alertLogs) { this.alertLogs = alertLogs; }
}
