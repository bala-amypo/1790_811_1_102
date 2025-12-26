package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "alert_schedules")
public class AlertSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int daysBeforeExpiry;   // 🔴 REQUIRED

    public AlertSchedule() {}

    public Long getId() {
        return id;
    }

    public int getDaysBeforeExpiry() {   // ✅ REQUIRED
        return daysBeforeExpiry;
    }

    public void setDaysBeforeExpiry(int daysBeforeExpiry) {
        this.daysBeforeExpiry = daysBeforeExpiry;
    }
}
