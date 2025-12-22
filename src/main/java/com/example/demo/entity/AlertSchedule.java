package com.example.demo.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "alert_schedules")
public class AlertSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "warranty_id", nullable = false)
    @JsonIgnore
    private Warranty warranty;

    private Integer daysBeforeExpiry;

    private Boolean enabled;

    // No-argument constructor
    public AlertSchedule() {}

    // All-argument constructor
    public AlertSchedule(Long id, Warranty warranty, Integer daysBeforeExpiry, Boolean enabled) {
        this.id = id;
        this.warranty = warranty;
        this.daysBeforeExpiry = daysBeforeExpiry;
        this.enabled = enabled;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Warranty getWarranty() { return warranty; }
    public void setWarranty(Warranty warranty) { this.warranty = warranty; }

    public Integer getDaysBeforeExpiry() { return daysBeforeExpiry; }
    public void setDaysBeforeExpiry(Integer daysBeforeExpiry) { this.daysBeforeExpiry = daysBeforeExpiry; }

    public Boolean getEnabled() { return enabled; }
    public void setEnabled(Boolean enabled) { this.enabled = enabled; }
}
